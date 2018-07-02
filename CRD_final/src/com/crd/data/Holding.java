package com.crd.data;

/**
 * 
 * @author Monas
 *
 *This is the pojo class for storing the investment holdings for Fred.   
 */

public class Holding {

	private String sec;
	private double amt;

	public Holding(String sec, double amt) {
		super();
		this.sec = sec;
		this.amt = amt;
	}

	public String getSec() {
		return sec;
	}

	public void setSec(String sec) {
		this.sec = sec;
	}

	public double getAmt() {
		return amt;
	}

	public void setAmt(double amt) {
		this.amt = amt;
	}
}
