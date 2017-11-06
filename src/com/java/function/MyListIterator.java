package com.java.function;

import java.util.ArrayList;
import java.util.ListIterator;

public class MyListIterator {
	public static void main(String[] args){  
        
		/** 
         * ��ƪ��ѧϰ�¼�������list�ı�����ListIterator 
         * public boolean hasNext(); �ж��Ƿ�����һ��Ԫ�أ�����ֵ�ǲ����� 
         * public object next();��ȡ��һ��Ԫ�ض��󣬷��ص���һ������ 
         * public boolean hasPrevious();�ж��Ƿ�����һ��Ԫ�أ�����ֵ�ǲ����� 
         * public object previous();��ȡ��һ��Ԫ�أ����ص���һ������ 
         */  
          
        ArrayList<String> name = new ArrayList<String>();  
        name.add("Anthony");  
        name.add("mark");  
        name.add("tom");  
        name.add("john");  
        name.add("jack");  
          
        // �������� ����listԪ��  
        ListIterator<String> itr = name.listIterator();  
        while(itr.hasNext()){  
            System.out.println(itr.next());  
        }  
          
        System.out.println("---------------------------");  
          
        // �������� ����listԪ��  
        while(itr.hasPrevious()){  
            System.out.println(itr.previous());  
        }  
    }  
}
