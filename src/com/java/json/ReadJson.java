package com.java.json;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.json.JSONArray;  
import org.json.JSONObject;

public class ReadJson {
	public static void main(String[] args) throws IOException {           
        //��ȡ�ļ�·��������  
        File file = new File(".//Files//test.json");  
          
        //ͨ�� commons-io �﷽����ȡ�ļ�����  
        String content = FileUtils.readFileToString(file, "GBK");  
        //ת��JSON������д���  
        JSONObject jsonObject = new JSONObject(content);
        //
        if(jsonObject.isNull("address")){              
            System.out.println("��JSON�ļ�������address���key�ֶ�");  
        }  
        if(!jsonObject.isNull("name")){  
            //����getString()��ȡ����  
            System.out.println("�����ǣ�"+jsonObject.getString("name"));               
        }  
        //����getDouble()��ȡ����  
        System.out.println("���䣺"+jsonObject.getDouble("age"));  
        //��ȡ�Ƿ���Ů����  
        System.out.println("�Ƿ���Ů���ѣ�"+jsonObject.getBoolean("has_girlfriend"));            
        //��json�������ת����Java���������  
        JSONArray jsonarray = jsonObject.getJSONArray("major");  
        //����רҵ  
        for(int i=0; i<jsonarray.length(); i++){                
            System.out.println("רҵ-"+(i+1)+":"+ jsonarray.get(i));  
        }            
    }  
}
