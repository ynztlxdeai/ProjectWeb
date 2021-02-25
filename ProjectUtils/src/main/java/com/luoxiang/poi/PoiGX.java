package com.luoxiang.poi;

import com.luoxiang.project.bean.GxStatus;
import com.luoxiang.project.po.GuangXi202101;
import com.luoxiang.project.po.Gx202001;

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


public class PoiGX {


    public static HashMap<String , ArrayList<GxStatus>> checkHasNums(HashMap<String,Gx202001> jobs)
            throws Exception
    {

        File              fileDir = new File("C:\\Users\\Vincent\\Downloads\\has\\");
        File[]            files   = fileDir.listFiles();
        HashMap<String , ArrayList<GxStatus>> resultMap = new HashMap<>();
        int fileIndex = 0;
        for(File tmp : files){
            if (tmp.getName().endsWith(".xls")){
                fileIndex++;
                HSSFWorkbook workbook = new HSSFWorkbook(new FileInputStream(tmp));
                HSSFSheet    sheet    = null;
                for (int i = 0; i < workbook.getNumberOfSheets(); i++) {// 获取每个Sheet表
                    sheet = workbook.getSheetAt(i);

                    int LastRowNum =  sheet.getLastRowNum() + 1;
                    for (int j = 1; j < LastRowNum; j++) {// getLastRowNum，获取最后一行的行标
                        HSSFRow row = sheet.getRow(j);
                        if (row != null) {
                                String first =row.getCell(2).getStringCellValue();
                                if (first == null || first.equals("")){
                                    continue;
                                }
                                String finalCode = first.toString().trim();

                                if (!TextUtils.isEmpty(finalCode)){

                                    if (jobs.containsKey(finalCode)){
                                        ArrayList<GxStatus> list;
                                        boolean has = resultMap.containsKey(finalCode);
                                        if (has){
                                            list = resultMap.get(finalCode);
                                        }else {
                                            list  = new ArrayList<GxStatus>();
                                        }

                                        Gx202001 current = jobs.get(finalCode);
                                        GxStatus status = new GxStatus();
                                        status.jobCode = current.getJobCode();
                                        status.job = current.getJob();

                                        status.needNums= Integer.parseInt(current.getNeedNums());
                                        status.baoKaoNums=row.getCell(3).getNumericCellValue();
                                        status.VerityNums=row.getCell(4).getNumericCellValue();
                                        status.passNums=row.getCell(5).getNumericCellValue();
                                        status.payNums=row.getCell(6).getNumericCellValue();
                                        status.fileIndex = fileIndex + "";
                                        list.add(status);
                                        if (has){
                                            resultMap.replace(finalCode , list);
                                        }else {
                                            resultMap.put(finalCode , list);
                                        }
                                    }
                                }
                        }

                    }
                }}
        }

        return resultMap;
    }


    public static void checkHasNums202101(HashMap<String,GuangXi202101> jobs)
            throws Exception
    {
        int jobCodeIndex = 2;
        int numIndex = 3;
        File              fileDir = new File("C:\\Users\\Vincent\\Downloads\\2021\\2021_GUANG_XI\\has");
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

                            String first = row.getCell(jobCodeIndex).toString();

                            String finalCode = first.toString().trim();

                            if (!TextUtils.isEmpty(finalCode)){

                                if (jobs.containsKey(finalCode)){
                                    GuangXi202101 current = jobs.get(finalCode);
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
    }

}
