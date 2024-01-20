package Java25FileHandling;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class E5ExcelFile {
    public static void main(String[] args) throws IOException {

       var path="C:\\Users\\Germe\\IdeaProjects\\JavaProject\\Files\\Batch18.xlsx";
        //Navigate this location by fileInput class
        var fis=new FileInputStream(path);
//This is that special class that we need to handle excel files

        var excel=new XSSFWorkbook(fis);
        var sheet=excel.getSheet("Sheet1");
        int noOfRows=sheet.getPhysicalNumberOfRows();// give that rows has data not empty

        for (int i=0; i<noOfRows; i++){// give me data of rows
            Row row= sheet.getRow(i);

            int noOfCol=row.getPhysicalNumberOfCells();
            for (int p=0; p<noOfCol; p++){
                System.out.print(row.getCell(p)+" ");
            }

            System.out.println();
        }






    }
}
