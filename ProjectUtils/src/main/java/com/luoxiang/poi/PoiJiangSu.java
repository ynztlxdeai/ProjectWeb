package com.luoxiang.poi;

import com.luoxiang.project.po.JiangSu202002;
import com.luoxiang.project.po.JiangSu202002Sh;

import org.apache.http.util.TextUtils;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellType;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * projectName: 	    com.luoxiang.parent
 * packageName:	        com.luoxiang.poi
 * className:	        PoiJiangSu
 * author:	            Luoxiang
 * time:	            2020/11/2	14:25
 * desc:	            TODO
 *
 * svnVersion:	        $Rev
 * upDateAuthor:	    Vincent
 * upDate:	            2020/11/2
 * upDateDesc:	        TODO
 */


public class PoiJiangSu {
    public static void main(String[] args) {
        try {
            sqlGen();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void sqlGen()
            throws Exception
    {
        HSSFWorkbook workbook = new HSSFWorkbook(new FileInputStream(
                "C:\\Users\\Vincent\\Downloads\\jiangsu\\20201030085355_54711.xls"));
        HSSFSheet    sheet    = null;

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(
                "C:\\Users\\Vincent\\Downloads\\1.sql"));
        for (int i = 0; i < workbook.getNumberOfSheets(); i++) {// 获取每个Sheet表
            sheet = workbook.getSheetAt(i);
            int LastRowNum = sheet.getLastRowNum() + 1;
            for (int j = 1; j < LastRowNum; j++) {// getLastRowNum，获取最后一行的行标
                HSSFRow row = sheet.getRow(j);
                if (row == null) {
                    continue;
                }
                //jiang_su_2020_02
                String zhuan_ye = row.getCell(12)
                                     .toString();
                if (TextUtils.isEmpty(zhuan_ye)) {
                    continue;
                }
                if (zhuan_ye.contains("电子信息") || zhuan_ye.contains("不限")) {
                    String di_qu_code = row.getCell(1)
                                           .toString();
                    String di_qu_name = row.getCell(2)
                                           .toString();
                    String unit_code  = row.getCell(3)
                                           .toString();
                    String unit_name  = row.getCell(4)
                                           .toString();
                    String job_code   = row.getCell(5)
                                           .toString();
                    String sql = String.format(
                            "DELETE FROM jiang_su_2020_02_sh WHERE di_qu_code = '%s' AND di_qu_name = '%s' AND  unit_code = '%s' AND unit_name = '%s' AND job_code = '%s' ;",
                            di_qu_code,
                            di_qu_name,
                            unit_code,
                            unit_name,
                            job_code);
                    // System.out.println(sql);
                    bufferedWriter.write(sql);
                    bufferedWriter.newLine();
                }

            }
        }
        bufferedWriter.close();
    }

    static String EXCEPTION_TEMPLATE = "position : i = %d , j = %d , file = %s";

    public static void updateData(HashMap<String, JiangSu202002> jobs)
            throws Exception
    {
        ArrayList<String> list    = new ArrayList<>();
        File              fileDir = new File("C:\\Users\\Vincent\\Downloads\\has_jiangsu");
        File[]            files   = fileDir.listFiles();
        for (File tmp : files) {
            if (tmp.isDirectory()) {
                File[] files1 = tmp.listFiles();
                for (File xls : files1) {

                    if (xls.getName().endsWith(".xls"))
                    {
                        HSSFWorkbook workbook = new HSSFWorkbook(new FileInputStream(xls));
                        HSSFSheet    sheet    = null;
                        for (int i = 0; i < workbook.getNumberOfSheets(); i++) {// 获取每个Sheet表
                            sheet = workbook.getSheetAt(i);

                            int LastRowNum = sheet.getLastRowNum() + 1;
                            for (int j = 2; j < LastRowNum; j++) {// getLastRowNum，获取最后一行的行标
                                HSSFRow row = sheet.getRow(j);
                                if (row != null) {
                                   // System.out.println(String.format(EXCEPTION_TEMPLATE , i , j , xls.getPath()));
                                    String first  = row.getCell(0)
                                                       .toString();
                                    String second = row.getCell(1)
                                                       .toString();
                                    if (TextUtils.isEmpty(first) || TextUtils.isEmpty(second)) {
                                        list.add(String.format(EXCEPTION_TEMPLATE, i, j, tmp.getPath()));
                                        continue;
                                    }
                                    StringBuffer stringBuffer = new StringBuffer();
                                    if (first.contains("[") && first.contains("]")) {
                                        stringBuffer.append(first.substring(first.lastIndexOf("[") + 1,
                                                                            first.lastIndexOf("]")));
                                    } else if (first.contains("[") && first.contains("】")) {
                                        stringBuffer.append(first.substring(first.lastIndexOf("[") + 1,
                                                                            first.lastIndexOf("】")));
                                    } else if (first.contains("【") && first.contains("】")) {
                                        stringBuffer.append(first.substring(first.lastIndexOf("【") + 1,
                                                                            first.lastIndexOf("】")));
                                    } else if (first.contains("【") && first.contains("]")) {
                                        stringBuffer.append(first.substring(first.lastIndexOf("【") + 1,
                                                                            first.lastIndexOf("]")));
                                    }

                                    if (second.contains("[") && second.contains("]")) {
                                        stringBuffer.append(second.substring(second.lastIndexOf("[") + 1,
                                                                             second.lastIndexOf("]")));
                                    } else if (second.contains("[") && second.contains("】")) {
                                        stringBuffer.append(second.substring(second.lastIndexOf("[") + 1,
                                                                             second.lastIndexOf("】")));
                                    } else if (second.contains("【") && second.contains("】")) {
                                        stringBuffer.append(second.substring(second.lastIndexOf("【") + 1,
                                                                             second.lastIndexOf("】")));
                                    } else if (second.contains("【") && second.contains("]")) {
                                        stringBuffer.append(second.substring(second.lastIndexOf("【") + 1,
                                                                             second.lastIndexOf("]")));
                                    }

                                    String finalCode = stringBuffer.toString()
                                                                   .trim();
                                    if (!TextUtils.isEmpty(finalCode)) {
                                        String jobCode = finalCode.substring(1);

                                        if (jobs.containsKey(jobCode)) {
                                            JiangSu202002 jiangSu202002 = jobs.get(jobCode);
                                            if (row.getCell(4)
                                                   .getCellType() == CellType.NUMERIC)
                                            {
                                                int has = (int) row.getCell(4)
                                                                   .getNumericCellValue();
                                                if (has != jiangSu202002.getAllNum()) {
                                                    jiangSu202002.setAllNum(has);
                                                }
                                                StringBuffer sb = new StringBuffer(jiangSu202002.getHasing());
                                                sb.append(has).append(",");
                                                jiangSu202002.setHasing(sb.toString());
                                                jobs.replace(jobCode, jiangSu202002);
                                            } else if (row.getCell(4)
                                                          .getCellType() == CellType.BLANK)
                                            {
                                                System.out.println(String.format(EXCEPTION_TEMPLATE, i, j, tmp.getPath()));
                                            } else {
                                                String s   = row.getCell(4)
                                                                .toString();
                                                int    has = Integer.parseInt(s);
                                                if (has != jiangSu202002.getAllNum()) {
                                                    jiangSu202002.setAllNum(has);
                                                }
                                                StringBuffer sb = new StringBuffer(jiangSu202002.getHasing());
                                                sb.append(has).append(",");
                                                jiangSu202002.setHasing(sb.toString());
                                                jobs.replace(jobCode, jiangSu202002);
                                            }

                                        }
                                    }

                                }

                            }

                        }

                    }
                }
            }
        }
    }

    public static void updateData2 (HashMap<String, JiangSu202002Sh> jobs) throws Exception {
        ArrayList<String> list    = new ArrayList<>();
        File              fileDir = new File("C:\\Users\\Vincent\\Downloads\\has_jiangsu");
        File[]            files   = fileDir.listFiles();
        for (File tmp : files) {
            if (tmp.isDirectory()) {
                File[] files1 = tmp.listFiles();
                for (File xls : files1) {

                    if (xls.getName().endsWith(".xls"))
                    {
                        HSSFWorkbook workbook = new HSSFWorkbook(new FileInputStream(xls));
                        HSSFSheet    sheet    = null;
                        for (int i = 0; i < workbook.getNumberOfSheets(); i++) {// 获取每个Sheet表
                            sheet = workbook.getSheetAt(i);

                            int LastRowNum = sheet.getLastRowNum() + 1;
                            for (int j = 2; j < LastRowNum; j++) {// getLastRowNum，获取最后一行的行标
                                HSSFRow row = sheet.getRow(j);
                                if (row != null) {
                                    //System.out.println(String.format(EXCEPTION_TEMPLATE , i , j , tmp.getPath()));
                                    String first  = row.getCell(0)
                                                       .toString();
                                    String second = row.getCell(1)
                                                       .toString();
                                    if (TextUtils.isEmpty(first) || TextUtils.isEmpty(second)) {
                                        list.add(String.format(EXCEPTION_TEMPLATE, i, j, tmp.getPath()));
                                        continue;
                                    }
                                    StringBuffer stringBuffer = new StringBuffer();
                                    if (first.contains("[") && first.contains("]")) {
                                        stringBuffer.append(first.substring(first.lastIndexOf("[") + 1,
                                                                            first.lastIndexOf("]")));
                                    } else if (first.contains("[") && first.contains("】")) {
                                        stringBuffer.append(first.substring(first.lastIndexOf("[") + 1,
                                                                            first.lastIndexOf("】")));
                                    } else if (first.contains("【") && first.contains("】")) {
                                        stringBuffer.append(first.substring(first.lastIndexOf("【") + 1,
                                                                            first.lastIndexOf("】")));
                                    } else if (first.contains("【") && first.contains("]")) {
                                        stringBuffer.append(first.substring(first.lastIndexOf("【") + 1,
                                                                            first.lastIndexOf("]")));
                                    }

                                    if (second.contains("[") && second.contains("]")) {
                                        stringBuffer.append(second.substring(second.lastIndexOf("[") + 1,
                                                                             second.lastIndexOf("]")));
                                    } else if (second.contains("[") && second.contains("】")) {
                                        stringBuffer.append(second.substring(second.lastIndexOf("[") + 1,
                                                                             second.lastIndexOf("】")));
                                    } else if (second.contains("【") && second.contains("】")) {
                                        stringBuffer.append(second.substring(second.lastIndexOf("【") + 1,
                                                                             second.lastIndexOf("】")));
                                    } else if (second.contains("【") && second.contains("]")) {
                                        stringBuffer.append(second.substring(second.lastIndexOf("【") + 1,
                                                                             second.lastIndexOf("]")));
                                    }

                                    String finalCode = stringBuffer.toString()
                                                                   .trim();
                                    if (!TextUtils.isEmpty(finalCode)) {
                                        String jobCode = finalCode.substring(1);

                                        if (jobs.containsKey(jobCode)) {
                                            JiangSu202002Sh jiangSu202002 = jobs.get(jobCode);
                                            if (row.getCell(4)
                                                   .getCellType() == CellType.NUMERIC)
                                            {
                                                int has = (int) row.getCell(4)
                                                                   .getNumericCellValue();
                                                if (has != jiangSu202002.getAllNum()) {
                                                    jiangSu202002.setAllNum(has);
                                                }
                                                StringBuffer sb = new StringBuffer(jiangSu202002.getHasing());
                                                sb.append(has).append(",");
                                                jiangSu202002.setHasing(sb.toString());
                                                jobs.replace(jobCode, jiangSu202002);
                                            } else if (row.getCell(4)
                                                          .getCellType() == CellType.BLANK)
                                            {
                                                System.out.println(String.format(EXCEPTION_TEMPLATE, i, j, tmp.getPath()));
                                            } else {
                                                String s   = row.getCell(4)
                                                                .toString();
                                                int    has = Integer.parseInt(s);
                                                if (has != jiangSu202002.getAllNum()) {
                                                    jiangSu202002.setAllNum(has);
                                                }
                                                StringBuffer sb = new StringBuffer(jiangSu202002.getHasing());
                                                sb.append(has).append(",");
                                                jiangSu202002.setHasing(sb.toString());
                                                jobs.replace(jobCode, jiangSu202002);
                                            }

                                        }
                                    }

                                }

                            }

                        }

                    }
                }
            }
        }
    }
}
