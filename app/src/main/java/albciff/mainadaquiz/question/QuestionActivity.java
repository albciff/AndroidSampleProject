package albciff.mainadaquiz.question;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import albciff.mainadaquiz.Clic;
import albciff.mainadaquiz.R;
import albciff.mainadaquiz.json.Answer;
import albciff.mainadaquiz.json.Level;

/**
 * Created by Albert on 14/02/2017.
 */

public class QuestionActivity extends Activity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {

            super.onCreate(savedInstanceState);
            setContentView(R.layout.question_layout);

            Intent intent = getIntent();
            // recuperem el nivell que arriba des del main activity...
            Level level = (Level) intent.getSerializableExtra("level");

            // sounds... aqui?
            final MediaPlayer mpe = MediaPlayer.create(this, R.raw.error);
            final MediaPlayer mpo = MediaPlayer.create(this, R.raw.ok);

            // buttons
            Button firstAnswer = (Button) findViewById(R.id.button1);
            Button secondAnswer = (Button) findViewById(R.id.button2);
            Button thirdAnswer = (Button) findViewById(R.id.button3);

            // pregunta
            TextView questionText = (TextView) findViewById(R.id.question);
            // posem la pregunta
            questionText.setText(level.question);

            // imatge de la pregunta
            ImageView questionImage = (ImageView) findViewById(R.id.imageView3);
            // posem la imatge
            Picasso.with(getBaseContext())
                    .load(level.imageUrl)
                    .fit()
                    .into(questionImage);

            // recuperem les respostes
            List<Answer> answers = level.answeres;

            // text amb les respostes
            firstAnswer.setText(answers.get(0).text);
            secondAnswer.setText(answers.get(1).text);
            thirdAnswer.setText(answers.get(2).text);

            // funcions associades al click del botó
            firstAnswer.setOnClickListener(new Clic(answers.get(0).isCorrect ? mpo : mpe,answers.get(0).isCorrect));
            secondAnswer.setOnClickListener(new Clic(answers.get(1).isCorrect ? mpo : mpe,answers.get(1).isCorrect));
            thirdAnswer.setOnClickListener(new Clic(answers.get(2).isCorrect ? mpo : mpe,answers.get(2).isCorrect));
        }
}
