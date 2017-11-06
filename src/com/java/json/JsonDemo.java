package com.java.json;

import org.json.JSONObject;

public class JsonDemo {
	public static void main(String[] args) {  
        // TODO Auto-generated method stub  
        example();  
    }        
    public static void example(){  
          
        JSONObject zhangsan = new JSONObject();  
          
        zhangsan.put("name", "张三");  
        zhangsan.put("age", 25.2);  
        zhangsan.put("birthday", "1991-06-08");  
        zhangsan.put("school", "蓝翔技校");  
        zhangsan.put("major", new String []{"理发师", "挖掘机"});  
        zhangsan.put("car", false);  
        zhangsan.put("has_girlfriend", false);  
        zhangsan.put("hourse", false);  
        // 利用toSting()方法，然后输出  
        System.out.println(zhangsan.toString());  
    }  
}
