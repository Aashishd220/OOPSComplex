//class taking input as two complex numbers and add them and store in third complex number

package com.cg.complex;

//constructor initializing values
public class Complex {
	private float real;
	private float imag;
	private float sum_real = 0.0f;
	private float sum_imag = 0.0f;

//getters and setters
	public void set(float real, float imag) {
		this.real = real;
		this.imag = imag;
	}

	public float getReal() {
		return real;
	}

	public float getImag() {
		return imag;
	}

	public String toString() {
		return sum_real + " " + sum_imag + "i";
	}

	public String disp() {
		return getReal() + "+" + getImag() + "i";
	}

//function taking two complex numbers and store it in third complex number
	public Complex sum(Complex comp_obj1, Complex comp_obj2) {
		Complex new_obj = new Complex();

		float real1 = comp_obj1.real, real2 = comp_obj2.real;
		float img1 = comp_obj1.imag, img2 = comp_obj2.imag;

		float sum_real = 0, sum_img = 0;

		new_obj.sum_real = real1 + real2;// adding real part
		new_obj.sum_imag = img1 + img2;// adding imaginary part
		return new_obj;

	}
}
