package com.luoxiang.poi;

import org.apache.http.util.TextUtils;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.util.ArrayList;

/**
 * projectName: 	    com.luoxiang.parent
 * packageName:	        com.luoxiang.poi
 * className:	        PoiIndex
 * author:	            Luoxiang
 * time:	            2020/10/24	21:27
 * desc:	            TODO
 *
 * svnVersion:	        $Rev
 * upDateAuthor:	    Vincent
 * upDate:	            2020/10/24
 * upDateDesc:	        TODO
 */


public class PoiIndex {

    public static void  main(String[] args) {
        try {
            readIndex();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    public static void readIndex() throws Exception{
        String FILE_PATH = "C:\\Users\\Vincent\\Downloads\\3.xls";
        HSSFWorkbook workbook = new HSSFWorkbook(new FileInputStream(new File(FILE_PATH)));
        HSSFSheet    sheet    = null;

        ArrayList<Integer> unuse = new ArrayList<>();
        for (int i = 0; i < workbook.getNumberOfSheets(); i++) {// 获取每个Sheet表
            sheet = workbook.getSheetAt(i);
            for (int j = 0; j < sheet.getLastRowNum() + 1; j++) {// getLastRowNum，获取最后一行的行标
                HSSFRow row = sheet.getRow(j);
                if (row != null) {
                    String first = row.getCell(0).toString();
                    String second = row.getCell(1).toString();
                    if (TextUtils.isEmpty(second)){
                        continue;
                    }
                    if (second.contains("不限") || second.contains("电子信息")){
                        //need.add(line);
                    }else {
                        System.out.println("first = " + first + ",second = " + second);
                        unuse.add(Integer.parseInt(first));
                    }
                }
            }
        }



        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\Vincent\\Downloads\\1.sql"));
        for (int index : unuse) {
            String sTemp = "DELETE FROM yi_bin_2020_02 WHERE index_code = %d ;";
            bufferedWriter.write(String.format(sTemp , index));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
    }
}
