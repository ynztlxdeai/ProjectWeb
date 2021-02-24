package com.luoxiang.poi;

import com.luoxiang.project.domain.SiChuan;
import com.luoxiang.project.domain.TableSiChuan;
import com.luoxiang.project.po.SiChuan202002;
import com.luoxiang.project.po.SiChuan202101;

import org.apache.http.util.TextUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellType;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

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


public class PoiSC02 {
    public static final String POI_ORIGIN_PATH = "";

    public static void  main(String[] args) {
        resetSC();
    }

    public static void  test(String[] args) {


       /* try {
            List<TableSiChuan> list         = getTables();
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Vincent\\Downloads\\sichuan\\full_table.txt"));
            outputStream.writeObject(list);
            outputStream.flush();
            outputStream.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }*/

     /*  try {
           ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("C:\\Users\\Vincent\\Downloads\\sichuan\\full_table.txt"));
           List<TableSiChuan> list  = (List<TableSiChuan>) inputStream.readObject();
           List<TableSiChuan> my = new ArrayList<>();
           for (TableSiChuan tableSiChuan : list){
               if (TextUtils.isEmpty(tableSiChuan.jobCode)){
                   continue;
               }
               if (TextUtils.isEmpty(tableSiChuan.zhuanYe)){
                   my.add(tableSiChuan);
               }else if (tableSiChuan.zhuanYe.contains("电子信息") || tableSiChuan.zhuanYe.contains("不限") ){
                   my.add(tableSiChuan);
               }
           }

           ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Vincent\\Downloads\\sichuan\\my_table.txt"));
           outputStream.writeObject(my);
           outputStream.flush();
           outputStream.close();

       }catch (Exception e){
           System.out.println(e.getMessage());
       }*/
        try {
            ObjectInputStream  inputStream = new ObjectInputStream(new FileInputStream("C:\\Users\\Vincent\\Downloads\\sichuan\\my_table.txt"));
            List<TableSiChuan> list        = (List<TableSiChuan>) inputStream.readObject();

            HSSFWorkbook workbook = new HSSFWorkbook();

            HSSFSheet sheet = workbook.createSheet("sheet");
            for (int i = 0 ; i< list.size() ; i++){
                //创建HSSFRow对象 （行）
                HSSFRow row = sheet.createRow(i);

                TableSiChuan tableSiChuan = list.get(i);
                int start = 0;
                //创建HSSFCell对象  （单元格）
                HSSFCell cell=row.createCell(start);

                //单位名称/招录机关
                //职位类别
                //职位名称
                //录用名额
                //拟任职务
                //职位编码
                //招收范围
                //招收对象
                //学历
                //学位
                //专业
                //其他
                //备注
                //最低服务年限规定
                //政策咨询电话
                //内设机构
                //职位简介
                //设置单元格的值
                cell.setCellValue(tableSiChuan.unitName); start++;cell=row.createCell(start);
                cell.setCellValue(tableSiChuan.jobLeiBie); start++;cell=row.createCell(start);
                cell.setCellValue(tableSiChuan.jobName); start++;cell=row.createCell(start);
                cell.setCellValue(tableSiChuan.needNum); start++;cell=row.createCell(start);
                cell.setCellValue(tableSiChuan.jobLevel); start++;cell=row.createCell(start);
                cell.setCellValue(tableSiChuan.jobCode); start++;cell=row.createCell(start);
                cell.setCellValue(tableSiChuan.fanWei); start++;cell=row.createCell(start);
                cell.setCellValue(tableSiChuan.duiXiang); start++;cell=row.createCell(start);
                cell.setCellValue(tableSiChuan.xueLi); start++;cell=row.createCell(start);
                cell.setCellValue(tableSiChuan.xueWei); start++;cell=row.createCell(start);
                cell.setCellValue(tableSiChuan.zhuanYe); start++;cell=row.createCell(start);
                cell.setCellValue(tableSiChuan.others); start++;cell=row.createCell(start);
                cell.setCellValue(tableSiChuan.beiZhu); start++;cell=row.createCell(start);
                cell.setCellValue(tableSiChuan.lessYears); start++;cell=row.createCell(start);
                cell.setCellValue(tableSiChuan.phone); start++;cell=row.createCell(start);
                cell.setCellValue(tableSiChuan.inerName); start++;cell=row.createCell(start);
                cell.setCellValue(tableSiChuan.jobDesc); start++;
            }

            //输出Excel文件
            FileOutputStream output =new FileOutputStream("C:\\Users\\Vincent\\Downloads\\sichuan\\workbook.xls");
            workbook.write(output);
            output.flush();

            inputStream.close();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }


    public static HashMap<String , SiChuan> getJobCodes(){
        HashMap<String , SiChuan> strings = new HashMap<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Vincent\\Downloads\\sichuan\\1.txt"));
            String         line   = null;
            while ((line = reader.readLine()) != null){
                if (!TextUtils.isEmpty(line)){
                   SiChuan siChuan =  new SiChuan();
                   siChuan.jobCode = line.trim();
                   strings.put(siChuan.jobCode , siChuan);
                }
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        return strings;
    }
    public static List<SiChuan> checkHasNums(HashMap<String,SiChuan> jobs)
            throws Exception
    {
        ArrayList<SiChuan> list    = new ArrayList<>();
        File              fileDir = new File("C:\\Users\\Vincent\\Downloads\\has");
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

                                String first = row.getCell(2).toString();

                                String finalCode = first.toString().trim();

                                if (!TextUtils.isEmpty(finalCode)){

                                    if (jobs.containsKey(finalCode)){
                                        SiChuan current = jobs.get(finalCode);
                                        Integer integer = current.lastNum;
                                        int has = 0;
                                        if (row.getCell(3).getCellType() == CellType.NUMERIC){
                                            has = (int) row.getCell(3).getNumericCellValue();
                                        }else {
                                            String s = row.getCell(3).toString();
                                            has = Integer.parseInt(s);
                                        }

                                        if (has != integer && has > integer){
                                            current.lastNum = has;
                                        }
                                        StringBuffer buffer = new StringBuffer(current.hasing);
                                        buffer.append(has).append(",");
                                        current.hasing = (buffer.toString());
                                        current.jobName = row.getCell(1).toString();
                                        current.unitName = row.getCell(0).toString();
                                        jobs.replace(finalCode , current);
                                    }
                                }

                        }

                    }
                }}
        }

        Iterator<Map.Entry<String, SiChuan>> iterator     = jobs.entrySet().iterator();

        while (iterator.hasNext()){
            SiChuan value = iterator.next().getValue();
            if (value == null){
                continue;
            }
            list.add(value);
        }
        Collections.sort(list);

        return list;
    }


    public static void checkHasNums2(HashMap<String,SiChuan202002> jobs)
            throws Exception
    {
        File   fileDir = new File("C:\\Users\\Vincent\\Downloads\\has");
        File[] files   = fileDir.listFiles();
        for (File tmp : files) {
            if (tmp.getName()
                   .endsWith(".xls"))
            {
                HSSFWorkbook workbook = new HSSFWorkbook(new FileInputStream(tmp));
                HSSFSheet    sheet    = null;
                for (int i = 0; i < workbook.getNumberOfSheets(); i++) {// 获取每个Sheet表
                    sheet = workbook.getSheetAt(i);

                    int LastRowNum = sheet.getLastRowNum() + 1;
                    for (int j = 1; j < LastRowNum; j++) {// getLastRowNum，获取最后一行的行标
                        HSSFRow row = sheet.getRow(j);
                        if (row != null) {

                            String first = row.getCell(2)
                                              .toString();

                            String finalCode = first.toString()
                                                    .trim();

                            if (!TextUtils.isEmpty(finalCode)) {

                                if (jobs.containsKey(finalCode)) {
                                    SiChuan202002 current = jobs.get(finalCode);
                                    Integer       integer = current.getAllnums();
                                    int           has     = 0;
                                    if (row.getCell(3)
                                           .getCellType() == CellType.NUMERIC)
                                    {
                                        has = (int) row.getCell(3)
                                                       .getNumericCellValue();
                                    } else {
                                        String s = row.getCell(3)
                                                      .toString();
                                        has = Integer.parseInt(s);
                                    }

                                    if (has != integer && has > integer) {
                                        current.setAllnums(has);
                                    }
                                    StringBuffer buffer = new StringBuffer(current.getHasing());
                                    buffer.append(has)
                                          .append(",");
                                    current.setHasing(buffer.toString());
                                    jobs.replace(finalCode, current);
                                }
                            }

                        }

                    }

                }
            }
        }
    }


    public static void checkHasNums202101(HashMap<String,SiChuan202101> jobs)
            throws Exception
    {
        File   fileDir = new File("C:\\Users\\Vincent\\Downloads\\2021\\2021_SI_CHUAN\\has");
        File[] files   = fileDir.listFiles();
        for (File tmp : files) {
            if (tmp.getName()
                   .endsWith(".xls"))
            {
                HSSFWorkbook workbook = new HSSFWorkbook(new FileInputStream(tmp));
                HSSFSheet    sheet    = null;
                for (int i = 0; i < workbook.getNumberOfSheets(); i++) {// 获取每个Sheet表
                    sheet = workbook.getSheetAt(i);

                    int LastRowNum = sheet.getLastRowNum() + 1;
                    for (int j = 1; j < LastRowNum; j++) {// getLastRowNum，获取最后一行的行标
                        HSSFRow row = sheet.getRow(j);
                        if (row != null) {

                            String first = row.getCell(2)
                                              .toString();

                            String finalCode = first.toString()
                                                    .trim();

                            if (!TextUtils.isEmpty(finalCode)) {

                                if (jobs.containsKey(finalCode)) {
                                    SiChuan202101 current = jobs.get(finalCode);
                                    Integer       integer = current.getAllnums();
                                    int           has     = 0;
                                    String s = null;
                                    if (row.getCell(3)
                                           .getCellType() == CellType.NUMERIC)
                                    {
                                        has = (int) row.getCell(3)
                                                       .getNumericCellValue();
                                    } else {
                                        s = row.getCell(3).toString();
                                        has = Integer.parseInt(s.substring(1 , s.indexOf(":")).trim());
                                    }

                                    if (has != integer && has > integer) {
                                        current.setAllnums(has);
                                    }
                                    StringBuffer buffer = new StringBuffer(current.getHasing());
                                    buffer.append(TextUtils.isEmpty(current.getHasing()) ? "" : "," ).append(s);
                                    current.setHasing(buffer.toString());
                                    jobs.replace(finalCode, current);
                                }
                            }

                        }

                    }

                }
            }
        }
    }

    static class TableIndex {
        //单位名称/招录机关
        public int unitNameIndex = -1;
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

        @Override
        public String toString() {
            return "TableIndex{" + "unitNameIndex=" + unitNameIndex + ", jobLeiBieIndex=" + jobLeiBieIndex + ", jobNameIndex=" + jobNameIndex + ", needNumIndex=" + needNumIndex + ", jobLevelIndex=" + jobLevelIndex + ", jobCodeIndex=" + jobCodeIndex + ", fanWeiIndex=" + fanWeiIndex + ", duiXiangIndex=" + duiXiangIndex + ", xueLiIndex=" + xueLiIndex + ", xueWeiIndex=" + xueWeiIndex + ", zhuanYeIndex=" + zhuanYeIndex + ", othersIndex=" + othersIndex + ", beiZhuIndex=" + beiZhuIndex + ", lessYearsIndex=" + lessYearsIndex + ", phoneIndex=" + phoneIndex + ", inerNameIndex=" + inerNameIndex + ", jobDescIndex=" + jobDescIndex + '}';
        }
    }

    public static void getRowIndex(String key ,  TableIndex tableIndex , int index){
        switch (key) {
                    case "unitName":
                        tableIndex.unitNameIndex = index;
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


    public static TableSiChuan getData(HSSFRow row , TableIndex tableIndex){
        if(row == null || tableIndex == null) {
            return null;
        }

        TableSiChuan table = new TableSiChuan();

        table.unitName = tableIndex.unitNameIndex == -1 ? "" : row.getCell(tableIndex.unitNameIndex).toString();
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

    public static List<TableSiChuan> getTables() throws Exception{
        ArrayList<TableSiChuan> tableSiChuans = new ArrayList<>();


        File              fileDir = new File("C:\\Users\\Vincent\\Downloads\\2021\\2021_SI_CHUAN\\all");
        File[]            files   = fileDir.listFiles();
        for(File tmp : files){
            if (tmp.getName().endsWith(".xls")){
                HSSFWorkbook workbook = new HSSFWorkbook(new FileInputStream(tmp));
                System.out.println(tmp.getPath());
                HSSFSheet    sheet    = null;
                for (int i = 0; i < workbook.getNumberOfSheets(); i++) {// 获取每个Sheet表
                    sheet = workbook.getSheetAt(i);

                    int LastRowNum = sheet.getLastRowNum() + 1;
                    TableIndex tableIndex = new TableIndex();
                    for (int j = 2; j < LastRowNum; j++) {// getLastRowNum，获取最后一行的行标
                        HSSFRow row = sheet.getRow(j);
                        if (row == null) {
                            continue;
                        }

                        if (j == 2) {
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
                            TableSiChuan table = getData(row, tableIndex);
                            System.out.println("run position = " + j);
                            if (table != null) {
                                tableSiChuans.add(table);
                                //System.out.println(table);
                            }
                        }


                    }
                }
            }
        }
        return tableSiChuans;
    }


    public static void resetSC(){
        //step 1 : get data from table and write ro txt file
        try {
            List<TableSiChuan> list         = getTables();
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Vincent\\Downloads\\2021\\2021_SI_CHUAN\\full_table.txt"));
            outputStream.writeObject(list);
            outputStream.flush();
            outputStream.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        //step 2 : filter
        try {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("C:\\Users\\Vincent\\Downloads\\2021\\2021_SI_CHUAN\\full_table.txt"));
            List<TableSiChuan> list  = (List<TableSiChuan>) inputStream.readObject();
            List<TableSiChuan> my = new ArrayList<>();
            for (TableSiChuan tableSiChuan : list){
                if (TextUtils.isEmpty(tableSiChuan.jobCode)){
                    continue;
                }
                if (TextUtils.isEmpty(tableSiChuan.zhuanYe)){
                    my.add(tableSiChuan);
                }else if (tableSiChuan.zhuanYe.contains("电子信息") || tableSiChuan.zhuanYe.contains("不限") ){
                    my.add(tableSiChuan);
                }
            }

            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Vincent\\Downloads\\2021\\2021_SI_CHUAN\\my_table.txt"));
            outputStream.writeObject(my);
            outputStream.flush();
            outputStream.close();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }


        try {
            ObjectInputStream  inputStream = new ObjectInputStream(new FileInputStream("C:\\Users\\Vincent\\Downloads\\2021\\2021_SI_CHUAN\\my_table.txt"));
            List<TableSiChuan> list        = (List<TableSiChuan>) inputStream.readObject();

            HSSFWorkbook workbook = new HSSFWorkbook();

            HSSFSheet sheet = workbook.createSheet("sheet");
            for (int i = 0 ; i< list.size() ; i++){
                //创建HSSFRow对象 （行）
                HSSFRow row = sheet.createRow(i);

                TableSiChuan tableSiChuan = list.get(i);
                int start = 0;
                //创建HSSFCell对象  （单元格）
                HSSFCell cell=row.createCell(start);

                //单位名称/招录机关
                //职位类别
                //职位名称
                //录用名额
                //拟任职务
                //职位编码
                //招收范围
                //招收对象
                //学历
                //学位
                //专业
                //其他
                //备注
                //最低服务年限规定
                //政策咨询电话
                //内设机构
                //职位简介
                //设置单元格的值
                cell.setCellValue(tableSiChuan.unitName); start++;cell=row.createCell(start);
                cell.setCellValue(tableSiChuan.jobLeiBie); start++;cell=row.createCell(start);
                cell.setCellValue(tableSiChuan.jobName); start++;cell=row.createCell(start);
                cell.setCellValue(tableSiChuan.needNum); start++;cell=row.createCell(start);
                cell.setCellValue(tableSiChuan.jobLevel); start++;cell=row.createCell(start);
                cell.setCellValue(tableSiChuan.jobCode); start++;cell=row.createCell(start);
                cell.setCellValue(tableSiChuan.fanWei); start++;cell=row.createCell(start);
                cell.setCellValue(tableSiChuan.duiXiang); start++;cell=row.createCell(start);
                cell.setCellValue(tableSiChuan.xueLi); start++;cell=row.createCell(start);
                cell.setCellValue(tableSiChuan.xueWei); start++;cell=row.createCell(start);
                cell.setCellValue(tableSiChuan.zhuanYe); start++;cell=row.createCell(start);
                cell.setCellValue(tableSiChuan.others); start++;cell=row.createCell(start);
                cell.setCellValue(tableSiChuan.beiZhu); start++;cell=row.createCell(start);
                cell.setCellValue(tableSiChuan.lessYears); start++;cell=row.createCell(start);
                cell.setCellValue(tableSiChuan.phone); start++;cell=row.createCell(start);
                cell.setCellValue(tableSiChuan.inerName); start++;cell=row.createCell(start);
                cell.setCellValue(tableSiChuan.jobDesc); start++;
            }

            //输出Excel文件
            FileOutputStream output =new FileOutputStream("C:\\Users\\Vincent\\Downloads\\2021\\2021_SI_CHUAN\\workbook.xls");
            workbook.write(output);
            output.flush();

            inputStream.close();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}
