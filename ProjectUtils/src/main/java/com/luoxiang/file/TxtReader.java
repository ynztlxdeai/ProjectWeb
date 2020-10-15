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

    public static void  main(String[] args){
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Vincent\\Downloads\\1.txt"));
            String         line      = null;
            ArrayList<String> need = new ArrayList<>();
            ArrayList<String> unneed = new ArrayList<>();
            while ((line = reader.readLine()) != null){
                if (!TextUtils.isEmpty(line)){
                    if (line.contains("不限") || line.contains("电子信息")){
                        need.add(line);
                    }else {
                        unneed.add(line);
                    }
                }
            }
            reader.close();

            int start = 0;
            int time = unneed.size() / 40;
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\Vincent\\Downloads\\1.sql"));
            for (int t = 0; t < time + 1 ; t++) {
                StringBuffer stringBuffer = new StringBuffer("DELETE FROM gk_2021_copy WHERE zhuan_ye in (");
                int lenth = start + 40;
                if (time == t){
                    lenth = unneed.size();
                }
                for (int i = start ; i < lenth ; i++){
                    stringBuffer.append(unneed.get(i)).append(",");
                }
                stringBuffer.append("'');");
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
