package com.example.domain;

public class Exam2 {
	private Integer sum1;
	private Integer sum2;
	private Integer sumResult;

	public Integer getSumResult() {
		return sumResult;
	}

	public void setSumResult(Integer sumResult) {
		this.sumResult = sumResult;
	}

	public Integer getSum1() {
		return sum1;
	}

	public void setSum1(Integer sum1) {
		this.sum1 = sum1;
	}

	public Integer getSum2() {
		return sum2;
	}

	public void setSum2(Integer sum2) {
		this.sum2 = sum2;
	}

	@Override
	public String toString() {
		return "Exam2 [sum1=" + sum1 + ", sum2=" + sum2 + ", sumResult=" + sumResult + "]";
	}

}
