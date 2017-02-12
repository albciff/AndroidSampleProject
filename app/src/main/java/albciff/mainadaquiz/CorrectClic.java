package albciff.mainadaquiz;

import android.media.MediaPlayer;
import android.view.View;

/**
 * Created by Albert on 12/02/2017.
 */

public class CorrectClic extends SoundClic {

    public CorrectClic(MediaPlayer mp) {
        super(mp);
    }

    public void onClick(View view){
        // sound?
        mp.start();
        // algun avis visual?

    }

}
