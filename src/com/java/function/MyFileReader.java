package com.java.function;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MyFileReader {
	
	public static void main(String[] args){  
		//BuffreredRead()是从字符输入流中读取文本，缓冲各个字符，从而实现字符、数组和行的高效读取
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
