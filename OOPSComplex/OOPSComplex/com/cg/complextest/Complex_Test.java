package com.cg.complextest;

import com.cg.complex.Complex;

//class with main function passing two complex numbers


public class Complex_Test {

	public static void main(String args[]) {
		Complex complex_obj1 = new Complex();// object creation
		Complex complex_obj2 = new Complex();

		complex_obj1.set(12.3f, 2.5f);// passing the values
		complex_obj2.set(12.5f, 12.5f);

		System.out.println(complex_obj1.disp()); // displaying complex number
		System.out.println(complex_obj2.disp());

		Complex complex_obj3 = new Complex();
		System.out.println((complex_obj3.sum(complex_obj1, complex_obj2)).toString());

	}
}
