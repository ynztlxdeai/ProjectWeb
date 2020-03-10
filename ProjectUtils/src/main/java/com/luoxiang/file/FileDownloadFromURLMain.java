package com.luoxiang.file;

import org.apache.commons.io.FileUtils;
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

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

/**
 * projectName: 	    com.luoxiang.parent
 * packageName:	        com.luoxiang.file
 * className:	        FileDownloadFromURLMain
 * author:	            Luoxiang
 * time:	            2019/12/24	21:21
 * desc:	            TODO
 *
 * svnVersion:	        $Rev
 * upDateAuthor:	    Vincent
 * upDate:	            2019/12/24
 * upDateDesc:	        TODO
 */


public class FileDownloadFromURLMain {


    public static void main(String [] args) {

        HttpResponseInterceptor contentEncodingFixerInterceptor = new HttpResponseInterceptor()  {
            @Override
            public void process(HttpResponse response, HttpContext context) throws
                                                                            HttpException, IOException {
                Header contentEncodingHeader = response.getFirstHeader(HTTP.CONTENT_ENCODING);
                if(contentEncodingHeader != null && contentEncodingHeader.getValue().equalsIgnoreCase("none")) {
                    response.removeHeaders(HTTP.CONTENT_ENCODING);
                    response.addHeader(HTTP.CONTENT_ENCODING, "identity");
                }
            }
        };
        BasicHttpProcessor httpProcessor = new BasicHttpProcessor();
        httpProcessor.addInterceptor(contentEncodingFixerInterceptor);

        String dirName = "C:\\Users\\Vincent\\Downloads\\has";

        String     url        = "https://ouma-zjgwy2019.oss-cn-haidian-a.aliyuncs.com/ec3d5e07aca9d69560342a206f66ad778fb2e87f2ca26534";
        HttpClient httpClient = HttpClients.custom().setHttpProcessor(httpProcessor).build();
        HttpGet   httpGet   = new HttpGet(url);

        httpGet.addHeader("Accept" , "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3");
        httpGet.addHeader("Accept-Encoding" , "gzip, deflate, br");
        httpGet.addHeader("Accept-Language" , "zh-CN,zh;q=0.9");
        httpGet.addHeader("Connection" , "keep-alive");
        httpGet.addHeader("Host" , "ouma-zjgwy2019.oss-cn-haidian-a.aliyuncs.com");
        httpGet.addHeader("If-None-Match" , "D5829EDD0C35658C05E55315B37D3858");
        httpGet.addHeader("Sec-Fetch-Mode" , "navigate");
        httpGet.addHeader("Sec-Fetch-Site" , "none");
        httpGet.addHeader("Sec-Fetch-User" , "?1");
        httpGet.addHeader("Upgrade-Insecure-Requests" , "1");
        httpGet.addHeader("User-Agent" , "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/76.0.3809.132 Safari/537.36");
        httpGet.addHeader("If-Modified-Since" , "Tue, 24 Dec 2019 13:19:20 GMT");


        try {
            HttpResponse execute = httpClient.execute(httpGet, new ResponseHandler<HttpResponse>() {
                @Override
                public HttpResponse handleResponse(HttpResponse httpResponse)
                        throws ClientProtocolException, IOException
                {
                    HttpEntity entity = httpResponse.getEntity();
                    Header[]   allHeaders = httpResponse.getAllHeaders();
                    String fileName = System.currentTimeMillis() + "_.xls";
                    for (Header tmp : allHeaders) {
                        if (tmp.getName().equals("Content-Disposition")){
                            String value = tmp.getValue();
                            String str  ;
                            byte[] bytes = value.substring(value.lastIndexOf("=") + 1).getBytes("ISO-8859-1");

                            str = new String(bytes , "UTF-8").trim();
                            if (str != null && str.trim() != ""){
                                //fileName = str;
                                if (entity != null){
                                    InputStream inputStream = entity.getContent();
                                    FileOutputStream    outputStream = null;
                                    try {
                                        outputStream = new FileOutputStream(new File(dirName , fileName));
                                        byte data[] = new byte[1024];
                                        int count;
                                        while ((count = inputStream.read(data, 0, 1024)) != -1) {
                                            outputStream.write(data, 0, count);
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

/**
        // Using java IO
        downloadFileFromUrlWithJavaIO(dirName + "/sampleFile1.zip",
                                      "https://github.com/arpitmandliya/SpringRestfulWebServicesWithJSONExample/archive/master.zip");

        System.out.println("Downloaded file from github using java file IO");
        System.out.println("---------------------------");

        System.out.println("Downloading file from github using apache common IO");
        // Using Apache common IO
        downloadFileFromUrlWithCommonsIO(dirName + "/sampleFile2.zip",
                                         "https://github.com/arpitmandliya/SpringRestfulWebServicesWithJSONExample/archive/master.zip");
        System.out.println("Downloaded file from github using apache common IO");
        System.out.println("---------------------------");

        System.out.println("Downloading file from github using NIO");
        // Using NIO
        downloadFileFromURLUsingNIO(
                dirName + "/sampleFile3.zip",
                "https://github.com/arpitmandliya/SpringRestfulWebServicesWithJSONExample/archive/master.zip");
        System.out.println("Downloaded file from github using NIO");
        System.out.println("---------------------------");

 **/

    }

    // Using Java IO
    private static void downloadFileFromUrlWithJavaIO(String fileName, String fileUrl) {
        BufferedInputStream inputStream  = null;
        FileOutputStream    outputStream = null;
        try {
            URL url = new URL(fileUrl);
            inputStream = new BufferedInputStream(url.openStream());
            outputStream = new FileOutputStream(fileName);

            byte data[] = new byte[1024];
            int count;
            while ((count = inputStream.read(data, 0, 1024)) != -1) {
                outputStream.write(data, 0, count);
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
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    // Using Apache common IO
    private static void downloadFileFromUrlWithCommonsIO(String fileName, String fileUrl) {
        try {
            FileUtils.copyURLToFile(new URL(fileUrl), new File(fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Using NIO
    private static void downloadFileFromURLUsingNIO(String fileName, String fileUrl) {
        try {
            URL                 url                 = new URL(fileUrl);
            ReadableByteChannel readableByteChannel = Channels.newChannel(url.openStream());
            FileOutputStream    fileOutputStream    = new FileOutputStream(fileName);
            fileOutputStream.getChannel().transferFrom(readableByteChannel, 0, Long.MAX_VALUE);
            fileOutputStream.close();
            readableByteChannel.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
