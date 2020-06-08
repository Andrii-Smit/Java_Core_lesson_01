package Homework;

public class Homework {
	
 public static void main(String[] args) {
	 
	    byte a1;
		short a2;
		int a3;
		long a4;
		float a5;
		double a6;
		char a7;
		boolean a8;
		
		System.out.println(Byte.TYPE);
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		
		System.out.println(Short.TYPE);
		System.out.println(Short.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);
		
		System.out.println(Integer.TYPE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		
		System.out.println(Long.TYPE);
		System.out.println(Long.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		
		System.out.println(Float.TYPE);
		System.out.println(Float.MIN_VALUE);
		System.out.println(Float.MAX_VALUE);
		
		System.out.println(Double.TYPE);
		System.out.println(Double.MIN_VALUE);
		System.out.println(Double.MAX_VALUE);
		
		System.out.println(Character.TYPE);
		System.out.println((int) Character.MIN_VALUE);
        System.out.println((int) Character.MAX_VALUE);
     
        int[] array = {0,1,2,3,4,5,6,7,8,9};
		
		int max = array[array.length - 1];
		int min = array[array.length - 1];
		
		for (int j=0; j < array.length; j++) {
		    if (array[j] > max) {
		        max = array[j]; 
		    } else if (array[j] < min) {
		        min = array[j];
		    }
		}
		System.out.println("Min: " + min);
		System.out.println("Max: " + max);
   }
}
