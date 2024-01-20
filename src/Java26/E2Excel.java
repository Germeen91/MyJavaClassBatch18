package Java26;

import Java25Utils.Constants;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class E2Excel {
    public static void main(String[] args) throws IOException {

        FileInputStream fis=new FileInputStream(Constants.EXCEL_FILE_PATH); //use the path directly form constants

        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fis);
Sheet sheet=xssfWorkbook.getSheet("Sheet1");
int noOfActualRowWithData=sheet.getPhysicalNumberOfRows();
for (int i=0; i<noOfActualRowWithData ;i++){

    Row row= sheet.getRow(i);
    int noOfActualCellWithData=row.getPhysicalNumberOfCells();
    for (int p=0; p<noOfActualCellWithData; p++){

        Cell cell=row.getCell(p);
        System.out.print(cell+" ");
    }
    System.out.println();
}

    }
}
