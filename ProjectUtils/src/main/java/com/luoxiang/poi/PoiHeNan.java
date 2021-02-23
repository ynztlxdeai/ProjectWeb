package com.luoxiang.poi;

import com.luoxiang.project.po.HeNan202101;

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
 * desc:
 *
 * svnVersion:	        $Rev
 * upDateAuthor:	    Vincent
 * upDate:	            2019/12/20
 * upDateDesc:
 */


public class PoiHeNan {

    public static List<String> checkHasNums2021(HashMap<String,HeNan202101> jobs)
            throws Exception
    {
        int jobCodeIndex = 1;
        int numIndex = 3;
        ArrayList<String> list    = new ArrayList<>();
        File              fileDir = new File("C:\\Users\\Vincent\\Downloads\\2021\\2021_HE_NAN\\has");
        File[]            files   = fileDir.listFiles();
        for(File tmp : files){
            if (tmp.getName().endsWith(".xls")){
                HSSFWorkbook workbook = new HSSFWorkbook(new FileInputStream(tmp));
                HSSFSheet    sheet    = null;
                for (int i = 0; i < workbook.getNumberOfSheets(); i++) {// 获取每个Sheet表
                    sheet = workbook.getSheetAt(i);

                    int LastRowNum =  sheet.getLastRowNum() + 1;
                    for (int j = 1; j < LastRowNum; j++) {// getLastRowNum，获取最后一行的行标
                        HSSFRow row = sheet.getRow(j);
                        if (row != null) {

                                String first = row.getCell(jobCodeIndex).toString().trim();
                                if (TextUtils.isEmpty(first)){
                                    continue;
                                }
                                String finalCode = first.substring(0 , 8);

                                if (!TextUtils.isEmpty(finalCode)){

                                    if (jobs.containsKey(finalCode)){
                                        HeNan202101 current = jobs.get(finalCode);
                                        Integer integer = current.getAllNum();
                                        int has = 0;
                                        if (row.getCell(numIndex).getCellType() == CellType.NUMERIC){
                                            has = (int) row.getCell(numIndex).getNumericCellValue();
                                        }else {
                                            String s = row.getCell(numIndex).toString();
                                            has = Integer.parseInt(s);
                                        }

                                        if (has != integer && has > integer){
                                            current.setAllNum(has);
                                        }
                                        StringBuffer buffer = new StringBuffer(current.getIngNum());
                                        buffer.append(TextUtils.isEmpty(current.getIngNum()) ? "" : "," ).append(has + "");
                                        current.setIngNum(buffer.toString());
                                        jobs.replace(finalCode , current);
                                    }
                                }

                        }

                    }
                }}
        }

        return list;
    }
}
