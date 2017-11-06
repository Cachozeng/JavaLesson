package com.java.base;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysType {
	
	public static void main(String args[]){  
		getArrays(); 
		 System.out.println();
		int[] a = {40, 20, 50, 10, 60, 30};  
        //利用Array类的静态方法  
        //根据索引得到元素  
        int b = Array.getInt(a, 2);  
        System.out.println("数组中第3个值为："+b);  
  
        //修改某一个元素额值  
        Array.set(a,2,80);  
        System.out.println("将数组中第3个值改为80后的数组为："+Arrays.toString(a));  
  
        //排序(从小到大)  
        Arrays.sort(a);  
        System.out.println("对数组从小到大排序："+Arrays.toString(a));  
  
        //排序(从大到小),前提是利用前面已经排好的数组  
        int len = a.length;  
        for(int i=0; i<len/2; i++){  
            int temp = a[i];  
            a[i] = a[len-1-i];  
            a[len-1-i] = temp;  
        }  
        System.out.println("逆序后："+Arrays.toString(a));  
  
        //比较两个数组是否相等  
        int[] c = {10, 20 , 30 , 50 , 70};  
        System.out.println("两个数组是否相等："+Arrays.equals(a, c));  
    }  
	
	public static void getArrays() {
		  //数组创建1，基础数据类型数组  
        int[] numbers = new int[12];  
  
        //引用数据类型数据创建,100是数组长度  
        String[] st = new String[100]; 
        
        // 先声明  
        int[] myArray ;  
        myArray = new int[10];  
  
        //声明后直接赋值  
        int[] a = {40, 20, 50, 10, 60, 30};  
  
        //需求：输出数组每个元素的位置和值  
        System.out.println("第1种遍历数组元素方式");  
        for(int i=0; i<a.length; i++){  
            System.out.println(i+ "\t"+a[i]);   
        }  
  
        //第二种for循环比遍历数组元素  
        System.out.println("第2种遍历数组元素方式");  
        for(int x : a){  
            //System.out.println("\t"+x);  
            System.out.print(x+"\t");  
        }  
	}
}
