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
        System.out.println("�޸�֮ǰa��ֵ�� "+ a); 
        changeMe(a);  
        System.out.println("�޸�֮��a��ֵ�� "+ a);  

	}  
	public static void changeMe(int b){
        b = (100 + b);  
        System.out.println("�޸�֮��b��ֵ�� "+ b); 
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
		 //����ʾ��������name����  
        System.out.println(c.name);  
        //����changeCar(Car c)����  
        changeCar(c);  
        //����ʾ��������name���ԣ����Ƿ����˱仯  
        System.out.println(c.name);  
    }  
  
    public static void changeCar (Car d){  
       System.out.println("��ʼdΪ��"+d.name); 
       d.name = "toyota";  
       System.out.println("��ʱdΪ��"+d.name); 
    }  
}

class Car {  	  
    public String name = "lamborghini";   
}  
