package albciff.mainadaquiz;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.view.View;

/**
 * Created by Albert on 12/02/2017.
 */

public class Clic extends SoundClic {

    private boolean isCorrectAnswer;

    public Clic(MediaPlayer mp, boolean isCorrectAnswer) {
        super(mp);
        this.isCorrectAnswer = isCorrectAnswer;
    }

    public void onClick(final View view){

        // algun avis visual
        view.setBackgroundColor(isCorrectAnswer ? Color.GREEN : Color.RED);

        // un cop ha acabat el so
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener(){
            @Override
            public void onCompletion(MediaPlayer mp) {
                view.post(new Runnable() {
                    @Override
                    public void run() {
                        if(isCorrectAnswer) {
                            // acabem l'activity
                            ((Activity) view.getContext()).finish();
                        }
                    }
                });
            }
        });

        // sound?
        mp.start();
    }
}
