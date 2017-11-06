package com.java.base;

public class JavaDataType {
	
	public static void main(String args[]){  
		
		/*
        //基础数据类型,一共8种  
        byte b = 10;  
        short s = 11;  
        int i = 16;  
        long l = 10L;  
        float f = 234.5f;  
        double d = 123.4;  
        char c = 'A';  
        boolean bool = true;  
  
        //Java 引用类型 或者叫类 对象 类型  
        Byte myByte = new Byte("10"); // 分配内存空间  
        Short myShort = new Short(s); // 编辑器提示不需要装箱  
        Integer myInteger = Integer.valueOf(i);  
        Long myLong;  
        Float myFloat;  
        Double myDouble;  
        Character myCharacter;  
        Boolean myBoolean; 
        */
		Integer i1 = 100;  
		Integer i2 = 100;  
		Integer i3 = 128;   
		Integer i4 = 128;   
        //==其实就是比较内存地址，而不是比较数值大小 
        System.out.println(i1==i2);  
        System.out.println(i3==i4);  
    }  
}
