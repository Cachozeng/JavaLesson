package com.java.base;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysType {
	
	public static void main(String args[]){  
		getArrays(); 
		 System.out.println();
		int[] a = {40, 20, 50, 10, 60, 30};  
        //����Array��ľ�̬����  
        //���������õ�Ԫ��  
        int b = Array.getInt(a, 2);  
        System.out.println("�����е�3��ֵΪ��"+b);  
  
        //�޸�ĳһ��Ԫ�ض�ֵ  
        Array.set(a,2,80);  
        System.out.println("�������е�3��ֵ��Ϊ80�������Ϊ��"+Arrays.toString(a));  
  
        //����(��С����)  
        Arrays.sort(a);  
        System.out.println("�������С��������"+Arrays.toString(a));  
  
        //����(�Ӵ�С),ǰ��������ǰ���Ѿ��źõ�����  
        int len = a.length;  
        for(int i=0; i<len/2; i++){  
            int temp = a[i];  
            a[i] = a[len-1-i];  
            a[len-1-i] = temp;  
        }  
        System.out.println("�����"+Arrays.toString(a));  
  
        //�Ƚ����������Ƿ����  
        int[] c = {10, 20 , 30 , 50 , 70};  
        System.out.println("���������Ƿ���ȣ�"+Arrays.equals(a, c));  
    }  
	
	public static void getArrays() {
		  //���鴴��1������������������  
        int[] numbers = new int[12];  
  
        //���������������ݴ���,100�����鳤��  
        String[] st = new String[100]; 
        
        // ������  
        int[] myArray ;  
        myArray = new int[10];  
  
        //������ֱ�Ӹ�ֵ  
        int[] a = {40, 20, 50, 10, 60, 30};  
  
        //�����������ÿ��Ԫ�ص�λ�ú�ֵ  
        System.out.println("��1�ֱ�������Ԫ�ط�ʽ");  
        for(int i=0; i<a.length; i++){  
            System.out.println(i+ "\t"+a[i]);   
        }  
  
        //�ڶ���forѭ���ȱ�������Ԫ��  
        System.out.println("��2�ֱ�������Ԫ�ط�ʽ");  
        for(int x : a){  
            //System.out.println("\t"+x);  
            System.out.print(x+"\t");  
        }  
	}
}
