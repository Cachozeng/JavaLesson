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
	            //PrintWrite()�Ḳ��ԭ��������
	            PrintWriter pw = new PrintWriter(file);  
	            pw.println("����һ�������ļ�");  
	            pw.println(12345676); 
	            //�ļ������������ǵ�Ҫ�ر��ļ�,�����һֱ���ڴ��м��أ��˷��ڴ���Դ��
	            pw.close();  
	            System.out.println("���"); 
	            
	        } catch (IOException e){  	              
	            e.printStackTrace();  
	        }  
	}  
}
