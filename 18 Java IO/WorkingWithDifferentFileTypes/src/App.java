// import csv.CsvReader;
// import msoffice.ExcelReader;
// import msoffice.MsWordReader;
// import json.JsonReader;

// public class App {
//     public static void main(String[] args) throws Exception 
//     {
        //CSV -> apache Commons-csv
        //MS OFFICE -> apache POI
        //XML -> DOM or JAXB
        //JSON -> Jackson or Gson

        // CsvReader csvLib=new CsvReader("src/csv/files/Data.csv");
        // csvLib.read();
        // csvLib.printData();
        // csvLib.close();
        // ExcelReader excelReader=null;
        // System.out.println("Reading xls ");
        // excelReader=new ExcelReader("src\\msoffice\\files\\Data.xls");
        // excelReader.read();
        // excelReader.printData();
        // excelReader.close();
        // System.out.println("Reading xlsx ");
        // excelReader=new ExcelReader("src\\msoffice\\files\\Data.xlsx");
        // excelReader.read();
        // excelReader.printData();
        // excelReader.close();
        // MsWordReader reader = new MsWordReader("src\\msoffice\\files\\Data.docx");
        // reader.readDocx();
        // JsonReader reader = new JsonReader("src\\json\\files\\Data.json");
        // reader.read();
        // reader.printData();
//     }
// }
/*
 Here are the Maven dependency tags for the libraries you mentioned:

1. Jackson (for JSON processing):
```xml
<dependency>
    <groupId>com.fasterxml.jackson.core</groupId>
    <artifactId>jackson-databind</artifactId>
    <version>2.13.1</version> <!-- Make sure to use the latest version -->
</dependency>
```

2. Gson (for JSON processing):
```xml
<dependency>
    <groupId>com.google.code.gson</groupId>
    <artifactId>gson</artifactId>
    <version>2.8.9</version> <!-- Make sure to use the latest version -->
</dependency>
```

3. Apache POI (for MS Office documents):
```xml
<dependency>
    <groupId>org.apache.poi</groupId>
    <artifactId>poi</artifactId>
    <version>5.2.0</version> <!-- Make sure to use the latest version -->
</dependency>
```

4. DOM (for XML processing) - No additional dependency needed as it's part of the Java standard library.

5. JAXB (for XML processing):
```xml
<dependency>
    <groupId>javax.xml.bind</groupId>
    <artifactId>jaxb-api</artifactId>
    <version>2.3.1</version> <!-- Make sure to use the latest version -->
</dependency>
```

6. Apache Commons CSV (for CSV processing):
```xml
<dependency>
    <groupId>org.apache.commons</groupId>
    <artifactId>commons-csv</artifactId>
    <version>1.8</version> <!-- Make sure to use the latest version -->
</dependency>
```

Make sure to check for the latest versions of these libraries and update the version numbers accordingly.
 */