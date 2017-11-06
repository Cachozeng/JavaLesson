package com.java.function;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class HandleExcelFile {
	
	/** 
	 * ��ȡָ��·����excel�ļ�ָ���ո������
	 * @throws IOException 
	 */  
	
	public String readExcel(String fileUrl,int row,int cell) { 
		
		String exceldata=null;
		
		try{                
            // ָ��excel��·��  
            File src = new File(fileUrl);                
            // �����ļ�  
            FileInputStream fis = new FileInputStream(src);                
            // ����workbook  
            @SuppressWarnings("resource")  
            XSSFWorkbook wb=new XSSFWorkbook(fis);                
            //����sheet����������ֻ��һ��sheet,Ĭ����sheet1  
            XSSFSheet sh1= wb.getSheetAt(0);  
            //��ȡexcel����  
            exceldata=sh1.getRow(row).getCell(cell).getStringCellValue(); 

         }catch (Exception e){               
            System.out.println(e.getMessage());               
         }
		
		return exceldata;
    } 
	
	/** 
	 * �����ݶ���ָ��·����excel�ļ�
	 * @throws IOException 
	 */  
	public void writeExcel(int row,int cell,String fileUrl,String value) { 

		try{                
            // ָ��excel��·��  
            File src = new File(fileUrl);                
            // �����ļ�  
            FileInputStream fis = new FileInputStream(src);                
            // ����workbook  
            @SuppressWarnings("resource")  
            XSSFWorkbook wb=new XSSFWorkbook(fis);                
            //����sheet����������ֻ��һ��sheet,Ĭ����sheet1  
            XSSFSheet sh1= wb.getSheetAt(0);  
            //д��excel����  
            sh1.getRow(row).createCell(cell).setCellValue(value); 
            // �����ļ�  
            FileOutputStream fout=new FileOutputStream(new File(fileUrl)); 
            //����д������   
            wb.write(fout);                
            // �ر��ļ�  
            fout.close();  
            
         }catch (Exception e){               
            System.out.println(e.getMessage());               
         }		
    } 
}

