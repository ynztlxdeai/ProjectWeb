package com.luoxiang.poi;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * projectName: 	    com.luoxiang.parent
 * packageName:	        com.luoxiang.poi
 * className:	        PoiReader
 * author:	            Luoxiang
 * time:	            2019/10/28	12:30
 * desc:	            TODO
 *
 * svnVersion:	        $Rev
 * upDateAuthor:	    Vincent
 * upDate:	            2019/10/28
 * upDateDesc:	        TODO
 */


public class PoiReader {

    public static final String FILE_PATH = "C:\\Users\\Vincent\\Downloads\\电子信息.xls";
    public static final String JOB_CODE_TEMPLATE = "%s:%s:%s";

    // 读取，全部sheet表及数据
    public static void showExcel() throws Exception {
        HSSFWorkbook workbook = new HSSFWorkbook(new FileInputStream(new File(FILE_PATH)));
        HSSFSheet sheet = null;
        for (int i = 0; i < workbook.getNumberOfSheets(); i++) {// 获取每个Sheet表
            sheet = workbook.getSheetAt(i);
            for (int j = 0; j < sheet.getLastRowNum() + 1; j++) {// getLastRowNum，获取最后一行的行标
                HSSFRow row = sheet.getRow(j);
                if (row != null) {
                    /*for (int k = 0; k < row.getLastCellNum(); k++) {// getLastCellNum，是获取最后一个不为空的列是第几个
                        if (row.getCell(k) != null) { // getCell 获取单元格数据
                            System.out.print(row.getCell(k) + "\t");
                        } else {
                            System.out.print("\t");
                        }
                    }*/
                    String jobCode = String.format(JOB_CODE_TEMPLATE,
                                                  row.getCell(1),
                                                  row.getCell(3),
                                                  row.getCell(5));
                    System.out.println(jobCode);
                }
                System.out.println(""); // 读完一行后换行
            }
            System.out.println("读取sheet表：" + workbook.getSheetName(i) + " 完成");
        }
    }
    // 读取，指定sheet表及数据
    public static final void showExcel2() throws Exception {
        HSSFWorkbook workbook = new HSSFWorkbook(new FileInputStream(new File("C:\\Users\\xiaozhilei.ALAMAP\\Desktop\\888888.xls")));
        HSSFSheet sheet = null;
        int i = workbook.getSheetIndex("Sheet1"); // sheet表名
        sheet = workbook.getSheetAt(i);
        for (int j = 0; j < sheet.getLastRowNum() + 1; j++) {// getLastRowNum
            // 获取最后一行的行标
            HSSFRow row = sheet.getRow(j);
            if (row != null) {
                for (int k = 0; k < row.getLastCellNum(); k++) {// getLastCellNum
                    // 是获取最后一个不为空的列是第几个
                    if (row.getCell(k) != null) { // getCell 获取单元格数据
                        DecimalFormat df = new DecimalFormat("#");

                        System.out.println("type666==" + df.format(row.getCell(k).getNumericCellValue()));

                    } else {
                        System.out.print("\t");
                    }
                }
            }
            System.out.println("");
        }
    }

    // 写入，往指定sheet表的单元格
    public static void insertExcel3() throws Exception {
        HSSFWorkbook workbook = new HSSFWorkbook(new FileInputStream(new File("E:/temp/t1.xls"))); // 读取的文件
        HSSFSheet sheet = null;
        int i = workbook.getSheetIndex("Sheet1"); // sheet表名
        sheet = workbook.getSheetAt(i);

        HSSFRow row = sheet.getRow(0); // 获取指定的行对象，无数据则为空，需要创建
        if (row == null) {
            row = sheet.createRow(0); // 该行无数据，创建行对象
        }

        Cell cell = row.createCell(0); // 创建指定单元格对象。如本身有数据会替换掉
        cell.setCellValue("你好dfsfd"); // 设置内容

        FileOutputStream fo = new FileOutputStream("E:/temp/t1.xls"); // 输出到文件
        workbook.write(fo);

    }



    // 写入，往指定sheet表的单元格
    public static void insertExcel4() throws Exception {
        List<Map<String,String>> list     = showExcel11();
        HSSFWorkbook             workbook = new HSSFWorkbook(new FileInputStream(new File("E:/temp/t1.xls"))); // 读取的文件
        HSSFSheet                sheet    = null;
        int                      i        = workbook.getSheetIndex("Sheet1"); // sheet表名
        sheet = workbook.getSheetAt(i);
        System.out.println(list.size());
        for (int k=0;k<list.size();k++){
            Map<String, String> maps = (Map) list.get(k);
            System.out.println("Map2" + maps.toString());
            String mobile = maps.get("mobile");
            String openid = maps.get("openid");
            String token = "";
            System.out.println(mobile + "mobile" + "openid" + openid + "token" + token);

            HSSFRow row = sheet.getRow(k); // 获取指定的行对象，无数据则为空，需要创建
            if (row == null) {
                row = sheet.createRow(k); // 该行无数据，创建行对象
                Cell cell = row.createCell(0); // 创建指定单元格对象。如本身有数据会替换掉
                cell.setCellValue(mobile); // 设置内容

                Cell cell2 = row.createCell(1); // 创建指定单元格对象。如本身有数据会替换掉
                cell2.setCellValue(openid); // 设置内容

                Cell cell3 = row.createCell(2); // 创建指定单元格对象。如本身有数据会替换掉
                cell3.setCellValue(token); // 设置内容

            }
        }

        FileOutputStream fo = new FileOutputStream("E:/temp/t1.xls"); // 输出到文件
        workbook.write(fo);

    }

    // 读取，全部sheet表及数据
    public static List<Map<String, String>>  showExcel11() throws Exception {
        HSSFWorkbook workbook = new HSSFWorkbook(new FileInputStream(new File("E:/temp/999.xls")));
        HSSFSheet sheet = null;
        List<Map<String, String>> list = new ArrayList<Map<String, String>>();
        for (int i = 0; i < workbook.getNumberOfSheets(); i++) {// 获取每个Sheet表
            sheet = workbook.getSheetAt(i);
            for (int j = 0; j < sheet.getLastRowNum() + 1; j++) {
                HSSFRow row = sheet.getRow(j);
                if (row != null) {
                    // getLastCellNum，是获取最后一个不为空的列是第几个
                    Map<String, String> data = new HashMap<>();
                    for (int k = 0; k < row.getLastCellNum(); k++) {
                        DecimalFormat df = new DecimalFormat("#");
                        if (row.getCell(k) != null && k == 0) { // getCell 获取单元格数据
                            data.put("mobile", df.format(row.getCell(k).getNumericCellValue()));
                            System.out.print(df.format(row.getCell(k).getNumericCellValue()) + "\t");
                        } else {
                            data.put("openid", row.getCell(k).getStringCellValue());
                            System.out.print(row.getCell(k).getStringCellValue());
                        }

                    }
                    System.out.println(data.toString());
                    list.add(data);
                }
                System.out.println(""); // 读完一行后换行
            }
            System.out.println("读取sheet表：" + workbook.getSheetName(i) + " 完成");
        }
        return list;
    }


    // 写入，往指定sheet表的单元格
    public static void insertExcel22() throws Exception {

        HSSFWorkbook workbook = new HSSFWorkbook(new FileInputStream(new File("C:\\Users\\xiaozhilei.ALAMAP\\Desktop\\888888.xls")));
        HSSFSheet sheet = null;
        List<Map<String, String>> list = new ArrayList<Map<String, String>>();
        for (int i = 0; i < workbook.getNumberOfSheets(); i++) {// 获取每个Sheet表
            sheet = workbook.getSheetAt(i);
            for (int j = 0; j < sheet.getLastRowNum() + 1; j++) {
                HSSFRow row = sheet.getRow(j);
                if (row != null) {
                    // getLastCellNum，是获取最后一个不为空的列是第几个
                    Map<String, String> data = new HashMap<>();
                    for (int k = 0; k < row.getLastCellNum(); k++) {
                        DecimalFormat df = new DecimalFormat("#");
                        if (row.getCell(k) != null && k == 0) { // getCell 获取单元格数据
                            data.put("mobile", df.format(row.getCell(k).getNumericCellValue()));
                            System.out.print(df.format(row.getCell(k).getNumericCellValue()) + "\t");
                        } else {
                            data.put("openid", row.getCell(k).getStringCellValue());
                            System.out.print(row.getCell(k).getStringCellValue());
                        }

                    }
                    System.out.println(data.toString());
                    list.add(data);
                }
                System.out.println(""); // 读完一行后换行
            }
            System.out.println("读取sheet表：" + workbook.getSheetName(i) + " 完成");


            HSSFWorkbook workbook2 = new HSSFWorkbook(new FileInputStream(new File("E:/temp/t1.xls"))); // 读取的文件
            HSSFSheet sheet2 = null;
            int f = workbook2.getSheetIndex("Sheet2"); // sheet表名
            sheet2 = workbook2.getSheetAt(f);
            for (int k = 0; k < list.size(); k++) {
                Map<String, String> maps = (Map) list.get(k);
                System.out.println("Map2" + maps.toString());
                String mobile = maps.get("mobile");
                String openid = maps.get("openid");
                String token = "23kjflsjfosjflusojfjfosuojjfsofjosjfojosfosjfousofsf";
                System.out.println(mobile + "mobile" + "openid" + openid + "token" + token);

                HSSFRow row = sheet2.getRow(k); // 获取指定的行对象，无数据则为空，需要创建
                if (row == null) {
                    row = sheet.createRow(k); // 该行无数据，创建行对象
                }

                Cell cell = row.createCell(0); // 创建指定单元格对象。如本身有数据会替换掉
                cell.setCellValue("fsfs"); // 设置内容

                Cell cell2 = row.createCell(1); // 创建指定单元格对象。如本身有数据会替换掉
                cell2.setCellValue("ggg"); // 设置内容

                Cell cell3 = row.createCell(2); // 创建指定单元格对象。如本身有数据会替换掉
                cell3.setCellValue("lll"); // 设置内容

                FileOutputStream fo = new FileOutputStream("E:/temp/t1.xls"); // 输出到文件
                workbook2.write(fo);
            }

        }


    }

    public static void main(String[] args){
        try {
            showExcel();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
