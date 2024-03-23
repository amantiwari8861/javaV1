import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        String html = """
                <html lang="en">
                    <head>
                        <meta charset="UTF-8">
                        <meta name="viewport" content="width=device-width, initial-scale=1.0">
                        <title>Document</title>
                    </head>
                    <body>
                    <table cellspacing="0" cellpadding="8" align="Center" border="0" id="ctl00_ContentPlaceHolder1_gvDetail" style="color:#333333;border-width:2px;border-style:solid;font-family:Arial;width:100%;border-collapse:collapse;">
                    <tbody><tr align="center" valign="top" style="color:White;background-color:#0F5092;font-size:Medium;font-weight:bold;">
                        <th scope="col">COURSE</th><th scope="col">Asgn1</th><th scope="col">LAB1</th><th scope="col">LAB2</th><th scope="col">LAB3</th><th scope="col">LAB4</th><th scope="col">TERM END THEORY</th><th scope="col">STATUS</th>
                    </tr><tr align="center" valign="middle" style="background-color:#EFF3FB;font-size:Medium;font-weight:normal;">
                        <td>MCS031</td><td>82</td><td>#</td><td>#</td><td>#</td><td>#</td><td>50</td><td>COMPLETED</td>
                    </tr><tr align="center" valign="middle" style="background-color:White;border-color:#FFCCFF;font-size:Medium;font-weight:normal;">
                        <td>MCS032</td><td>74</td><td>#</td><td>#</td><td>#</td><td>#</td><td>59</td><td>COMPLETED</td>
                    </tr><tr align="center" valign="middle" style="background-color:#EFF3FB;font-size:Medium;font-weight:normal;">
                        <td>MCS033</td><td>86</td><td>#</td><td>#</td><td>#</td><td>#</td><td>76</td><td>COMPLETED</td>
                    </tr><tr align="center" valign="middle" style="background-color:White;border-color:#FFCCFF;font-size:Medium;font-weight:normal;">
                        <td>MCS034</td><td>84</td><td>#</td><td>#</td><td>#</td><td>#</td><td>46</td><td>COMPLETED</td>
                    </tr><tr align="center" valign="middle" style="background-color:#EFF3FB;font-size:Medium;font-weight:normal;">
                        <td>MCS035</td><td>82</td><td>#</td><td>#</td><td>#</td><td>#</td><td>56</td><td>COMPLETED</td>
                    </tr><tr align="center" valign="middle" style="background-color:White;border-color:#FFCCFF;font-size:Medium;font-weight:normal;">
                        <td>MCS041</td><td>84</td><td>#</td><td>#</td><td>#</td><td>#</td><td>51</td><td>COMPLETED</td>
                    </tr><tr align="center" valign="middle" style="background-color:#EFF3FB;font-size:Medium;font-weight:normal;">
                        <td>MCS042</td><td>78</td><td>#</td><td>#</td><td>#</td><td>#</td><td>40</td><td>COMPLETED</td>
                    </tr><tr align="center" valign="middle" style="background-color:White;border-color:#FFCCFF;font-size:Medium;font-weight:normal;">
                        <td>MCS043</td><td>74</td><td>#</td><td>#</td><td>#</td><td>#</td><td>48</td><td>COMPLETED</td>
                    </tr><tr align="center" valign="middle" style="background-color:#EFF3FB;font-size:Medium;font-weight:normal;">
                        <td>MCS044</td><td>80</td><td>#</td><td>#</td><td>#</td><td>#</td><td>#</td><td>NOT COMPLETED</td>
                    </tr><tr align="center" valign="middle" style="background-color:White;border-color:#FFCCFF;font-size:Medium;font-weight:normal;">
                        <td>MCS051</td><td>81</td><td>#</td><td>#</td><td>#</td><td>#</td><td>53</td><td>COMPLETED</td>
                    </tr><tr align="center" valign="middle" style="background-color:#EFF3FB;font-size:Medium;font-weight:normal;">
                        <td>MCS052</td><td>76</td><td>#</td><td>#</td><td>#</td><td>#</td><td>#</td><td>NOT COMPLETED</td>
                    </tr><tr align="center" valign="middle" style="background-color:White;border-color:#FFCCFF;font-size:Medium;font-weight:normal;">
                        <td>MCS053</td><td>80</td><td>#</td><td>#</td><td>#</td><td>#</td><td>36</td><td>NOT COMPLETED</td>
                    </tr><tr align="center" valign="middle" style="background-color:#EFF3FB;font-size:Medium;font-weight:normal;">
                        <td>MCSE003</td><td>-</td><td>#</td><td>#</td><td>#</td><td>#</td><td>30</td><td>NOT COMPLETED</td>
                    </tr><tr align="center" valign="middle" style="background-color:White;border-color:#FFCCFF;font-size:Medium;font-weight:normal;">
                        <td>MCSE004</td><td>80</td><td>#</td><td>#</td><td>#</td><td>#</td><td>58</td><td>COMPLETED</td>
                    </tr><tr align="center" valign="middle" style="background-color:#EFF3FB;font-size:Medium;font-weight:normal;">
                        <td>MCSE011</td><td>81</td><td>#</td><td>#</td><td>#</td><td>#</td><td>66</td><td>COMPLETED</td>
                    </tr><tr align="center" valign="middle" style="background-color:White;border-color:#FFCCFF;font-size:Medium;font-weight:normal;">
                        <td>MCSL036</td><td>86</td><td>80</td><td>80</td><td>80</td><td>-</td><td>#</td><td>COMPLETED</td>
                    </tr><tr align="center" valign="middle" style="background-color:#EFF3FB;font-size:Medium;font-weight:normal;">
                        <td>MCSL045</td><td>68</td><td>72</td><td>76</td><td>-</td><td>-</td><td>#</td><td>COMPLETED</td>
                    </tr><tr align="center" valign="middle" style="background-color:White;border-color:#FFCCFF;font-size:Medium;font-weight:normal;">
                        <td>MCSL054</td><td>78</td><td>80</td><td>72</td><td>-</td><td>-</td><td>#</td><td>COMPLETED</td>
                    </tr><tr align="center" style="color:White;background-color:#0F5092;font-weight:bold;">
                        <td>&nbsp;</td><td>&nbsp;</td><td>&nbsp;</td><td>&nbsp;</td><td>&nbsp;</td><td>&nbsp;</td><td>&nbsp;</td><td>&nbsp;</td>
                    </tr>
                </tbody></table>
                    </body>

                    </html>""";

        try {
            // Parse HTML content using Jsoup
            Document document = Jsoup.parse(html);

            // Extract table data
            Element table = document.select("table").first();
            Elements rows = table.select("tr");

            // Create Excel workbook and sheet
            Workbook workbook = new XSSFWorkbook();
            Sheet sheet = workbook.createSheet("Sheet1");

            // Write table data to Excel sheet
            int rowNum = 0;
            for (Element row : rows) {
                Elements cells = row.select("th, td");
                Row excelRow = sheet.createRow(rowNum++);
                int cellNum = 0;
                for (Element cell : cells) {
                    excelRow.createCell(cellNum++).setCellValue(cell.text());
                }
            }

            // Write Excel data to file
            FileOutputStream fileOut = new FileOutputStream("data2.xlsx");
            workbook.write(fileOut);
            fileOut.close();
            workbook.close();

            System.out.println("Excel file generated successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
