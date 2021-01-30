package com.luoxiang.poi;

import com.luoxiang.project.po.ShanXi01;

import org.apache.http.util.TextUtils;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellType;

import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;

/**
 * projectName: 	    com.luoxiang.parent
 * packageName:	        com.luoxiang.poi
 * className:	        PoiShanXi
 * author:	            Luoxiang
 * time:	            2021/1/30	20:39
 * desc:	            TODO
 *
 * svnVersion:	        $Rev
 * upDateAuthor:	    Vincent
 * upDate:	            2021/1/30
 * upDateDesc:	        TODO
 */


public class PoiShanXi {

    static String EXCEPTION_TEMPLATE = "position : i = %d , j = %d , file = %s";

    public static void main(String[] args) {
        try {
            String tmp = "山西省太原市-太原市市直-太原市直属机关事务管理局";

            int index = tmp.indexOf("-");
            tmp = tmp.substring(index + 1 , tmp.length());
            System.out.println(tmp);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void updateData (HashMap<String, ShanXi01> jobs) throws Exception {
        File              fileDir = new File("C:\\Users\\Vincent\\Downloads\\shanxi\\has");
        File[]            files   = fileDir.listFiles();
        for (File tmp : files) {
                    if (tmp.getName().endsWith(".xls"))
                    {
                        HSSFWorkbook workbook = new HSSFWorkbook(new FileInputStream(tmp));
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

                                    String log = String.format(EXCEPTION_TEMPLATE, i, j, tmp.getPath());
                                    System.out.println(log);

                                    int index = first.lastIndexOf("-");
                                    String finalCode =  first.substring(index + 1 , first.length()) + "-" + second;
                                    if (finalCode.equals("太原市市场监督管理局")){
                                        System.out.println(finalCode);
                                    }
                                    if (!TextUtils.isEmpty(finalCode)) {

                                        if (jobs.containsKey(finalCode)) {
                                            ShanXi01 jiangSu202002 = jobs.get(finalCode);
                                            if (!jiangSu202002.getJob().equals(second)){
                                                continue;
                                            }
                                            if (row.getCell(3)
                                                   .getCellType() == CellType.NUMERIC)
                                            {
                                                int has = (int) row.getCell(3).getNumericCellValue();
                                                jiangSu202002.setAllNum(has);
                                                StringBuffer sb = new StringBuffer(jiangSu202002.getIngNum());
                                                sb.append(TextUtils.isEmpty(jiangSu202002.getIngNum()) ? "" : "," ).append(has + "");
                                                jiangSu202002.setIngNum(sb.toString());
                                                jobs.replace(finalCode, jiangSu202002);
                                            } else if (row.getCell(3)
                                                          .getCellType() == CellType.BLANK)
                                            {
                                                System.out.println(String.format(EXCEPTION_TEMPLATE, i, j, tmp.getPath()));
                                            } else {
                                                String s   = row.getCell(3).toString();
                                                int    has = Integer.parseInt(s);
                                                jiangSu202002.setAllNum(has);
                                                StringBuffer sb = new StringBuffer(jiangSu202002.getIngNum());
                                                sb.append(TextUtils.isEmpty(jiangSu202002.getIngNum()) ? "" : "," ).append(has + "");
                                                jiangSu202002.setIngNum(sb.toString());
                                                jobs.replace(finalCode, jiangSu202002);
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
