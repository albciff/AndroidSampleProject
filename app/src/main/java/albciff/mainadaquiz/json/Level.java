package albciff.mainadaquiz.json;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Albert on 13/02/2017.
 */

public class Level implements Serializable {

        @SerializedName("question")
        public String question;

        @SerializedName("imageUrl")
        public String imageUrl;

        @SerializedName("answers")
        public List<Answer> answeres;
}
