package Java25Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    public static String read(String key) throws IOException {

        //Navigate from constant

        FileInputStream fis=new FileInputStream(Constants.CONFIG_FILE_PATH);  // same steps with diff path
        Properties properties=new Properties();
        properties.load(fis);

        return properties.getProperty(key);



        /*why we have decided to create a separate class and why we are calling it configurator,
         and why we are creating this method inside it? Why not? Every time we repeat this code.
whenever we need to file exactly, we create methods so that we can reuse code again. And again, for example.*/

    }
}
