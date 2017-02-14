package albciff.mainadaquiz.json;

import org.junit.Test;

import java.io.FileInputStream;

/**
 * Created by Albert on 13/02/2017.
 */

public class JSONReaderTest {

    @Test
    public void parseGame() throws Exception {
        FileInputStream fis = new FileInputStream("C:/Users/Albert/AndroidStudioProjects/MainadaQuiz/app/src/main/res/raw/game1.json");
        JSONReader jsonReader = new JSONReader();
        jsonReader.readJSON(fis);
    }
}
