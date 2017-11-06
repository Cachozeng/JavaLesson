package com.java.function;

import java.util.HashSet;
import java.util.Iterator;

public class MyHashSet {

	 public static void main(String[] args){  
		    //HashSet是Set接口的一种实现，依靠hash table来实现，实际上底层是依靠hash map来实现的
		    //把HashSet当前ArrayList一样看待就可以，HashSet也是属于集合类。
	        HashSet<String> name = new HashSet<String>();  
	        name.add("Anthony");  
	        name.add("mark");  
	        name.add("tom");  
	        name.add("john");  
	        name.add("jack");  
	        
	        //Iterator遍历的结果是没有顺序的,而且Iterator没有HasPrevious方法。
	        Iterator<String> itr = name.iterator();  
	          
	        while(itr.hasNext()){  
	            System.out.println(itr.next());  
	        }  
	}  
}
