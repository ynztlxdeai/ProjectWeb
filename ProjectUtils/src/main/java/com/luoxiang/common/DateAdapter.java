package com.luoxiang.common;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.bind.annotation.adapters.XmlAdapter;


/**   
 * @description: json格式时间  
 * @fileName:DateAdapter.java 
 * @createTime:2014年8月21日 下午3:46:02  
 * @author:肖震 
 * @version 1.0.0  
 *    
 */
public class DateAdapter extends XmlAdapter<String, Date>
{
	private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
	 
    @Override 
    public String marshal(Date v) throws Exception { 
        return dateFormat.format(v); 
    } 
 
    @Override 
    public Date unmarshal(String v) throws Exception { 
        return dateFormat.parse(v); 
    } 
}
  
