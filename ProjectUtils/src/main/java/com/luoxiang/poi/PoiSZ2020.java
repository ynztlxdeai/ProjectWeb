package com.luoxiang.poi;

import com.luoxiang.project.domain.ShenZheng2020;

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


public class PoiSZ2020 {

    public static HashMap<String, ShenZheng2020> checkHasNums(String jobs)
            throws Exception
    {
        File                           fileDir = new File("C:\\Users\\Vincent\\Downloads\\shenzheng");
        File[]                         files   = fileDir.listFiles();
        HashMap<String, ShenZheng2020> results = new HashMap<>();
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
                        if (row == null) {
                            continue;
                        }
                        String jobcode = row.getCell(0).toString().trim();

                        if (!TextUtils.isEmpty(jobcode) && jobs.contains(jobcode)) {
                            ShenZheng2020 sz = null;
                            if (results.containsKey(jobcode)) {
                                sz = results.get(jobcode);
                                if (row.getCell(4).getCellType() == CellType.NUMERIC){
                                    sz.currentNums = (int) row.getCell(4).getNumericCellValue();
                                }else {
                                    sz.currentNums = Integer.parseInt(row.getCell(4).toString());
                                }
                                StringBuffer buffer = new StringBuffer(sz.hasing).append(",").append(sz.currentNums + "");
                                sz.hasing = buffer.toString();
                                results.replace(jobcode , sz);
                            } else {
                                sz = new ShenZheng2020();
                                sz.jobCode = jobcode;
                                if (row.getCell(4).getCellType() == CellType.NUMERIC){
                                    sz.currentNums = (int) row.getCell(4).getNumericCellValue();
                                }else {
                                    sz.currentNums = Integer.parseInt(row.getCell(4).toString());
                                }
                                StringBuffer buffer = new StringBuffer(sz.currentNums + "");
                                sz.hasing = buffer.toString();
                                if (row.getCell(5).getCellType() == CellType.NUMERIC){
                                    sz.needNums = (int) row.getCell(5).getNumericCellValue();
                                }else {
                                    sz.needNums = Integer.parseInt(row.getCell(5).toString());
                                }
                                sz.jobName = row.getCell(1).toString();
                                sz.firstUnit = row.getCell(2).toString();
                                sz.secondUnit = row.getCell(3).toString();
                                results.put(jobcode , sz);
                            }
                        }


                    }

                }
            }
        }

        return results;
    }

}
