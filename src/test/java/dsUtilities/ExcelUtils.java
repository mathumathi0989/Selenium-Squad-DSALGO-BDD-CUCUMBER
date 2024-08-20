package dsUtilities;


import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExcelUtils {
    public static List<String> readPythonCodeFromExcel(String filePath,int i ) throws IOException {
        List<String> pythonCodes = new ArrayList<>();
        FileInputStream fis = new FileInputStream(filePath);
        Workbook workbook = new XSSFWorkbook(fis);
        Sheet sheet = workbook.getSheetAt(0); // Assuming data is in the first sheet

        for (Row row : sheet) {
            Cell cell = row.getCell(i); // Read from the first column
            if (cell != null) {
                pythonCodes.add(cell.getStringCellValue());
            }
        }

        workbook.close();
        fis.close();
        return pythonCodes;
    }
}

