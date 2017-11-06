package com.java.base;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CopyObjects {

	public static void main(String args[]){ 
		directAssignment();
		cloneObjectInt();
		cloneObjectString();
		arrayCopyObject();
		arrayCopyOfObject();
		
	}
	
	public static void directAssignment() {
		
		 int[] a = {40, 20, 50, 10, 60, 30};  
	     int[] b = a;  
	          
	     System.out.println(a == b);  
	     System.out.println("a与b的值相等，内存地址也相等");
	     //"证明a发生变化，b会不会也变化:"
	     Array.set(a,2,100);  
	     System.out.println("a "+Arrays.toString(a));  
	     System.out.println("b "+Arrays.toString(b));  		
	}
	
	public static void cloneObjectInt() {
		
		int[] a = {40, 20, 50, 10, 60, 30};  
        int[] b = a.clone();  
  
        System.out.println(a == b); 
	    System.out.println("a与b的值相等，内存地址不相等");
        //证明a发生变化，b会不会也变化  
        Array.set(a,2,100);  
        System.out.println("a "+Arrays.toString(a));  
        System.out.println("b "+Arrays.toString(b));  
	}
	
	public static void cloneObjectString() {
		
		String[] a = {"Beijing", "ShangHai", "HeBei", "GuangZhou", "XiAn"};  
	    String[] b = a.clone();   
  
        System.out.println(a == b); 
	    System.out.println("a与b的值相等，内存地址不相等");
        //证明a发生变化，b会不会也变化  
	    Array.set(a,2,"WuHan");   
        System.out.println("a "+Arrays.toString(a));  
        System.out.println("b "+Arrays.toString(b));  		
	}
	
	public static void arrayCopyObject() {
		
		String[] a = {"Beijing", "ShangHai", "HeBei", "GuangZhou", "XiAn"};  
	    String[] b = a.clone();   
  
        System.out.println(a == b); 
	    System.out.println("a与b的值相等，内存地址不相等");
        //证明a发生变化，b会不会也变化  
	    Array.set(a,2,"WuHan");   
        System.out.println("a "+Arrays.toString(a));  
        System.out.println("b "+Arrays.toString(b));  
	}
	
	public static void arrayCopyOfObject() {
		
		String[] a = {"Beijing", "ShangHai", "HeBei", "GuangZhou", "XiAn"};  
	    String[] b = a.clone();   
  
        System.out.println(a == b); 
	    System.out.println("a与b的值相等，内存地址不相等");
        //证明a发生变化，b会不会也变化  
	    Array.set(a,2,"WuHan");   
        System.out.println("a "+Arrays.toString(a));  
        System.out.println("b "+Arrays.toString(b));  
	}
}
