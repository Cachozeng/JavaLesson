package com.java.base;

import java.util.List;
import java.util.ArrayList;

public class PassToMethod {

	public static void main(String args[]){  
		PassData.passData();  
		PassQuoteData.passQuoteData();
		PassClassData.passClassData();
    }  	
}


class PassData {
	public static void passData() {
		
		int a = 10;  		  
        System.out.println("修改之前a的值是 "+ a); 
        changeMe(a);  
        System.out.println("修改之后a的值是 "+ a);  

	}  
	public static void changeMe(int b){
        b = (100 + b);  
        System.out.println("修改之后b的值是 "+ b); 
    }  	
}

class PassQuoteData {
	public static void passQuoteData() {
		
	List<String> list = new ArrayList<String>();  
     list.add("aaa");  

     changeList(list);  
     System.out.println(list.toString());  
	} 
	
	public static void changeList(List<String> list){  
     list.add("bbb");  
	}  	
}

class PassClassData{
	
	public static void passClassData() {
		Car c = new Car();  	
		 //先显示这个对象的name属性  
        System.out.println(c.name);  
        //调用changeCar(Car c)方法  
        changeCar(c);  
        //再显示这个对象的name属性，看是否发生了变化  
        System.out.println(c.name);  
    }  
  
    public static void changeCar (Car d){  
       System.out.println("开始d为："+d.name); 
       d.name = "toyota";  
       System.out.println("此时d为："+d.name); 
    }  
}

class Car {  	  
    public String name = "lamborghini";   
}  
