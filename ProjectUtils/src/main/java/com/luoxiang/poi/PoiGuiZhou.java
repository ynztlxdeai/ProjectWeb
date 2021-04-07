package com.luoxiang.poi;

import org.apache.http.util.TextUtils;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * projectName: 	    com.luoxiang.parent
 * packageName:	        com.luoxiang.poi
 * className:	        PoiGuiZhou
 * author:	            Luoxiang
 * time:	            2021/2/27	18:51
 * desc:	            TODO
 *
 * svnVersion:	        $Rev
 * upDateAuthor:	    Vincent
 * upDate:	            2021/2/27
 * upDateDesc:	        TODO
 */


public class PoiGuiZhou {

   static String[] codes = {
            "20000703",
            "20001603",
            "20002202",
            "20002606",
            "20002804",
            "10003701",
            "10004001",
            "10004101",
            "10004201",
            "10004301",
            "10004401"};

    public static void main(String[] args){
        HashMap<String , String> map = new HashMap<>(codes.length);
        for (String s : codes){
            map.put(s , "");
        }
        try {
            checkHasNums2021(map);
            Iterator<Map.Entry<String, String>> iterator = map.entrySet()
                                                              .iterator();
            while (iterator.hasNext()){
                Map.Entry<String, String> next = iterator.next();
                System.out.println(next.getKey() + " : " + next.getValue());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void checkHasNums2021(HashMap<String,String> jobs)
            throws Exception
    {
        int               jobCodeIndex = 3;
        int               numIndex     = 6;
        File              fileDir      = new File("C:\\Users\\Vincent\\Downloads\\2021\\2021_GUI_ZHOU\\has");
        File[]            files        = fileDir.listFiles();
        for(File tmp : files) {
            if (tmp.getName()
                   .endsWith(".xls"))
            {
                HSSFWorkbook workbook = new HSSFWorkbook(new FileInputStream(tmp));
                HSSFSheet    sheet    = null;
                for (int i = 0; i < workbook.getNumberOfSheets(); i++) {// 获取每个Sheet表
                    sheet = workbook.getSheetAt(i);

                    int LastRowNum = sheet.getLastRowNum() + 1;
                    for (int j = 0; j < LastRowNum; j++) {// getLastRowNum，获取最后一行的行标
                        HSSFRow row = sheet.getRow(j);
                        if (row != null) {

                            String finalCode = row.getCell(jobCodeIndex).toString().trim();

                            if (!TextUtils.isEmpty(finalCode)) {

                                if (jobs.containsKey(finalCode)) {
                                    String current = jobs.get(finalCode);
                                    StringBuffer buffer = new StringBuffer(current);
                                    buffer.append(TextUtils.isEmpty(current) ? "" : ",").append("-");
                                    jobs.replace(finalCode, buffer.toString());
                                }
                            }

                        }

                    }
                }
            }
        }
    }
}
