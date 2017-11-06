package com.java.base;

public class StringType {
	
	private static final int ITERATIONS = 100000;  
	   // �ο�StringBuffer.java�е� initial capacity of 16 characters
	
	    private static final int BufferSize = 16;  
	  
	    private void concatString(){  
	        System.out.print("comcatString -> ");  
	        long startTime = System.currentTimeMillis();  
	        String concat = "";  
	  
	        for(int i = 0; i< ITERATIONS; i++){  
	            concat += i % 10;  
	        }  
	  
	        long endTime = System.currentTimeMillis();  
	        System.out.print("length: "+ concat.length());  
	        // ͳ��ѭ����������ʱ��  
	       System.out.println(" ����ʱ��: "+ (endTime - startTime));  
	    }  
	  
	    //StringBuffer  
	    private void concatStringBuffer(){  
	        System.out.print("concatStringBuffer -> ");  
	        long startTime = System.currentTimeMillis();  
	        StringBuffer concat = new StringBuffer();  
	  
	        for(int i=0; i< ITERATIONS; i++){  
	            concat.append(i % 10);  
	        }  
	  
	        long endTime = System.currentTimeMillis();  
	        System.out.print("length: "+ concat.length());  
	        System.out.println(" ����ʱ��: "+ (endTime - startTime));  
	    }  
	  
	    //StringBuilder  
	    private void concatStringBuilder(){  
	        System.out.print("concatStringBuilder -> ");  
	        long startTime = System.currentTimeMillis();  
	        StringBuilder concat = new StringBuilder();  
	  
	        for(int i=0; i< ITERATIONS; i++){  
	            concat.append(i % 10);  
	        }  
	  
	        long endTime = System.currentTimeMillis();  
	        System.out.print("length: "+ concat.length());  
	        System.out.println(" ����ʱ��: "+ (endTime - startTime));  
	    }  
	  
	    public static void main(String args[]){  
	        //String str = new String("Hello ");  
	        //str += "BeiJing";  
	  
	        StringBuffer strb = new StringBuffer("Hello ");  
	        strb.append("BeiJing");  
	  
	        StringBuilder strd = new StringBuilder("Hello ");  
	        strd.append("BeiJing");  
	  
	        StringType st = new StringType();  
	        System.out.println("Iterations:" + ITERATIONS);  
	        System.out.println("Buffer:" + BufferSize);  
	        
	        st.concatStringBuilder();  
	        st.concatStringBuffer();  
	        st.concatString();  	  
	    }  
}
