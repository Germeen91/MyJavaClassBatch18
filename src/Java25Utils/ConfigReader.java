package Java25Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    //class has method to help us read the data from File
    public static String read(String key) throws IOException {

        return read(key, Constants.CONFIG_FILE_PATH);
    }

        public static String read(String key,String path)  {

            // same steps with diff path
           Properties properties = new Properties(); // to can use it as return / if i put it inside try block it will be local Var and i can not access it outside as return

            try( FileInputStream fis = new FileInputStream(path)) { //finally with recourse
                properties.load(fis);

            }catch (IOException e){
                e.printStackTrace();
            }

        return properties.getProperty(key);



        /*why we have decided to create a separate class and why we are calling it configurator,
         and why we are creating this method inside it? Why not? Every time we repeat this code.
whenever we need to file exactly, we create methods so that we can reuse code again. And again, for example.*/

    }
}
