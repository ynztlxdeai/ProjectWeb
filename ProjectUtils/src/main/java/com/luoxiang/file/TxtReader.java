package com.luoxiang.file;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.luoxiang.project.bean.FuJianBean;

import org.apache.http.util.TextUtils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

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
        //readSingle();
        //readIndex();
        String s =  readToString("C:\\Users\\Vincent\\Downloads\\2021\\1.txt");
        Gson gson = new Gson();
        List<FuJianBean> list = gson.fromJson(s, new TypeToken<List<FuJianBean>>(){}.getType());
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\Vincent\\Downloads\\2021\\1.sql"));
            for (FuJianBean f : list) {
                bufferedWriter.write(f.toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void readIndex(){
        try {
            FileInputStream inputStream = new FileInputStream("C:\\Users\\Vincent\\Downloads\\2021\\1.txt");


        }catch (Exception e){

        }
    }

    public static String readToString(String fileName) {
        String encoding    = "UTF-8";
        File   file        = new File(fileName);
        Long   filelength  = file.length();
        byte[] filecontent = new byte[filelength.intValue()];
        try {
            FileInputStream in = new FileInputStream(file);
            in.read(filecontent);
            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            return new String(filecontent, encoding);
        } catch (UnsupportedEncodingException e) {
            System.err.println("The OS does not support " + encoding);
            e.printStackTrace();
            return null;
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
