package com.java.function;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyDate {

	public static void main(String[] args){  
         
	        Date date = new Date();  
	        // ��ʱ�䰲װ�ַ�����ʽ������ɶ��Ը�ǿ  
	        System.out.println(date.toString());  
	          
	        // ��ӡ��1970��1��1�յ����ڵ�����  
	        System.out.println(date.getTime());  
	          
	        // ��ӡ�·ݣ��ǵ��·��ڽ����Ҫ��1����Ϊ������1����0��ʾ��ֱ��12�·���11���������ʾ  
	        System.out.println(date.getMonth()+1+"��");
	        
	        System.out.println("����"+date.getDay()); 
	        
	        //ע�⿴�����117��������2017�꣬����Ӧ����17+2000=2017����ȥ��⡣ 
	        System.out.println("���:"+date.getYear());  
	          
	        System.out.println("ʱ��:"+date.getHours());  
	        
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
