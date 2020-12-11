package com.luoxiang.project;

import com.luoxiang.project.bean.CommBean;
import com.luoxiang.project.po.ZheJiang2020;
import com.luoxiang.project.service.ZheJiangService;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpException;
import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseInterceptor;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.protocol.BasicHttpProcessor;
import org.apache.http.protocol.HTTP;
import org.apache.http.protocol.HttpContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import javax.annotation.Resource;

/**
 * projectName: 	    com.luoxiang.parent
 * packageName:	        com.luoxiang.project
 * className:	        ZhejiangController
 * author:	            Luoxiang
 * time:	            2019/12/20	22:05
 * desc:	            TODO
 *
 * svnVersion:	        $Rev
 * upDateAuthor:	    Vincent
 * upDate:	            2019/12/20
 * upDateDesc:	        TODO
 */

@Controller
@RequestMapping("zhejiang")
public class ZhejiangController {
    @Resource
    public ZheJiangService zheJiangServiceImpl;

    Runnable executorTask;


    @RequestMapping("update")
    public @ResponseBody
    CommBean update(int limit){
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(2);
        executorTask = new Runnable() {
            @Override
            public void run() {
                scheduledExecutorService.schedule(executorTask , 20 , TimeUnit.MINUTES );

                HttpResponseInterceptor contentEncodingFixerInterceptor = new HttpResponseInterceptor() {
                    @Override
                    public void process(HttpResponse response, HttpContext context)
                            throws HttpException, IOException
                    {
                        Header contentEncodingHeader = response.getFirstHeader(HTTP.CONTENT_ENCODING);
                        if (contentEncodingHeader != null && contentEncodingHeader.getValue()
                                                                                  .equalsIgnoreCase(
                                                                                          "none"))
                        {
                            response.removeHeaders(HTTP.CONTENT_ENCODING);
                            response.addHeader(HTTP.CONTENT_ENCODING, "identity");
                        }
                    }
                };
                BasicHttpProcessor httpProcessor = new BasicHttpProcessor();
                httpProcessor.addInterceptor(contentEncodingFixerInterceptor);

                String dirName = "C:\\Users\\Vincent\\Downloads\\has";

                String     url        = "https://ouma-zjgwy2019.oss-cn-haidian-a.aliyuncs.com/ec3d5e07aca9d69560342a206f66ad778fb2e87f2ca26534";
                HttpClient httpClient = HttpClients.custom()
                                                   .setHttpProcessor(httpProcessor)
                                                   .build();
                HttpGet    httpGet    = new HttpGet(url);

                httpGet.addHeader("Accept",
                                  "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3");
                httpGet.addHeader("Accept-Encoding", "gzip, deflate, br");
                httpGet.addHeader("Accept-Language", "zh-CN,zh;q=0.9");
                httpGet.addHeader("Connection", "keep-alive");
                httpGet.addHeader("Host", "ouma-zjgwy2019.oss-cn-haidian-a.aliyuncs.com");
                httpGet.addHeader("If-None-Match", "D5829EDD0C35658C05E55315B37D3858");
                httpGet.addHeader("Sec-Fetch-Mode", "navigate");
                httpGet.addHeader("Sec-Fetch-Site", "none");
                httpGet.addHeader("Sec-Fetch-User", "?1");
                httpGet.addHeader("Upgrade-Insecure-Requests", "1");
                httpGet.addHeader("User-Agent",
                                  "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/76.0.3809.132 Safari/537.36");
                httpGet.addHeader("If-Modified-Since", "Tue, 24 Dec 2019 13:19:20 GMT");


                try {
                    HttpResponse execute = httpClient.execute(httpGet,
                                                              new ResponseHandler<HttpResponse>() {
                                                                  @Override
                                                                  public HttpResponse handleResponse(
                                                                          HttpResponse httpResponse)
                                                                          throws
                                                                          ClientProtocolException,
                                                                          IOException
                                                                  {
                                                                      HttpEntity entity     = httpResponse.getEntity();
                                                                      Header[]   allHeaders = httpResponse.getAllHeaders();
                                                                      String     fileName   = System.currentTimeMillis() + "_.xls";
                                                                      for (Header tmp : allHeaders) {
                                                                          if (tmp.getName()
                                                                                 .equals("Content-Disposition"))
                                                                          {
                                                                              String value = tmp.getValue();
                                                                              String str;
                                                                              byte[] bytes = value.substring(
                                                                                      value.lastIndexOf(
                                                                                              "=") + 1)
                                                                                                  .getBytes(
                                                                                                          "ISO-8859-1");

                                                                              str = new String(bytes,
                                                                                               "UTF-8").trim();
                                                                              if (str != null && str.trim() != "") {
                                                                                  //fileName = str;
                                                                                  if (entity != null) {
                                                                                      InputStream      inputStream  = entity.getContent();
                                                                                      FileOutputStream outputStream = null;
                                                                                      try {
                                                                                          outputStream = new FileOutputStream(
                                                                                                  new File(
                                                                                                          dirName,
                                                                                                          fileName));
                                                                                          byte data[] = new byte[1024];
                                                                                          int  count;
                                                                                          while ((count = inputStream.read(
                                                                                                  data,
                                                                                                  0,
                                                                                                  1024)) != -1) {
                                                                                              outputStream.write(
                                                                                                      data,
                                                                                                      0,
                                                                                                      count);
                                                                                          }

                                                                                      } catch (IOException e) {
                                                                                          e.printStackTrace();
                                                                                      } finally {
                                                                                          try {
                                                                                              if (inputStream != null) {
                                                                                                  inputStream.close();
                                                                                              }
                                                                                              if (outputStream != null) {
                                                                                                  outputStream.close();
                                                                                              }
                                                                                              zheJiangServiceImpl.update(
                                                                                                      limit);
                                                                                            } catch (IOException e) {
                                                                                              e.printStackTrace();
                                                                                          }
                                                                                      }
                                                                                  }
                                                                              }
                                                                          }
                                                                      }


                                                                      return null;
                                                                  }
                                                              });


                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        };
       // ScheduledExecutorTask task = new ScheduledExecutorTask(executorTask, 1000 * 60);


        scheduledExecutorService.schedule(executorTask , 1 , TimeUnit.MINUTES );

        return zheJiangServiceImpl.update(limit);
    }



    @RequestMapping("refresh_zj_2020")
    public String refreshZJ2020(Model model , boolean skip , int cmp , boolean filter){
        try {
            if (!skip){
                zheJiangServiceImpl.update2();
            }
            List<ZheJiang2020> result = zheJiangServiceImpl.sortAll(cmp , filter);

            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("<ul>");
            Iterator<ZheJiang2020> iterator = result.iterator();
            while (iterator.hasNext()){
                ZheJiang2020 value = iterator.next();
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
}
