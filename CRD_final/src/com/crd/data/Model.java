package com.crd.data;

/**
 * 
 * @author Monas
 *
 *This is the model portfolio recommended by Fred's sister Mary.
 *This has attributes like Sec and Percentage.  
 */

public class Model {

	private String sec;
	private double percent;

	public Model(String sec, double percent) {
		super();
		this.sec = sec;
		this.percent = percent;
	}

	public String getSec() {
		return sec;
	}

	public void setSec(String sec) {
		this.sec = sec;
	}

	public double getPercent() {
		return percent;
	}

	public void setPercent(double percent) {
		this.percent = percent;
	}	
}
