package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelReader {

    public static String readCell(String filePath, String sheetName, int rowIndex, int colIndex) throws IOException {
        FileInputStream inputStream = null;
        XSSFWorkbook workbook = null;
        String cellValue = "";

        try {
            inputStream = new FileInputStream(filePath);
            workbook = new XSSFWorkbook(inputStream);

            XSSFSheet sheet = workbook.getSheet(sheetName);
            if (sheet != null) {
                XSSFRow row = sheet.getRow(rowIndex);
                if (row != null) {
                    XSSFCell cell = row.getCell(colIndex);
                    if (cell != null) {
                        DataFormatter formatter = new DataFormatter();
                        cellValue = formatter.formatCellValue(cell);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            LoggerHandler.error("File not found: " + filePath);
            LoggerHandler.error(e.getMessage());
            Reporter.logWarn("File not found: " + filePath);
            Reporter.logWarn(e.getMessage());
        } catch (IOException e) {
            LoggerHandler.error("Error reading Excel file: " + filePath);
            LoggerHandler.error(e.getMessage());
            Reporter.logWarn("Error reading Excel file: " + filePath);
            Reporter.logWarn(e.getMessage());
        } finally {
            if (workbook != null) workbook.close();
            if (inputStream != null) inputStream.close();
        }
        return cellValue;
    }

    
    public static void writeCell(String filePath, String sheetName, int rowIndex, int colIndex, String value) throws IOException {
        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;
        XSSFWorkbook workbook = null;

        try {
            inputStream = new FileInputStream(filePath);
            workbook = new XSSFWorkbook(inputStream);

            XSSFSheet sheet = workbook.getSheet(sheetName);
            if (sheet == null) {
                sheet = workbook.createSheet(sheetName);
            }

            XSSFRow row = sheet.getRow(rowIndex);
            if (row == null) {
                row = sheet.createRow(rowIndex);
            }

            XSSFCell cell = row.getCell(colIndex);
            if (cell == null) {
                cell = row.createCell(colIndex);
            }

            cell.setCellValue(value);

            // Write changes to the file
            outputStream = new FileOutputStream(filePath);
            workbook.write(outputStream);
        } catch (FileNotFoundException e) {
            LoggerHandler.error("File not found: " + filePath);
            LoggerHandler.error(e.getMessage());
            Reporter.logWarn("File not found: " + filePath);
            Reporter.logWarn(e.getMessage());
        } catch (IOException e) {
            System.err.println("Error writing to Excel file: " + filePath);
            LoggerHandler.error("Error writing to Excel file: " + filePath);
            LoggerHandler.error(e.getMessage());
            Reporter.logWarn("Error writing to Excel file: " + filePath);
            Reporter.logWarn(e.getMessage());
        } finally {
            if (workbook != null) workbook.close();
            if (inputStream != null) inputStream.close();
            if (outputStream != null) outputStream.close();
        }
    }
}