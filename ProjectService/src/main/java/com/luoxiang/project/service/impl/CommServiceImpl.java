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
import java.util.Collections;
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
            try {
                String all = "通泉镇便民服务中心 ### 1106002 ### 不限 ### 1 ### 县项目推进服务中心 ### 1106003 ### 不限 ### 1 ### 平武县统筹城乡工作服务中心 ### 1107007 ### 不限 ### 1 ### 平武县江油关镇就业和社会保障服务中心 ### 1107011 ### 不限 ### 1 ### 平武县旧堡羌族乡文化宣传和旅游服务中心 ### 1107012 ### 不限 ### 1 ### 平武县虎牙藏族乡就业和社会保障服务中心 ### 1107013 ### 不限 ### 1 ### 平武县龙安镇便民服务中心 ### 1107014 ### 不限 ### 1 ### 平武县坝子乡文化宣传和旅游服务中心 ### 1107015 ### 不限 ### 1 ### 平武县木座藏族乡农业综合服务中心 ### 1107016 ### 不限 ### 1 ### 平武县阔达藏族乡文化宣传和旅游服务中心 ### 1107017 ### 不限 ### 1 ### 平武县古城镇就业和社会保障服务中心 ### 1107018 ### 不限 ### 1 ### 梓潼县电子商务发展中心 ### 1109003 ### 不限 ### 1 ### 梓潼县青少年宫 ### 1109004 ### 不限 ### 1 ### 梓潼县观义中心敬老院 ### 1109005 ### 不限 ### 1 ### 梓潼县长卿镇自然资源所 ### 1109006 ### 不限 ### 1 ### 梓潼县文兴镇自然资源所 ### 1109007 ### 不限 ### 1 ### 梓潼县宝石乡农民工服务中心 ### 1109008 ### 不限 ### 1 ### 梓潼县仁和镇农民工服务中心 ### 1109009 ### 不限 ### 1 ### 梓潼县自强镇便民服务中心 ### 1109010 ### 不限 ### 1 ### 梓潼县长卿镇便民服务中心 ### 1109011 ### 不限 ### 1 ### 梓潼县黎雅镇农业服务中心 ### 1109012 ### 不限 ### 1 ### 梓潼县人民医院 ### 3109017 ### 本科：计算机科学与技术、软件工程、网络工程、信息安全、电子信息工程、电子科学与技术、微电子科学与工程、微电子学 研究生：计算机系统结构、计算机软件与理论、计算机应用技术 ### 2 ### 三台县人大信息中心 ### 1105001 ### 不限 ### 1 ### 三台县芦溪镇综合行政执法队 ### 1105006 ### 不限 ### 2 ### 三台县西平镇投资促进服务中心 ### 1105007 ### 不限 ### 1 ### 三台县龙树镇宣传文化服务中心 ### 1105008 ### 不 ### 1 ### 绵阳市游仙区涪江街道便民服务中心 ### 1102002 ### 不限 ### 1 ### 绵阳市游仙区生产力促进中心 ### 1102004 ### 本科：电子信息工程、电子科学与技术、管理科学、软件工程、计算机软件、金融学研究生：不限 ### 1 ### 乡镇便民服务中心 ### 1108015 ### 不限 ### 9 ### 乡镇农民工服务中心 ### 1108016 ### 不限 ### 11 ### 盐亭县政务服务和大数据管理中心 ### 1108017 ### 本科：信息与计算科学、电子信息工程、计算机科学与技术、软件工程、网络工程、信息管理与信息系统、电子信息科学与技术、智能科学与技术、电子与计算机工程、数据科学与大数据技术、信息安全、网络空间安全、空间信息与数字技术、新媒体技术 ### 1 ###";
                /**
                BufferedReader    reader = new BufferedReader(new FileReader("C:\\Users\\Vincent\\Downloads\\1.txt"));
                String            line   = null;
                list = new ArrayList<>();
                while ((line = reader.readLine()) != null){
                    if (!TextUtils.isEmpty(line)){
                        line = new String(line.getBytes() , "utf-8");
                        String[] strings = line.split("###");
                        MianYang202101 m = new MianYang202101();
                        m.unitName = strings[0];
                        m.jobCode = strings[1];
                        m.zhuanYe = strings[2];
                        m.needNum = Integer.parseInt(strings[3].trim());
                        m.ingNum = "";
                        m.allNum = 0;
                        list.add(m);
                    }
                }
                reader.close();
                 **/
                list = new ArrayList<>();
                String[] strings = all.split("###");
                for (int i = 0; i < strings.length; i += 4) {
                    MianYang202101 m = new MianYang202101();
                    m.unitName = strings[i];
                    m.jobCode = strings[i + 1].trim();
                    m.zhuanYe = strings[i + 2];
                    m.needNum = Integer.parseInt(strings[i + 3].trim());
                    m.ingNum = "";
                    m.allNum = 0;
                    list.add(m);
                }

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

            list = (ArrayList<MianYang202101>) PoiSC.checkMY202101(list);

            outputStream = new ObjectOutputStream(new FileOutputStream(file));
            outputStream.writeObject(list);
            outputStream.flush();
            outputStream.close();
            outputStream = null;
        }catch (Exception e){
            e.printStackTrace();
        }
        Collections.sort(list);
        return list;
    }
}
