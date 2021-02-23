package com.luoxiang.project.bean;

/**
 * projectName: 	    com.luoxiang.parent
 * packageName:	        com.luoxiang.project.bean
 * className:	        FuJianBean
 * author:	            Luoxiang
 * time:	            2021/2/23	9:11
 * desc:	            TODO
 *
 * svnVersion:	        $Rev
 * upDateAuthor:	    Vincent
 * upDate:	            2021/2/23
 * upDateDesc:	        TODO
 */


public class FuJianBean {

    public String unit_code_name;
    public String job_code_name;
    public String unit_parent;
    public String unit_area;
    public String job_addr;
    public String job_level;
    public String test_class;
    public String need_num;
    public String fan_wei;
    public String chu_sheng_y_m;
    public String sex;
    public String min_zu;
    public String zheng_zhi;
    public String xue_li;
    public String xue_wei;
    public String xue_li_class;
    public String job_yao_qiu;
    public String zhuan_men_job;
    public String zhuan_ye;
    public String job_desc;
    public String qi_ta;
    public String bei_zhu;
    public String phone;

    @Override
    public String toString() {
        //INSERT INTO table_name (列1, 列2,...) VALUES (值1, 值2,....)
        String[] unit = unit_code_name.split(" ");
        String[] job = job_code_name.split(" ");
        return  String.format("insert into fu_jian_2021_01(unit_code,unit_name,job_code,job_name,unit_parent,unit_area,job_addr,job_level,test_class,need_num,fan_wei,chu_sheng_y_m,sex,min_zu,zheng_zhi,xue_li,xue_wei,xue_li_class,job_yao_qiu,zhuan_men_job,zhuan_ye,job_desc,qi_ta,bei_zhu,phone) values('%s' , '%s' , '%s' , '%s' , '%s' ,'%s' , '%s' , '%s' , '%s' , '%s' ,'%s' , '%s' , '%s' , '%s' , '%s' ,'%s' , '%s' , '%s' , '%s' , '%s' ,'%s' , '%s' , '%s' , '%s', '%s' );" , unit[0], unit[1],job[0] , job[1],unit_parent,unit_area,job_addr,job_level,test_class,need_num,fan_wei,chu_sheng_y_m,sex,min_zu,zheng_zhi,xue_li,xue_wei,xue_li_class,job_yao_qiu,zhuan_men_job,zhuan_ye,job_desc,qi_ta,bei_zhu,phone );
    }

}
