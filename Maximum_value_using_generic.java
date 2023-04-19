package com.mypackage;

// To find maximum value using generics
public class Maximum_value_using_generic<T extends Comparable<T>> {

	T a1, a2, a3;

	public Maximum_value_using_generic(T a1, T a2, T a3) {
		this.a1 = a1;
		this.a2 = a2;
		this.a3 = a3;
	}

	// Generic method to compare any type of data and find maximum

	public static <T extends Comparable<T>> T maxOfValues(T a1, T a2, T a3, T a4, T a5) {
		T max = a1;
		if (a2.compareTo(max) > 0)
			max = a2;
		if (a3.compareTo(max) > 0)
			max = a3;
		if (a4.compareTo(max) > 0)
			max = a4;
		if (a5.compareTo(max) > 0)
			max = a5;
		return max;
	}

	public static void main(String[] args) {
		System.out.println("Welcome To Find Maximun Problem Using Generics \n");
		System.out.println("The maximum value between the three integer is : " + maxOfValues(3, 8, 5, 10, 18) + "\n");
		System.out.println("The maximum value between the three float is : " + maxOfValues(1.5f, 3.56f, 5.87f, 2.67f, 28.3f) + "\n");
		System.out.println("The maximum value between the three string is : " + maxOfValues("abc", "pqr", "xyz", "mnp", "def"));
	}
}
