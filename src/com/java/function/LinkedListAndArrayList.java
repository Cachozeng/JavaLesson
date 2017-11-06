package com.java.function;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListAndArrayList {
	
	 public static void main(String[] args){          
	        long n = (long)1E6; //1*10的6次方 	          
	        ArrayList arrayList1 = new ArrayList();  
	        long milis = System.currentTimeMillis();  
	        for(int i= 0; i<n; i++){  
	            arrayList1.add(i);  
	        }  
	        System.out.println("新增操作arraylist 花费了  "+(System.currentTimeMillis()-milis) +" 毫秒"); 

	        LinkedList linkedList = new LinkedList();  
	        milis = System.currentTimeMillis();  
	        for(int i= 0; i<n; i++){  
	            linkedList.add(i);  
	        }  
	        System.out.println("新增操作linkedlist 花费了  "+(System.currentTimeMillis()-milis) +" 毫秒");  
	          
	        // arraylist删除元素  
	        milis = System.currentTimeMillis();  
	        arrayList1.remove(1E5);  
	        System.out.println("删除元素arraylist 花费了  "+(System.currentTimeMillis()-milis) +" 毫秒");  
	          
	        // linkedlist删除元素  
	        milis = System.currentTimeMillis();  
	        linkedList.remove(1E5);  
	        System.out.println("删除元素linkedlist 花费了  "+(System.currentTimeMillis()-milis) +" 毫秒");  
	                  
	        // arraylist get 中间元素  
	        milis = System.currentTimeMillis();  
	        arrayList1.get((int)n/2);  
	        System.out.println("访问中间元素arraylist 花费了  "+(System.currentTimeMillis()-milis) +" 毫秒");  
	          
	        // linkedlist get 中间元素  
	        milis = System.currentTimeMillis();  
	        linkedList.get((int)n/2);  
	        System.out.println("访问中间元素linkedlist 花费了  "+(System.currentTimeMillis()-milis) +" 毫秒");  	          	         
	    } 		
}
