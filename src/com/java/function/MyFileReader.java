package com.java.function;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MyFileReader {
	
	public static void main(String[] args){  
		//BuffreredRead()�Ǵ��ַ��������ж�ȡ�ı�����������ַ����Ӷ�ʵ���ַ���������еĸ�Ч��ȡ
        BufferedReader br = null;            
        try{  
              
            br = new BufferedReader(new FileReader(".//Files/filename.txt"));  
            String line;              
            while((line = br.readLine())!=null){  
                System.out.println(line);  
            }  
        } catch (IOException e){                
            e.printStackTrace();  
        }  
    }  
}
