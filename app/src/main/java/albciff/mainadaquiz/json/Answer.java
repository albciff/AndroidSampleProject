package albciff.mainadaquiz.json;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by Albert on 13/02/2017.
 */

public class Answer implements Serializable {
    @SerializedName("text")
    public String text;

    @SerializedName("isCorrect")
    public boolean isCorrect;
}
