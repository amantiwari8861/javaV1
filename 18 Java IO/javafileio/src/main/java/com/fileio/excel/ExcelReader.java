package com.fileio.excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
    private final String FILE_NAME;
    private Workbook workbook;

    public ExcelReader(String filename) {
        FILE_NAME = filename;
    }

    public void read() {
        try {
            FileInputStream fileInputStream = new FileInputStream(FILE_NAME);
            if (FILE_NAME.endsWith(".xls")) {
                workbook = new HSSFWorkbook(fileInputStream); // For XLS files
            } else if (FILE_NAME.endsWith(".xlsx")) {
                workbook = new XSSFWorkbook(fileInputStream); // For XLSX files
            } else {
                System.out.println("Unsupported file format");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void printData() {
        if (workbook != null) {
            Sheet sheet = workbook.getSheetAt(0); // Assuming you want to read the first sheet
            for (Row row : sheet) {
                for (Cell cell : row) {
                    System.out.print(cell.toString() + "\t");
                }
                System.out.println();
            }
        }
    }

    public void close() {
        if (workbook != null) {
            try {
                workbook.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

