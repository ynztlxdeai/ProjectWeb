package com.luoxiang.file;

import org.apache.http.util.TextUtils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

/**
 * projectName: 	    com.luoxiang.parent
 * packageName:	        com.luoxiang.file
 * className:	        TxtReader
 * author:	            Luoxiang
 * time:	            2020/10/14	21:20
 * desc:	            TODO
 *
 * svnVersion:	        $Rev
 * upDateAuthor:	    Vincent
 * upDate:	            2020/10/14
 * upDateDesc:	        TODO
 */


public class TxtReader {

    public static final int STEP_SIZE = 3;

    public static void  main(String[] args) {
        readSingle();
        //readIndex();
    }

    public static void readIndex(){
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Vincent\\Downloads\\2.txt"));


        }catch (Exception e){

        }
    }

    public static void readSingle(){
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Vincent\\Downloads\\1.txt"));
            String         line      = null;
            ArrayList<String> need = new ArrayList<>();
            ArrayList<String> unneed = new ArrayList<>();
            while ((line = reader.readLine()) != null){
                if (!TextUtils.isEmpty(line)){
                    //if (line.contains("不限") || line.contains("教育类") || line.contains("中文文秘类") || line.contains("汉语国际教育")){
                    if (line.contains("不限") || line.contains("电子信息")){
                        need.add(line);
                    }else {
                        unneed.add(line);
                    }
                }
                need.add(line);
            }
            reader.close();

            int start = 0;
            int time = unneed.size() / STEP_SIZE;
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\Vincent\\Downloads\\1.sql"));
            for (int t = 0; t < time + 1 ; t++) {
                StringBuffer stringBuffer = new StringBuffer("DELETE FROM shan_dong_2020_02 WHERE da_xue_ben_ke in (");
                int lenth = start + STEP_SIZE;
                if (time == t){
                    lenth = unneed.size();
                }
                for (int i = start ; i < lenth ; i++){
                    stringBuffer.append(unneed.get(i));
                    if (i < (lenth-1)){
                        stringBuffer.append(",");
                    }
                }
                stringBuffer.append(");");
                bufferedWriter.write(stringBuffer.toString());
                bufferedWriter.newLine();

                System.out.println(stringBuffer);
                System.out.println("");
                System.out.println("");
                start = lenth;
            }


            bufferedWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}
