package com.luoxiang.poi;

import com.luoxiang.project.po.YiBin202002;
import com.luoxiang.project.po.YiBin202101;

import org.apache.http.util.TextUtils;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellType;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * projectName: 	    com.luoxiang.parent
 * packageName:	        com.luoxiang.poi
 * className:	        PoiYiBin
 * author:	            Luoxiang
 * time:	            2020/11/5	14:43
 * desc:	            TODO
 *
 * svnVersion:	        $Rev
 * upDateAuthor:	    Vincent
 * upDate:	            2020/11/5
 * upDateDesc:	        TODO
 */


public class PoiYiBin {


    public static void checkHasNums2(HashMap<String,YiBin202002> jobs)
            throws Exception
    {
        File   fileDir = new File("C:\\Users\\Vincent\\Downloads\\yibin");
        File[] files   = fileDir.listFiles();
        for (File tmp : files) {
            if (tmp.getName().endsWith(".xls"))
            {
                HSSFWorkbook workbook = new HSSFWorkbook(new FileInputStream(tmp));
                HSSFSheet    sheet    = null;
                for (int i = 0; i < workbook.getNumberOfSheets(); i++) {// 获取每个Sheet表
                    sheet = workbook.getSheetAt(i);

                    int LastRowNum = sheet.getLastRowNum() + 1;
                    for (int j = 1; j < LastRowNum; j++) {// getLastRowNum，获取最后一行的行标
                        HSSFRow row = sheet.getRow(j);
                        if (row != null) {

                            String first = row.getCell(1).toString();

                            String finalCode = first.toString().trim();

                            if (!TextUtils.isEmpty(finalCode)) {

                                if (jobs.containsKey(finalCode)) {
                                    YiBin202002 current = jobs.get(finalCode);
                                    Integer       integer = current.getAllNum();
                                    int           has     = 0;
                                    if (row.getCell(3).getCellType() == CellType.NUMERIC)
                                    {
                                        has = (int) row.getCell(3).getNumericCellValue();
                                    } else {
                                        String s = row.getCell(3).toString();
                                        has = Integer.parseInt(s);
                                    }

                                    if (has != integer && has > integer) {
                                        current.setAllNum(has);
                                    }
                                    StringBuffer buffer = new StringBuffer(current.getCurrent());
                                    buffer.append(has).append(",");
                                    current.setCurrent(buffer.toString());
                                    jobs.replace(finalCode, current);
                                }
                            }

                        }

                    }

                }
            }
        }
    }

    public static void checkHasNums202101(HashMap<String,YiBin202101> jobs)
            throws Exception
    {
        int               jobCodeIndex = 2;
        int               numIndex     = 3;
        int               numIndex2    = 3;
        int               dataIndex = 1;
        ArrayList<String> list         = new ArrayList<>();
        File              fileDir      = new File("C:\\Users\\Vincent\\Downloads\\2021\\2021_01_YI_BIN\\has");
        File[]            files        = fileDir.listFiles();
        for(File tmp : files){
            if (tmp.getName().endsWith(".xls")){
                HSSFWorkbook workbook = new HSSFWorkbook(new FileInputStream(tmp));
                HSSFSheet    sheet    = null;
                for (int i = 0; i < workbook.getNumberOfSheets(); i++) {// 获取每个Sheet表
                    sheet = workbook.getSheetAt(i);

                    int LastRowNum =  sheet.getLastRowNum() + 1;
                    for (int j = dataIndex; j < LastRowNum; j++) {// getLastRowNum，获取最后一行的行标
                        HSSFRow row = sheet.getRow(j);
                        if (row == null) {
                            continue;
                        }

                        String first = "";
                        if (row.getCell(jobCodeIndex).getCellType() == CellType.NUMERIC){
                            int value = (int) row.getCell(jobCodeIndex).getNumericCellValue();
                            first = value + "";
                        }else {
                            first = row.getCell(jobCodeIndex).toString().trim();
                        }

                        //System.out.println(tmp.getName() + " index " + j );
                        if (!TextUtils.isEmpty(first) && jobs.containsKey(first)){
                                YiBin202101 current = jobs.get(first);
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

                            int hasPass = 0;
                            if (row.getCell(numIndex2).getCellType() == CellType.NUMERIC){
                                hasPass = (int) row.getCell(numIndex2).getNumericCellValue();
                            }else {
                                String s = row.getCell(numIndex2).toString();
                                hasPass = Integer.parseInt(s);
                            }


                                StringBuffer buffer = new StringBuffer(current.getIngNum());
                                buffer.append(TextUtils.isEmpty(current.getIngNum()) ? "" : "," ).append("(" + has + "," + hasPass + ")");
                                current.setIngNum(buffer.toString());
                                jobs.replace(first , current);
                        }
                    }
                }
            }
        }
    }
}
