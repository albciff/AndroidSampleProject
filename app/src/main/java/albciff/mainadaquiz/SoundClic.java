package albciff.mainadaquiz;

import android.media.MediaPlayer;
import android.view.View;

/**
 * Created by Albert on 12/02/2017.
 */

public abstract class SoundClic implements View.OnClickListener {

    protected MediaPlayer mp = null;

    public SoundClic(MediaPlayer mp){
        this.mp = mp;
    }

}
