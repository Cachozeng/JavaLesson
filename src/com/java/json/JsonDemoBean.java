package com.java.json;

import org.json.JSONObject;

import com.java.bean.CreateJson;

public class JsonDemoBean {
	public static void main(String[] args){  
        createJsonByJavaBean();            
    }        
    public static void createJsonByJavaBean(){            
    	CreateJson zhangsan = new CreateJson();  
        zhangsan.setAge(25.2);  
        zhangsan.setBirthday("1991-08-23");  
        zhangsan.setCar(null);  
        zhangsan.setHas_girlfriend(false);  
        zhangsan.setHourse(null);  
        zhangsan.setMajor(new String[]{"理发师", "挖掘机"});  
        zhangsan.setName("张三");  
        zhangsan.setSchool("蓝翔技校");           
        System.out.println(new JSONObject(zhangsan).toString());            
    }    
}
