import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ReadExcel {

    public static void main(String[] arg) throws IOException {
        ReadExcel readExcel = new ReadExcel();
        List<String> username = readExcel.getRowAndColumn("username");
        System.out.println("--------------User names--------------");
        for(String user: username){
            System.out.println(user);
        }
        System.out.println("--------------Phone--------------");
        List<String> passwordMap = readExcel.getRowAndColumn("phone");
        for(String pass: passwordMap){
            System.out.println(pass);
        }
    }
        public List<String> getRowAndColumn(String columnName) throws IOException {
            String filePath = System.getProperty("user.dir")+"/src/demo.xls";
            FileInputStream fis = new FileInputStream(filePath);
            
            HSSFWorkbook wb = new HSSFWorkbook(fis);
            HSSFSheet sheet = wb.getSheetAt(0);
            Map<String, Integer> map = new TreeMap<>();

            outerloop:
            for(int i = 0; i<sheet.getLastRowNum();i++){
                HSSFRow row = sheet.getRow(i);
                for(int j = 0; j<row.getLastCellNum();j++) {
                    HSSFCell cell = row.getCell(j);
                    Object value = cell.getStringCellValue();

                    if(value.equals(columnName)){
                        map.put("row",i);
                        map.put("column",j);
                        break outerloop;
                    }
                }
            }

            List<String> columnValue = new ArrayList<>();
            int cellNum = map.get("column");
            for(int i = 1; i<sheet.getLastRowNum();i++){
                HSSFRow row = sheet.getRow(i);
                HSSFCell cell = row.getCell(cellNum);
                columnValue.add(cell.getStringCellValue());
            }
            return columnValue;

        }
}
