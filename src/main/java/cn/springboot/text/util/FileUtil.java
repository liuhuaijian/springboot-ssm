package cn.springboot.text.util;

import sun.misc.BASE64Encoder;

import java.net.URLEncoder;

import javax.servlet.http.HttpServletRequest;


public class FileUtil {
    public static String fileNameEncoding(String fileName, HttpServletRequest request) throws Exception {
        String agent = request.getHeader("User-Agent");//获取浏览器
        if (agent.contains("Firefox")) {
            BASE64Encoder base64Encoder = new BASE64Encoder();
            fileName = "=?utf-8?B?"
                    + base64Encoder.encode(fileName.getBytes("utf-8"))
                    + "?=";
        } else if (agent.contains("MSIE")) {
            fileName = URLEncoder.encode(fileName, "utf-8");
        } else if (agent.contains("Safari")) {
            fileName = new String(fileName.getBytes("utf-8"), "ISO8859-1");
        } else {
            fileName = URLEncoder.encode(fileName, "utf-8");
        }
        return fileName;
    }
}
