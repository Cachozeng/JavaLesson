package com.java.json;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;

public class JsonDemoHashMap {
	public static void main(String[] args){  
        createJsonByMap();           
    }       
    public static void createJsonByMap(){            
        Map<String, Object> zhangsan = new HashMap<String, Object>();  
        		zhangsan.put("name", "����");    
                zhangsan.put("age", 25.2);    
                zhangsan.put("birthday", "1991-06-08");    
                zhangsan.put("school", "���輼У");    
                zhangsan.put("major", new String []{"��ʦ", "�ھ��"});    
                zhangsan.put("car", false);    
                zhangsan.put("has_girlfriend", false);    
                zhangsan.put("hourse", false);             
                System.out.println(new JSONObject(zhangsan).toString());            
    }  
}
