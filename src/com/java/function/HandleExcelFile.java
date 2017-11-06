package com.java.function;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class HandleExcelFile {
	
	/** 
	 * 获取指定路径的excel文件指定空格的内容
	 * @throws IOException 
	 */  
	
	public String readExcel(String fileUrl,int row,int cell) { 
		
		String exceldata=null;
		
		try{                
            // 指定excel的路径  
            File src = new File(fileUrl);                
            // 加载文件  
            FileInputStream fis = new FileInputStream(src);                
            // 加载workbook  
            @SuppressWarnings("resource")  
            XSSFWorkbook wb=new XSSFWorkbook(fis);                
            //加载sheet，这里我们只有一个sheet,默认是sheet1  
            XSSFSheet sh1= wb.getSheetAt(0);  
            //读取excel数据  
            exceldata=sh1.getRow(row).getCell(cell).getStringCellValue(); 

         }catch (Exception e){               
            System.out.println(e.getMessage());               
         }
		
		return exceldata;
    } 
	
	/** 
	 * 将内容读入指定路径的excel文件
	 * @throws IOException 
	 */  
	public void writeExcel(int row,int cell,String fileUrl,String value) { 

		try{                
            // 指定excel的路径  
            File src = new File(fileUrl);                
            // 加载文件  
            FileInputStream fis = new FileInputStream(src);                
            // 加载workbook  
            @SuppressWarnings("resource")  
            XSSFWorkbook wb=new XSSFWorkbook(fis);                
            //加载sheet，这里我们只有一个sheet,默认是sheet1  
            XSSFSheet sh1= wb.getSheetAt(0);  
            //写入excel数据  
            sh1.getRow(row).createCell(cell).setCellValue(value); 
            // 保存文件  
            FileOutputStream fout=new FileOutputStream(new File(fileUrl)); 
            //覆盖写入内容   
            wb.write(fout);                
            // 关闭文件  
            fout.close();  
            
         }catch (Exception e){               
            System.out.println(e.getMessage());               
         }		
    } 
}

