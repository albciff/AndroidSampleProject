package albciff.mainadaquiz;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.io.UnsupportedEncodingException;
import java.util.List;

import albciff.mainadaquiz.json.Answer;
import albciff.mainadaquiz.json.GameJSON;
import albciff.mainadaquiz.json.JSONReader;
import albciff.mainadaquiz.json.Level;
import albciff.mainadaquiz.question.QuestionActivity;

public class QuizLayout extends AppCompatActivity {

    GameJSON game = null;
    int currentLevel = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_layout);

        JSONReader reader = new JSONReader();
        try {
            game = reader.readJSON(getResources().openRawResource(R.raw.game1));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        // seguent nivell
        startNextLevel();
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        // seguent nivell
        startNextLevel();

        // TODO: Controlar si no hi ha més nivells
    }

    private void startNextLevel(){

        currentLevel = currentLevel + 1;

        // levels hauria de ser un bucle! men...
        List<Level> levels = game.getLevels();

        if(currentLevel >= levels.size()){
            currentLevel = 0;
        }

        Intent myIntent = new Intent(QuizLayout.this, QuestionActivity.class);
        myIntent.putExtra("level", levels.get(currentLevel)); //Optional parameters
        QuizLayout.this.startActivity(myIntent);


    }
}
