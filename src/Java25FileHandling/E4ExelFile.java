package Java25FileHandling;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class E4ExelFile {
    public static void main(String[] args) throws IOException {

        //Location of the file
        String path="C:\\Users\\Germe\\IdeaProjects\\JavaProject\\Files\\Batch18.xlsx";
        //Navigate this location by fileInput class
        FileInputStream fis=new FileInputStream(path);

        //This is that special class that we need to handle excel files
        XSSFWorkbook excel=new XSSFWorkbook(fis);
//To access the sheet from that file
        Sheet sheet=excel.getSheet("Sheet1");
        // Accessing the rows from above sheet
        Row row0= sheet.getRow(1);
        // Accessing the columns from above rows

        Cell cell1=row0.getCell(1);  // colum in excel is Cell
        System.out.println(cell1);


    }
}






