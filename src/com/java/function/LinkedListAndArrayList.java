package com.java.function;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListAndArrayList {
	
	 public static void main(String[] args){          
	        long n = (long)1E6; //1*10��6�η� 	          
	        ArrayList arrayList1 = new ArrayList();  
	        long milis = System.currentTimeMillis();  
	        for(int i= 0; i<n; i++){  
	            arrayList1.add(i);  
	        }  
	        System.out.println("��������arraylist ������  "+(System.currentTimeMillis()-milis) +" ����"); 

	        LinkedList linkedList = new LinkedList();  
	        milis = System.currentTimeMillis();  
	        for(int i= 0; i<n; i++){  
	            linkedList.add(i);  
	        }  
	        System.out.println("��������linkedlist ������  "+(System.currentTimeMillis()-milis) +" ����");  
	          
	        // arraylistɾ��Ԫ��  
	        milis = System.currentTimeMillis();  
	        arrayList1.remove(1E5);  
	        System.out.println("ɾ��Ԫ��arraylist ������  "+(System.currentTimeMillis()-milis) +" ����");  
	          
	        // linkedlistɾ��Ԫ��  
	        milis = System.currentTimeMillis();  
	        linkedList.remove(1E5);  
	        System.out.println("ɾ��Ԫ��linkedlist ������  "+(System.currentTimeMillis()-milis) +" ����");  
	                  
	        // arraylist get �м�Ԫ��  
	        milis = System.currentTimeMillis();  
	        arrayList1.get((int)n/2);  
	        System.out.println("�����м�Ԫ��arraylist ������  "+(System.currentTimeMillis()-milis) +" ����");  
	          
	        // linkedlist get �м�Ԫ��  
	        milis = System.currentTimeMillis();  
	        linkedList.get((int)n/2);  
	        System.out.println("�����м�Ԫ��linkedlist ������  "+(System.currentTimeMillis()-milis) +" ����");  	          	         
	    } 		
}
