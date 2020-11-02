package com.luoxiang.project;

/**
 * projectName: 	    com.luoxiang.parent
 * packageName:	        com.luoxiang.project
 * className:	        SiChuan202002Controller
 * author:	            Luoxiang
 * time:	            2020/11/2	9:51
 * desc:	            TODO
 *
 * svnVersion:	        $Rev
 * upDateAuthor:	    Vincent
 * upDate:	            2020/11/2
 * upDateDesc:	        TODO
 */


import com.luoxiang.project.po.SiChuan202002;
import com.luoxiang.project.service.SiChuan202002Service;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collections;
import java.util.List;

import javax.annotation.Resource;

@Controller
@RequestMapping("sichuan202002")
public class SiChuan202002Controller {
    @Resource
    public SiChuan202002Service siChuan202002ServiceImpl;

    @RequestMapping("update")
    public String update(Model model){
        siChuan202002ServiceImpl.update(0);
        List<SiChuan202002> siChuan202002s = siChuan202002ServiceImpl.selectAll();
        Collections.sort(siChuan202002s);

        StringBuffer            stringBuffer = new StringBuffer();
        stringBuffer.append("<ul>");
        for (int i = 0; i < siChuan202002s.size(); i++) {
            stringBuffer.append("<li>");
            stringBuffer.append(siChuan202002s.get(i).showData());
            stringBuffer.append("</li>");
        }
        stringBuffer.append("</ul>");

        model.addAttribute("comm_data" , stringBuffer.toString());
        return "comm";
    }
}
