package com.luoxiang.project;


import com.luoxiang.poi.PoiSC02;
import com.luoxiang.poi.PoiSZ2020;
import com.luoxiang.project.domain.ShenZheng2020;
import com.luoxiang.project.domain.SiChuan;
import com.luoxiang.project.po.GuangXi202101;
import com.luoxiang.project.po.HeNan202101;
import com.luoxiang.project.po.HuBei202101;
import com.luoxiang.project.po.Jd2021;
import com.luoxiang.project.po.SiChuan202101;
import com.luoxiang.project.po.YunNan202101;
import com.luoxiang.project.service.ArmyService;
import com.luoxiang.project.service.GuangXiService;
import com.luoxiang.project.service.HeNanService;
import com.luoxiang.project.service.HuBeiService;
import com.luoxiang.project.service.ScService;
import com.luoxiang.project.service.YunNanService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import javax.annotation.Resource;

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

    @RequestMapping("sz2020")
    public String shenzheng2020(Model model){
        String allCode = "2003AC010,2003AC011,2003BC002,2003BC003,2003BN003,2003FC005,2003FG043,2003FG078,2003FG108,2003FL101,2003FN003,2003GC002";
        try {
            List<ShenZheng2020> result = PoiSZ2020.checkHasNums(allCode);

            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("<ul>");
            Iterator<ShenZheng2020> iterator = result.iterator();
            while (iterator.hasNext()){
                ShenZheng2020 value = iterator.next();
                stringBuffer.append("<li>");
                stringBuffer.append(value.toString());
                stringBuffer.append("</li>");
            }
            stringBuffer.append("</ul>");
            model.addAttribute("comm_data" , stringBuffer.toString());
        } catch (Exception e) {
            e.printStackTrace();
            model.addAttribute("comm_data" , e.getMessage());
        }
        return "comm";
    }


    @RequestMapping("yn2020_trans")
    public String yn2020Trans(Model model){
        String allCode = "2001,3003,3005";
        try {
            List<ShenZheng2020> result = PoiSZ2020.checkHasNums(allCode);

            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("<ul>");
            Iterator<ShenZheng2020> iterator = result.iterator();
            while (iterator.hasNext()){
                ShenZheng2020 value = iterator.next();
                stringBuffer.append("<li>");
                stringBuffer.append(value.toString());
                stringBuffer.append("</li>");
            }
            stringBuffer.append("</ul>");
            model.addAttribute("comm_data" , stringBuffer.toString());
        } catch (Exception e) {
            e.printStackTrace();
            model.addAttribute("comm_data" , e.getMessage());
        }
        return "comm";
    }




    @Resource
      public HuBeiService huBeiServiceImpl;

    @RequestMapping("hubei202101")
    public String hubei202101(Model model ,  int cmp , boolean filter , boolean skip ){
        if (!skip){
            huBeiServiceImpl.update();
        }

        List<HuBei202101> all = huBeiServiceImpl.sortAll(cmp , filter);

        StringBuffer            stringBuffer = new StringBuffer();
        stringBuffer.append("<ul>");
        for (HuBei202101 gov : all) {
            stringBuffer.append("<li>");
            stringBuffer.append(gov.showData());
            stringBuffer.append("</li>");
            stringBuffer.append("<br></br>");
        }
        stringBuffer.append("</ul>");

        model.addAttribute("comm_data" , stringBuffer.toString());
        return "comm";
    }



    @Resource
    public YunNanService yunNanServiceImpl;

    @RequestMapping("yunnan202101")
    public String yunnan202101(Model model ,  int cmp , boolean filter , boolean skip ){
        if (!skip){
            yunNanServiceImpl.update();
        }

        List<YunNan202101> all = yunNanServiceImpl.sortAll(cmp , filter);

        StringBuffer            stringBuffer = new StringBuffer();
        stringBuffer.append("<ul>");
        for (YunNan202101 gov : all) {
            stringBuffer.append("<li>");
            stringBuffer.append(gov.showData());
            stringBuffer.append("</li>");
            stringBuffer.append("<br></br>");
        }
        stringBuffer.append("</ul>");

        model.addAttribute("comm_data" , stringBuffer.toString());
        return "comm";
    }


    @Resource
    public HeNanService heNanServiceImpl;

    @RequestMapping("henan202101")
    public String henan202101(Model model ,  int cmp , boolean filter , boolean skip ){
        if (!skip){
            heNanServiceImpl.update();
        }

        List<HeNan202101> all = heNanServiceImpl.sortAll(cmp , filter);

        StringBuffer            stringBuffer = new StringBuffer();
        stringBuffer.append("<ul>");
        for (HeNan202101 gov : all) {
            stringBuffer.append("<li>");
            stringBuffer.append(gov.showData());
            stringBuffer.append("</li>");
            stringBuffer.append("<br></br>");
        }
        stringBuffer.append("</ul>");

        model.addAttribute("comm_data" , stringBuffer.toString());
        return "comm";
    }


    @Resource
    public ScService scServiceImpl;

    @RequestMapping("sichuan202101")
    public String sichuan202101(Model model ,  int cmp , boolean filter , boolean skip ){
        if (!skip){
            scServiceImpl.update202101();
        }

        List<SiChuan202101> all = scServiceImpl.sortAll202101(cmp , filter);

        StringBuffer            stringBuffer = new StringBuffer();
        stringBuffer.append("<ul>");
        for (SiChuan202101 gov : all) {
            stringBuffer.append("<li>");
            stringBuffer.append(gov.showData());
            stringBuffer.append("</li>");
            stringBuffer.append("<br></br>");
        }
        stringBuffer.append("</ul>");

        model.addAttribute("comm_data" , stringBuffer.toString());
        return "comm";
    }


    @Resource
    public GuangXiService guangXiServiceImpl;

    @RequestMapping("guangxi202101")
    public String guangxi202101(Model model ,  int cmp , boolean filter , boolean skip ){
        if (!skip){
            guangXiServiceImpl.update202101();
        }

        List<GuangXi202101> all = guangXiServiceImpl.sortAll202101(cmp , filter);

        StringBuffer            stringBuffer = new StringBuffer();
        stringBuffer.append("<ul>");
        for (GuangXi202101 gov : all) {
            stringBuffer.append("<li>");
            stringBuffer.append(gov.showData());
            stringBuffer.append("</li>");
            stringBuffer.append("<br></br>");
        }
        stringBuffer.append("</ul>");

        model.addAttribute("comm_data" , stringBuffer.toString());
        return "comm";
    }


    @Resource
    public ArmyService armyServiceImpl;

    @RequestMapping("army2021")
    public String army2021(Model model ,  int cmp , boolean skip ){
        //   http://localhost:8080/comm/army2021?cmp=10&skip=false
        if (!skip){
            armyServiceImpl.update2021();
        }

        List<Jd2021> all = armyServiceImpl.sortAll2021(cmp);

        StringBuffer            stringBuffer = new StringBuffer();
        stringBuffer.append("<ul>");
        for (Jd2021 gov : all) {
            stringBuffer.append("<li>");
            stringBuffer.append(gov.showData());
            stringBuffer.append("</li>");
            stringBuffer.append("<br></br>");
        }
        stringBuffer.append("</ul>");

        model.addAttribute("comm_data" , stringBuffer.toString());
        return "comm";
    }

    @RequestMapping("mian_yang_2021_01")
    public String mian_yang_2021_01(Model model ,  int cmp , boolean skip ){
        //   http://localhost:8080/comm/army2021?cmp=10&skip=false
        if (!skip){
            armyServiceImpl.update2021();
        }

        List<Jd2021> all = armyServiceImpl.sortAll2021(cmp);

        StringBuffer            stringBuffer = new StringBuffer();
        stringBuffer.append("<ul>");
        for (Jd2021 gov : all) {
            stringBuffer.append("<li>");
            stringBuffer.append(gov.showData());
            stringBuffer.append("</li>");
            stringBuffer.append("<br></br>");
        }
        stringBuffer.append("</ul>");

        model.addAttribute("comm_data" , stringBuffer.toString());
        return "comm";
    }

}
