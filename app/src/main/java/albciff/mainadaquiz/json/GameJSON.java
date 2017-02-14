package albciff.mainadaquiz.json;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Albert on 13/02/2017.
 */

public class GameJSON implements Serializable {

    @SerializedName("levels")
    List<Level> levels;

    public List<Level> getLevels(){
        return levels;
    }
}
