package com.example.domain;

public class Exam03 {
	private int tax_free;
	private int tax_in;

	public int getTax_free() {
		return tax_free;
	}

	public void setTax_free(int tax_free) {
		this.tax_free = tax_free;
	}

	public int getTax_in() {
		return tax_in;
	}

	public void setTax_in(int tax_in) {
		this.tax_in = tax_in;
	}

	@Override
	public String toString() {
		return "Exam03Form [tax_free=" + tax_free + ", tax_in=" + tax_in + "]";
	}
}
