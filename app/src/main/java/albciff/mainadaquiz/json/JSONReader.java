package albciff.mainadaquiz.json;

import com.google.gson.Gson;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;

/**
 * Created by Albert on 13/02/2017.
 */

public class JSONReader {

    public GameJSON readJSON(InputStream json) throws UnsupportedEncodingException {

        Reader reader = new InputStreamReader(json, "UTF-8");

        Gson gson = new Gson();
        GameJSON game = gson.fromJson(reader, GameJSON.class );

        return game;
    }
}
