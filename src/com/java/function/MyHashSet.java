package com.java.function;

import java.util.HashSet;
import java.util.Iterator;

public class MyHashSet {

	 public static void main(String[] args){  
		    //HashSet��Set�ӿڵ�һ��ʵ�֣�����hash table��ʵ�֣�ʵ���ϵײ�������hash map��ʵ�ֵ�
		    //��HashSet��ǰArrayListһ�������Ϳ��ԣ�HashSetҲ�����ڼ����ࡣ
	        HashSet<String> name = new HashSet<String>();  
	        name.add("Anthony");  
	        name.add("mark");  
	        name.add("tom");  
	        name.add("john");  
	        name.add("jack");  
	        
	        //Iterator�����Ľ����û��˳���,����Iteratorû��HasPrevious������
	        Iterator<String> itr = name.iterator();  
	          
	        while(itr.hasNext()){  
	            System.out.println(itr.next());  
	        }  
	}  
}
