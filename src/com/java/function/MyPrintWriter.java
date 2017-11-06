package com.java.function;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class MyPrintWriter {
	
	public static void main(String[] args){          
	        try{  	              
	            File file = new File(".//Files//filename.txt");  	              
	            if(!file.exists()){  
	                file.createNewFile();  
	            }  	
	            //PrintWrite()会覆盖原来的内容
	            PrintWriter pw = new PrintWriter(file);  
	            pw.println("这是一个测试文件");  
	            pw.println(12345676); 
	            //文件操作结束，记得要关闭文件,否则会一直在内存中加载，浪费内存资源。
	            pw.close();  
	            System.out.println("完成"); 
	            
	        } catch (IOException e){  	              
	            e.printStackTrace();  
	        }  
	}  
}
