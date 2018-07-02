package com.crd.business;

import com.crd.data.Holding;
import com.crd.data.Model;

/**
 * 
 * @author Monas
 * 
 * This is the Driver class where the main method is. The execution of the application starts from this class.
 * The application has been initialized with the given values for testing purpose.
 *
 */
public class Driver {
	
	private static void initialize(Business instance) {
		instance.stock.addHolding(new Holding("IBM", (double) 200));
		instance.stock.addHolding(new Holding("AAPL", (double) 400));
		instance.stock.addHolding(new Holding("X", (double) 50));
		instance.stock.addHolding(new Holding("CCC", (double) 1000));
		instance.stock.addHolding(new Holding("GM", (double) 500));
		
		instance.stock.addModel(new Model("GM", (double) 20));
		instance.stock.addModel(new Model("F", (double) 20));
		instance.stock.addModel(new Model("X", (double) 10));
		instance.stock.addModel(new Model("Y", (double) 50));
	}

	public static void main(String[] args) {
		Business instance = new Business();
		initialize(instance);
		instance.findOrder();
		instance.printOrders();
	}

}
