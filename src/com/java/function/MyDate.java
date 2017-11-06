package com.java.function;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyDate {

	public static void main(String[] args){  
         
	        Date date = new Date();  
	        // 把时间安装字符串格式输出，可读性更强  
	        System.out.println(date.toString());  
	          
	        // 打印出1970年1月1日到现在的秒数  
	        System.out.println(date.getTime());  
	          
	        // 打印月份，记得月份在结果上要加1，因为程序里1月用0表示，直到12月份用11这个索引表示  
	        System.out.println(date.getMonth()+1+"月");
	        
	        System.out.println("星期"+date.getDay()); 
	        
	        //注意看年份是117，今年是2017年，所以应该是17+2000=2017这样去理解。 
	        System.out.println("年份:"+date.getYear());  
	          
	        System.out.println("时间:"+date.getHours());  
	        
	        SimpleDateFormat sdf = new SimpleDateFormat("E yyyy-MM-dd HH-mm-ss");  
	        System.out.println(sdf.format(date));  
	          
	        sdf = new SimpleDateFormat(" yyyy-MM-dd HH:mm:ss");  
	        System.out.println(sdf.format(date));  
	          
	        sdf = new SimpleDateFormat(" yyyyMMdd-HHmmss");  
	        System.out.println(sdf.format(date));  
	          
	        sdf = new SimpleDateFormat(" yyyyMMdd-HHmmss.S");  
	        System.out.println(sdf.format(date));  
	    }  
}
