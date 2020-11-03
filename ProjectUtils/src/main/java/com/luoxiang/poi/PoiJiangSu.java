package com.luoxiang.poi;

import org.apache.http.util.TextUtils;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;

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


public class PoiJiangSu
{
    public static void main(String[] args){
        try {
            sqlGen();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    private static void sqlGen() throws Exception{
        HSSFWorkbook workbook = new HSSFWorkbook(new FileInputStream("C:\\Users\\Vincent\\Downloads\\jiangsu\\20201030084153_79090.xls"));
        HSSFSheet    sheet    = null;

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\Vincent\\Downloads\\1.sql"));
        for (int i = 0; i < workbook.getNumberOfSheets(); i++) {// 获取每个Sheet表
            sheet = workbook.getSheetAt(i);
            int LastRowNum = sheet.getLastRowNum() + 1;
            for (int j = 1; j < LastRowNum; j++) {// getLastRowNum，获取最后一行的行标
                HSSFRow row = sheet.getRow(j);
                if (row == null){
                    continue;
                }
                //jiang_su_2020_02
                String zhuan_ye = row.getCell(12).toString();
                if (TextUtils.isEmpty(zhuan_ye)){
                    continue;
                }
                if (zhuan_ye.contains("电子信息") || zhuan_ye.contains("不限")){
                    String di_qu_code =  row.getCell(1).toString();
                    String di_qu_name =  row.getCell(2).toString();
                    String unit_code =  row.getCell(3).toString();
                    String unit_name =  row.getCell(4).toString();
                    String job_code =  row.getCell(5).toString();
                    String sql  = String.format("DELETE FROM jiang_su_2020_02 WHERE di_qu_code = '%s' AND di_qu_name = '%s' AND  unit_code = '%s' AND unit_name = '%s' AND job_code = '%s' ;" ,
                                  di_qu_code , di_qu_name , unit_code , unit_name , job_code);
                   // System.out.println(sql);
                    bufferedWriter.write(sql);
                    bufferedWriter.newLine();
                }

            }
        }
        bufferedWriter.close();
    }
}
