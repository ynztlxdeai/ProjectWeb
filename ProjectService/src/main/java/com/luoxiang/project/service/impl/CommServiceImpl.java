package com.luoxiang.project.service.impl;

import com.luoxiang.poi.PoiSC;
import com.luoxiang.project.bean.MianYang202101;
import com.luoxiang.project.service.CommService;

import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * projectName: 	    com.luoxiang.parent
 * packageName:	        com.luoxiang.project.service.impl
 * className:	        CommServiceImpl
 * author:	            Luoxiang
 * time:	            2020/11/17	20:02
 * desc:	            TODO
 *
 * svnVersion:	        $Rev
 * upDateAuthor:	    Vincent
 * upDate:	            2020/11/17
 * upDateDesc:	        TODO
 */

@Service
public class CommServiceImpl implements CommService {

    @Override
    public List<MianYang202101> update202101() {
        String dataFile = "C:\\Users\\Vincent\\Downloads\\2021\\2021_01_MIAN_YANG\\dataFile";
        File file = new File(dataFile);
        ArrayList<MianYang202101> list = null;
        ObjectOutputStream outputStream = null;
        if (!file.exists()){
            String[] jobs = {
                    "3109017", "3100024","3100031", "3100034","1108017", "1102004"
            };
            list = new ArrayList<>(jobs.length);
            for (String s : jobs){
                MianYang202101 m = new MianYang202101();
                m.jobCode = s;
                m.ingNum = "";
                list.add(m);
            }
            try {
                outputStream = new ObjectOutputStream(new FileOutputStream(file));
                outputStream.writeObject(list);
                outputStream.flush();
                outputStream.close();
                outputStream = null;
            }catch (Exception e){
                e.printStackTrace();
            }
        }

        try {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file));
            list = (ArrayList<MianYang202101>) inputStream.readObject();
            inputStream.close();
            inputStream = null;

            PoiSC.checkMY202101(list);

            outputStream = new ObjectOutputStream(new FileOutputStream(file));
            outputStream.writeObject(list);
            outputStream.flush();
            outputStream.close();
            outputStream = null;
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }
}
