package com.luoxiang.file;

import org.apache.http.util.TextUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellType;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * projectName: 	    com.luoxiang.parent
 * packageName:	        com.luoxiang.file
 * className:	        TableMerge
 * author:	            Luoxiang
 * time:	            2021/2/26	17:09
 * desc:	            TODO
 *
 * svnVersion:	        $Rev
 * upDateAuthor:	    Vincent
 * upDate:	            2021/2/26
 * upDateDesc:	        TODO
 */


public class TableMerge {

    public static void main(String[] args){
        try {
            resetData("C:\\Users\\Vincent\\Downloads\\2021\\2021_AN_HUI\\" , 3);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    private static void resetData(String filePath , int startRaw)
            throws Exception
    {
        //step 1 : get data from table and write ro txt file

        List<TableEntity> list         = getTables(filePath, startRaw);
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(filePath + "full_table.txt"));
        outputStream.writeObject(list);
        outputStream.flush();
        outputStream.close();

        //step 2 : filter
        List<TableEntity> my          = new ArrayList<>();
        for (TableEntity tableSiChuan : list){
            if (TextUtils.isEmpty(tableSiChuan.jobCode)){
                continue;
            }
            if (TextUtils.isEmpty(tableSiChuan.zhuanYe)){
                my.add(tableSiChuan);
            }else if (tableSiChuan.zhuanYe.contains("电子信息") || tableSiChuan.zhuanYe.contains("不限") ){
                my.add(tableSiChuan);
            }
        }

        outputStream = new ObjectOutputStream(new FileOutputStream(filePath + "my_table.txt"));
        outputStream.writeObject(my);
        outputStream.flush();
        outputStream.close();

        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet("sheet");
        for (int i = 0 ; i< my.size() ; i++){
            //创建HSSFRow对象 （行）
            HSSFRow row = sheet.createRow(i);

            TableEntity entity = my.get(i);
            int start = 0;
            //创建HSSFCell对象  （单元格）
            HSSFCell cell=row.createCell(start);

            cell.setCellValue(entity.unitName); start++;cell=row.createCell(start);
            cell.setCellValue(entity.unitAttr); start++;cell=row.createCell(start);
            cell.setCellValue(entity.unitLevel); start++;cell=row.createCell(start);
            cell.setCellValue(entity.jobLeiBie); start++;cell=row.createCell(start);
            cell.setCellValue(entity.jobName); start++;cell=row.createCell(start);
            cell.setCellValue(entity.needNum); start++;cell=row.createCell(start);
            cell.setCellValue(entity.jobLevel); start++;cell=row.createCell(start);
            cell.setCellValue(entity.jobCode); start++;cell=row.createCell(start);
            cell.setCellValue(entity.fanWei); start++;cell=row.createCell(start);
            cell.setCellValue(entity.duiXiang); start++;cell=row.createCell(start);
            cell.setCellValue(entity.xueLi); start++;cell=row.createCell(start);
            cell.setCellValue(entity.xueWei); start++;cell=row.createCell(start);
            cell.setCellValue(entity.sex); start++;cell=row.createCell(start);
            cell.setCellValue(entity.zhuanYe); start++;cell=row.createCell(start);
            cell.setCellValue(entity.others); start++;cell=row.createCell(start);
            cell.setCellValue(entity.beiZhu); start++;cell=row.createCell(start);
            cell.setCellValue(entity.lessYears); start++;cell=row.createCell(start);
            cell.setCellValue(entity.phone); start++;cell=row.createCell(start);
            cell.setCellValue(entity.inerName); start++;cell=row.createCell(start);
            cell.setCellValue(entity.jobDesc); start++;
        }

        //输出Excel文件
        FileOutputStream output =new FileOutputStream(filePath + "workbook.xls");
        workbook.write(output);
        output.flush();
        output.close();

    }
    
    static  class TableEntity
            implements Serializable
    {
        //单位名称/招录机关
        public String unitName;
        //机构性质
        public String unitAttr;
        //机构层级
        public String unitLevel;
        //职位类别
        public String jobLeiBie;
        //职位名称
        public String jobName;
        //录用名额
        public int needNum;
        //拟任职务
        public String jobLevel;
        //职位编码
        public String jobCode;
        //招收范围
        public String fanWei;
        //招收对象
        public String duiXiang;
        //学历
        public String xueLi;
        //学位
        public String xueWei;
        //性别
        public String sex;
        //专业
        public String zhuanYe;
        //其他
        public String others;
        //备注
        public String beiZhu;
        //最低服务年限规定
        public String lessYears;
        //政策咨询电话
        public String phone;
        //内设机构
        public String inerName ;
        //职位简介
        public String jobDesc;
    }


    static class TableIndex {
        //单位名称/招录机关
        public int unitNameIndex = -1;
        //机构性质
        public int unitAttrIndex = -1;
        //机构层级
        public int unitLevelIndex = -1;
        //职位类别
        public int jobLeiBieIndex = -1;
        //职位名称
        public int jobNameIndex = -1;
        //录用名额
        public int needNumIndex = -1;
        //拟任职务
        public int jobLevelIndex = -1;
        //职位编码
        public int jobCodeIndex = -1;
        //招收范围
        public int fanWeiIndex = -1;
        //招收对象
        public int duiXiangIndex = -1;
        //学历
        public int xueLiIndex = -1;
        //学位
        public int xueWeiIndex = -1;
        //性别
        public int sexIndex = -1;
        //专业
        public int zhuanYeIndex = -1;
        //其他
        public int othersIndex = -1;
        //备注
        public int beiZhuIndex = -1;
        //最低服务年限规定
        public int lessYearsIndex = -1;
        //政策咨询电话
        public int phoneIndex = -1;
        //内设机构
        public int inerNameIndex = -1;
        //职位简介
        public int jobDescIndex = -1;
    }

    private static void getRowIndex(String key , TableIndex tableIndex , int index){
        switch (key) {
            case "unitName":
                tableIndex.unitNameIndex = index;
                break;
            case "unitAttr":
                tableIndex.unitAttrIndex = index;
                break;
            case "unitLevel":
                tableIndex.unitLevelIndex = index;
                break;
            case "jobLeiBie":
                tableIndex.jobLeiBieIndex = index;
                break;
            case "jobName":
                tableIndex.jobNameIndex = index;
                break;
            case "needNum":
                tableIndex.needNumIndex = index;
                break;
            case "jobLevel":
                tableIndex.jobLevelIndex= index;
                break;
            case "jobCode":
                tableIndex.jobCodeIndex = index;
                break;
            case "fanWei":
                tableIndex.fanWeiIndex = index;
                break;
            case "duiXiang":
                tableIndex.duiXiangIndex = index;
                break;
            case "xueLi":
                tableIndex.xueLiIndex = index;
                break;
            case "xueWei":
                tableIndex.xueWeiIndex = index;
                break;
            case "sex":
                tableIndex.sexIndex = index;
                break;
            case "zhuanYe":
                tableIndex.zhuanYeIndex = index;
                break;
            case "others":
                tableIndex.othersIndex = index;
                break;
            case "beiZhu":
                tableIndex.beiZhuIndex = index;
                break;
            case "lessYears":
                tableIndex.lessYearsIndex = index;
                break;
            case "phone":
                tableIndex.phoneIndex = index;
                break;
            case "inerName ":
                tableIndex.inerNameIndex = index;
                break;
            case "jobDesc":
                tableIndex.jobDescIndex = index;
                break;
            default:
                break;
        }
    }


    private static TableEntity getData(HSSFRow row , TableIndex tableIndex){
        if(row == null || tableIndex == null) {
            return null;
        }

        TableEntity table = new TableEntity();

        table.unitName = tableIndex.unitNameIndex == -1 ? "" : row.getCell(tableIndex.unitNameIndex).toString();
        table.unitAttr = tableIndex.unitAttrIndex == -1 ? "" : row.getCell(tableIndex.unitAttrIndex).toString();
        table.unitLevel = tableIndex.unitLevelIndex == -1 ? "" : row.getCell(tableIndex.unitLevelIndex).toString();
        table.jobLeiBie = tableIndex.jobLeiBieIndex == -1 ? "" : row.getCell(tableIndex.jobLeiBieIndex).toString();
        table.jobName = tableIndex.jobNameIndex == -1 ? "" : row.getCell(tableIndex.jobNameIndex).toString();

        if ( tableIndex.needNumIndex == -1 ){
            table.needNum = 1;
        }else {
            CellType cellType = row.getCell(tableIndex.needNumIndex).getCellType();
            if (cellType == CellType.NUMERIC){
                table.needNum = (int) row.getCell(tableIndex.needNumIndex).getNumericCellValue();
            }else if (cellType == CellType.BLANK){
                table.needNum = 1;
            }
            else {
                table.needNum = Integer.parseInt(row.getCell(tableIndex.needNumIndex).toString());
            }
        }
        //table.needNum = tableIndex.needNumIndex == -1 ? 0 : Integer.parseInt(row.getCell(tableIndex.needNumIndex).toString());

        table.jobLevel = tableIndex.jobLevelIndex == -1 ? "" : row.getCell(tableIndex.jobLevelIndex).toString();
        table.sex = tableIndex.sexIndex == -1 ? "" : row.getCell(tableIndex.sexIndex).toString();
        table.jobCode = tableIndex.jobCodeIndex == -1 ? "" : row.getCell(tableIndex.jobCodeIndex).toString();
        table.fanWei = tableIndex.fanWeiIndex == -1 ? "" : row.getCell(tableIndex.fanWeiIndex).toString();
        table.duiXiang = tableIndex.duiXiangIndex == -1 ? "" : row.getCell(tableIndex.duiXiangIndex).toString();
        table.xueLi = tableIndex.xueLiIndex == -1 ? "" : row.getCell(tableIndex.xueLiIndex).toString();
        table.xueWei = tableIndex.xueWeiIndex == -1 ? "" : row.getCell(tableIndex.xueWeiIndex).toString();
        table.zhuanYe = tableIndex.zhuanYeIndex == -1 ? "" : row.getCell(tableIndex.zhuanYeIndex).toString();
        table.others = tableIndex.othersIndex == -1 ? "" : row.getCell(tableIndex.othersIndex).toString();
        table.beiZhu = tableIndex.beiZhuIndex == -1 ? "" : row.getCell(tableIndex.beiZhuIndex).toString();
        table.lessYears = tableIndex.lessYearsIndex == -1 ? "" : row.getCell(tableIndex.lessYearsIndex).toString();
        table.phone = tableIndex.phoneIndex == -1 ? "" : row.getCell(tableIndex.phoneIndex).toString();
        table.inerName  = tableIndex.inerNameIndex == -1 ? "" : row.getCell(tableIndex.inerNameIndex).toString();
        table.jobDesc = tableIndex.jobDescIndex == -1 ? "" : row.getCell(tableIndex.jobDescIndex).toString();

        return table;
    }

    private static List<TableEntity> getTables(String filePath , int startRow) throws Exception{
        ArrayList<TableEntity> entities = new ArrayList<>();

        File[] files   = new File(filePath).listFiles();
        for(File tmp : files){
            if (tmp.getName().endsWith(".xls")){
                HSSFWorkbook workbook = new HSSFWorkbook(new FileInputStream(tmp));
                System.out.println(tmp.getPath());
                HSSFSheet sheet = null;
                for (int i = 0; i < workbook.getNumberOfSheets(); i++) {// 获取每个Sheet表
                    sheet = workbook.getSheetAt(i);
                    int        last         = sheet.getLastRowNum() + 1;
                    TableIndex tableIndex = new TableIndex();
                    for (int j = startRow; j < last; j++) {// getLastRowNum，获取最后一行的行标
                        HSSFRow row = sheet.getRow(j);
                        if (row == null) {
                            continue;
                        }

                        if (j == startRow) {
                            int      index   = 0;
                            String   content = null;
                            HSSFCell cell    = row.getCell(index);
                            while (cell != null) {
                                content = cell.toString();
                                getRowIndex(content, tableIndex, index);
                                index++;
                                cell = row.getCell(index);
                            }
                        } else {
                            TableEntity table = getData(row, tableIndex);
                            System.out.println("run position = " + j);
                            if (table != null) {
                                entities.add(table);
                                //System.out.println(table);
                            }
                        }


                    }
                }
            }
        }
        return entities;
    }
    
}
