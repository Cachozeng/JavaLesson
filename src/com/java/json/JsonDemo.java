package com.java.json;

import org.json.JSONObject;

public class JsonDemo {
	public static void main(String[] args) {  
        // TODO Auto-generated method stub  
        example();  
    }        
    public static void example(){  
          
        JSONObject zhangsan = new JSONObject();  
          
        zhangsan.put("name", "����");  
        zhangsan.put("age", 25.2);  
        zhangsan.put("birthday", "1991-06-08");  
        zhangsan.put("school", "���輼У");  
        zhangsan.put("major", new String []{"��ʦ", "�ھ��"});  
        zhangsan.put("car", false);  
        zhangsan.put("has_girlfriend", false);  
        zhangsan.put("hourse", false);  
        // ����toSting()������Ȼ�����  
        System.out.println(zhangsan.toString());  
    }  
}
