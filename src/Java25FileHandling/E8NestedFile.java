package Java25FileHandling;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class E8NestedFile {
    public static void main(String[] args) throws IOException {


        var path="C:\\Users\\Germe\\IdeaProjects\\JavaProject\\Files\\Batch18.xlsx";

        var fis = new FileInputStream(path);
        var excel = new XSSFWorkbook(fis);
        var sheet = excel.getSheet("Sheet1");
        int noOfRows = sheet.getPhysicalNumberOfRows();
//we choose ArrayList to hold maps because Array it is fixed size means we can change value
        //But ArrayList fixed inside size
        List<Map<String, String>> excelData = new ArrayList<>(); //2-then create a list to collect all maps that has header + data person

        Row header = sheet.getRow(0);//we have to extract row in index0 of header to not repeat it , because we will reuse it again as keys for each map

        for (int i = 1; i < noOfRows; i++) {// we start from 1 because we skipped the header ,and header is index0
            Row row = sheet.getRow(i);  // get new row evey iterate

            Map<String, String> rowData = new LinkedHashMap<>();// 1-create a new separate map every time i get new row {row header is key always,value is row for each person}
            int noOfCol = row.getPhysicalNumberOfCells();

            for (int j = 0; j < noOfCol; j++) {//inner loop will go to execute 4 time as cell of header[fistName, last,age,salary]
                String key = header.getCell(j).toString();//4 time of header
                String value = row.getCell(j).toString();// 4 time of cell of row
                rowData.put(key, value);  // fill the map
            }
            excelData.add(rowData); // Add map in the List
        }
        System.out.println(excelData); //Print the List
    }


    }

