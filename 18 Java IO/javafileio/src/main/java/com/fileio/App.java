package com.fileio;

import com.fileio.excel.ExcelReader;

public class App 
{
    public static void main( String[] args )
    {
        System.setProperty("org.apache.logging.log4j.simplelog.StatusLogger.level", "OFF");
        ExcelReader excelReader=new ExcelReader("src\\main\\java\\com\\fileio\\excel\\Data.xlsx");
        excelReader.read();
        excelReader.printData();
        excelReader.close();
    }
}
