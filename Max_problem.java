package com.mypackage;

public class Max_problem {

	//To find maximum integer value using generics.
	
	// compare three integer values and get the maximum value.

	public static Integer maxOfInteger(Integer a1, Integer a2, Integer a3){
		Integer max = a1;
		if (a2.compareTo(max) > 0)
			max = a2;
		if (a3.compareTo(max) > 0)
			max = a3;
		return max;
	}
	
	 // compare three float values and get the maximum value.
	
	public static Float maxOfFloat(Float f1, Float f2, Float f3) {
		Float max = f1;
		if (f2.compareTo(max) > 0)
			max = f2;
		if (f3.compareTo(max) > 0)
			max = f3;
		return max;
	}

	 //compare three strings and get the maximum value.
	 
	public static String maxOfString(String s1, String s2, String s3) {
		String max = s1;
		if (s2.compareTo(max) > 0)
			max = s2;
		if (s3.compareTo(max) > 0)
			max = s3;
		return max;
	}

	public static void main(String[] args) {
		System.out.println("Welcome To Find Maximun Problem Using Generics \n");
		System.out.println("The maximum value between the three integer is : " + maxOfInteger(3, 8, 5)+ "\n");
		System.out.println("The maximum value between the three float is : " + maxOfFloat(1.5f, 3.56f, 5.87f) + "\n");
		System.out.println("The maximum value between the three string is : " + maxOfString("abc", "pqr", "xyz"));
	}
}

