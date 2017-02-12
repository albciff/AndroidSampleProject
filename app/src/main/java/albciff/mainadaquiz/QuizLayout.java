package albciff.mainadaquiz;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class QuizLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_layout);

        // sounds... aqui?
        final MediaPlayer mpe = MediaPlayer.create(this, R.raw.error);
        final MediaPlayer mpo = MediaPlayer.create(this, R.raw.ok);

        // buttons
        Button firstAnswer = (Button) findViewById(R.id.button1);
        Button secondAnswer = (Button) findViewById(R.id.button2);
        Button thirdAnswer = (Button) findViewById(R.id.button3);

        // text amb les respostes
        firstAnswer.setText("Tiranosaurio");
        secondAnswer.setText("Carnotauro");
        thirdAnswer.setText("Aransaurus");

        // funcions associades al click del botó
        firstAnswer.setOnClickListener(new FailClic(mpe));
        secondAnswer.setOnClickListener(new CorrectClic(mpo));
        thirdAnswer.setOnClickListener(new FailClic(mpe));

    }
}
