package com.java.json;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.json.JSONArray;  
import org.json.JSONObject;

public class ReadJson {
	public static void main(String[] args) throws IOException {           
        //获取文件路径并加载  
        File file = new File(".//Files//test.json");  
          
        //通过 commons-io 里方法读取文件内容  
        String content = FileUtils.readFileToString(file, "GBK");  
        //转换JSON对象进行处理  
        JSONObject jsonObject = new JSONObject(content);
        //
        if(jsonObject.isNull("address")){              
            System.out.println("该JSON文件不存在address这个key字段");  
        }  
        if(!jsonObject.isNull("name")){  
            //根据getString()获取姓名  
            System.out.println("姓名是："+jsonObject.getString("name"));               
        }  
        //根据getDouble()获取年龄  
        System.out.println("年龄："+jsonObject.getDouble("age"));  
        //获取是否有女朋友  
        System.out.println("是否有女朋友："+jsonObject.getBoolean("has_girlfriend"));            
        //把json数组对象转换成Java的数组对象  
        JSONArray jsonarray = jsonObject.getJSONArray("major");  
        //变量专业  
        for(int i=0; i<jsonarray.length(); i++){                
            System.out.println("专业-"+(i+1)+":"+ jsonarray.get(i));  
        }            
    }  
}
