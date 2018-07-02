package com.crd.data;

/**
 * 
 * @author Monas
 * 
 * This is the data model for Order that Fred needs to tell his broker about which stock to buy or sell and with what amount.
 * This class also contains a Enum Transaction to restrict the value of Transaction to Buy and Sell only.
 *
 */
public class Order {

	private String sec;
	private Transaction trans;
	private double amt;

	public Order(String sec, Transaction trans, double amt) {
		super();
		this.sec = sec;
		this.trans = trans;
		this.amt = amt;
	}

	public String getSec() {
		return sec;
	}

	public void setSec(String sec) {
		this.sec = sec;
	}

	public Transaction getTrans() {
		return trans;
	}

	public void setTrans(Transaction trans) {
		this.trans = trans;
	}

	public double getAmt() {
		return amt;
	}

	public void setAmt(double amt) {
		this.amt = amt;
	}
	
	public enum Transaction {
		BUY, 
		SELL;
	}
	
	@Override
	public String toString(){
		return "Sec: "+this.sec+" Transanction:"+this.getTrans()+" Amount:" +this.getAmt();
	}
}
