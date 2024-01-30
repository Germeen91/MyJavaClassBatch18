package Java25Utils;

public class Constants {

// create class separate static to reuse when ever we need between class

    //static if we are not planning to change value
    //instance if we are planning to use same value common between all classes (will not plan to change)
    public static final String CONFIG_FILE_PATH=System.getProperty("user.dir")+"\\Files\\config.proporties";
    public static final String EXCEL_FILE_PATH=System.getProperty("user.dir")+"\\Files\\Batch18.xlsx";

   /* Why, we have created this constants file
    to keep all of the locations and other data
    in a single file in a single class.
    so that whenever I need this anywhere in my project I can simply*/

}
