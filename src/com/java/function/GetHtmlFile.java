package com.java.function;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.jsoup.Jsoup;  
import org.jsoup.nodes.Document;  
import org.jsoup.nodes.Element;  
import org.jsoup.select.Elements;


public class GetHtmlFile {
	
	static int i=1;
	static int j=2;
	static String url=null;
	static HandleExcelFile getUrl = new HandleExcelFile();
	
	    public static void main(String[] args) throws Exception { 
	    	
	    	for (int i=2;i<83;i++) {
	    		url=getUrl.readExcel(".\\Files\\NuScale-URLs.xlsx",i,2);
	    		//bodyContent();
	    		articleInfo(); 
	    	}
	        //headInfo();
    		//articleInfo(); 	        
	    	//bodyContent();
	        //bolgBody();	        
	    }  

/** 
 * 获取指定HTML 文档指定的body 
 * @throws IOException 
 */  
	    
private static void headInfo() throws IOException { 
	  // 直接从字符串中输入 HTML 文档  
    String html = "<html><head><title> 开源中国社区 </title></head>"  
            + "<body><p> 这里是 jsoup 项目的相关文章 </p></body></html>";  
    Document doc = Jsoup.parse(html);  
    System.out.println(doc.body());  	          
    // 从 URL 直接加载 HTML 文档  
    Document doc1 = Jsoup.connect(url).get();  
    String title = doc1.head().toString();  
    System.out.println(title);  
}  
/** 
 * 获取指定HTML 文档指定的body 
 * @throws IOException 
 */  
private static void bolgBody() throws IOException {  
    // 从 URL 直接加载 HTML 文档  
    Document doc2 = Jsoup.connect(url).get();  
    String title = doc2.body().toString();  
    System.out.println(title);  
}  

/** 
 * 获取网页中超链接的标题和链接 
 * @return 
 */  
public static void articleInfo() {  
    Document doc; 
    i=2;
    try {  
        doc = Jsoup.connect(url).get();  
        Elements ListDiv = doc.getElementsByAttributeValue("class","mnc-first-list");  
        for (Element element : ListDiv) {  
            Elements links = element.getElementsByTag("a");  
            for (Element link : links) {  
                String linkHref = link.attr("href");  
                String linkText = link.text().trim(); 
                getUrl.writeExcel(i,2,".\\Files\\NuScale-URL.xlsx","http://www.nuscalepower.com/"+linkHref);
                getUrl.writeExcel(i,3,".\\Files\\NuScale-URL.xlsx",linkText);
                i++;
            }  
        }  
    } catch (IOException e) {  
        // TODO Auto-generated catch block  
        e.printStackTrace();  
    }  

}  
/** 
 * 获取指定body的内容 
 */  
public static void bodyContent() {  
    Document doc;  
    try {  
        doc = Jsoup.connect(url).get();  
        Elements ListDiv = doc.getElementsByAttributeValue("class","clickcaptionVideo");  
        for (Element element :ListDiv) { 
        	if (ListDiv != null) {
        		System.out.println(url);
        		System.out.println(element.html()); 
        	}else {
        	}
        }  
    } catch (IOException e) {  
        // TODO Auto-generated catch block  
        e.printStackTrace();  
    }  
}  

}