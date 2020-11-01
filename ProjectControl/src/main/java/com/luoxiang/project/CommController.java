package com.luoxiang.project;


import com.luoxiang.poi.PoiSC02;
import com.luoxiang.project.domain.SiChuan;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.List;

/**
 * projectName: 	    com.luoxiang.parent
 * packageName:	        com.luoxiang.project
 * className:	        CommController
 * author:	            Luoxiang
 * time:	            2020/11/1	8:43
 * desc:	            TODO
 *
 * svnVersion:	        $Rev
 * upDateAuthor:	    Vincent
 * upDate:	            2020/11/1
 * upDateDesc:	        TODO
 */

@Controller
@RequestMapping("comm")
public class CommController {

    @RequestMapping("sichuan02")
    public String sichuan(Model model){

        try {
            HashMap<String , SiChuan> maps =  PoiSC02.getJobCodes();
            List<SiChuan> list = PoiSC02.checkHasNums(maps);
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("<ul>");
            /**
            Iterator<Map.Entry<String, SiChuan>> iterator = maps.entrySet().iterator();

            while (iterator.hasNext()){
                SiChuan value = iterator.next().getValue();
                if (value == null){
                    continue;
                }

                stringBuffer.append("<li>");
                stringBuffer.append(value.toString());
                stringBuffer.append("</li>");
            }
             **/
            for (SiChuan value : list){
                if (value == null){
                    continue;
                }

                stringBuffer.append("<li>");
                stringBuffer.append(value.toString());
                stringBuffer.append("</li>");
            }
            stringBuffer.append("</ul>");
            model.addAttribute("comm_data" , stringBuffer.toString());
        }catch (Exception e){
            model.addAttribute("comm_data" , e.getMessage());
        }

        return "comm";
    }
}
