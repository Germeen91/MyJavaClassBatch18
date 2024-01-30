package Java25FileHandling;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Try {
    public static void main(String[] args) throws IOException {




        String path="C:\\Users\\Germe\\IdeaProjects\\JavaProject\\Files\\Batch18.xlsx";

        FileInputStream fis=new FileInputStream(path);
        XSSFWorkbook excel=new XSSFWorkbook(fis);
        Sheet sheet=excel.getSheet("Sheet1");
        int rows= sheet.getPhysicalNumberOfRows();

        List<Map<String,String>> excelData=new ArrayList<>();

        Row header=sheet.getRow(0);

        for (int i = 0; i <rows ; i++) {
            Row row= sheet.getRow(i);

            Map<String,String> rowData=new LinkedHashMap<>();

            int cells=row.getPhysicalNumberOfCells();
            for (int j = 0; j <cells ; j++) {
                String key=header.getCell(j).toString();
                String value=row.getCell(j).toString();
                rowData.put(key,value);
            }
            excelData.add(rowData);

        }

        System.out.println(excelData);


    }
}
