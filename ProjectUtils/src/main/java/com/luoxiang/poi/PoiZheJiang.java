package com.luoxiang.poi;

import org.apache.http.util.TextUtils;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellType;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * projectName: 	    com.luoxiang.parent
 * packageName:	        com.luoxiang.poi
 * className:	        PoiZheJiang
 * author:	            Luoxiang
 * time:	            2019/12/20	21:27
 * desc:	            专门用来读浙江公务员考试信息
 *
 * svnVersion:	        $Rev
 * upDateAuthor:	    Vincent
 * upDate:	            2019/12/20
 * upDateDesc:
 */


public class PoiZheJiang {
    public static final String POI_ORIGIN_PATH = "";


    public static List<String> checkHasNums(HashMap<String, Integer> jobs)
            throws Exception
    {
        ArrayList<String> list    = new ArrayList<>();
        File              fileDir = new File("C:\\Users\\Vincent\\Downloads\\has");
        File[]            files   = fileDir.listFiles();
        for(File tmp : files){
            if (tmp.getName().endsWith(".xls")){
                HSSFWorkbook workbook = new HSSFWorkbook(new FileInputStream(tmp));
                HSSFSheet    sheet    = null;
                for (int i = 0; i < workbook.getNumberOfSheets(); i++) {// 获取每个Sheet表
                    sheet = workbook.getSheetAt(i);

                    int LastRowNum =  sheet.getLastRowNum() + 1;
                    for (int j = 0; j < LastRowNum; j++) {// getLastRowNum，获取最后一行的行标
                        HSSFRow row = sheet.getRow(j);
                        if (row != null) {


                                String first = row.getCell(2).toString();

                                String finalCode = first.toString().trim();

                                if (!TextUtils.isEmpty(finalCode)){

                                    if (jobs.containsKey(finalCode)){
                                        Integer integer = jobs.get(finalCode);
                                        int has = 0;
                                        if (row.getCell(5).getCellType() == CellType.NUMERIC){
                                            has = (int) row.getCell(5).getNumericCellValue();
                                            if (has != integer){
                                                jobs.replace(finalCode , has);
                                            }
                                        }else {
                                            String s = row.getCell(5)
                                                          .toString();
                                            has = Integer.parseInt(s);
                                            if (has != integer){
                                                jobs.replace(finalCode , has);
                                            }
                                        }


                                    }
                                }

                        }

                    }
                }}
        }

        return list;
    }
}
