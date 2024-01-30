package Java26;

import Java25Utils.Constants;
import Java25Utils.ExcelReader;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class E4Excel {
    public static void main(String[] args) throws IOException {


        // Example For How We simply can use ExcelReader method here
        List<Map<String,String>> data= ExcelReader.read(Constants.EXCEL_FILE_PATH,"Sheet1");// 2 parameters 1>>path+name of sheet

        System.out.println(  data.get(0)); //use "get Method" because it is list

        System.out.println(  data.get(1));// every entire map is complete row (give me map(row) in index 1)

          System.out.println(  data.get(3).get(("FirstName"))); // if you need specific value< because of map we can pass key (that header)>
        // Write code to print all the information from this excel use Read method from ExcelReader


        // you can convert to Set Or lambda
       data.forEach(x->x.forEach((k,v)->{    //forEach x >> represent to the list + forEach k,v >> represent entire map
            System.out.println(k+ " "+ v);    // nested lambda
        }));

        data.forEach(x-> System.out.println(x));


     data.forEach(System.out::println); // method reference

    }
}
