package com.crd.business;

import com.crd.data.Holding;
import com.crd.data.Model;
import com.crd.data.Order;
import com.crd.data.StockModel;


/**
 * 
 * @author Monas
 * 
 * This is the business logic where we actually find the orders we create to Buy or sell stocks.
 * This contains a print method for printing all the orders needed to match Fred's investment portfolio with 
 * Mary's model.
 *
 */
public class Business {
	
	StockModel stock = null;

	public Business() {
		stock = new StockModel();
	}

	public void findOrder(){
		 double sum = 0;
		 for(Holding holding: stock.getHoldingList())
			 sum+=holding.getAmt();
		 
		 //Code for buying or selling the holdings based on the percentage value in Model table
		 for(Holding holding: stock.getHoldingList()){
			 String sec = holding.getSec();
			 boolean exists = false;
			 double percent = 0;
			 for(Model model : stock.getModelList()){
				 if(sec.equalsIgnoreCase(model.getSec())){
					 exists= true;
					 percent = model.getPercent();
					 break;
				 }
			 }
			 if(exists){
				 double total = (percent*sum)/100;
				 if(holding.getAmt() > total){
					 stock.addOrder(new Order(sec, Order.Transaction.SELL, holding.getAmt()-total));
				 } else {
					 stock.addOrder(new Order(sec, Order.Transaction.BUY, total-holding.getAmt()));
				 }
			 } else{
				 stock.addOrder(new Order(sec, Order.Transaction.SELL, holding.getAmt()));
			 }			  
		 }
		 
		 //Code for selling all the holdings which are not listed in model table
		 for(Model model: stock.getModelList()){
			 String sec = model.getSec();
			 boolean exists = false;
			 double percent = model.getPercent();
			 for(Holding holding: stock.getHoldingList()){
				 if(sec.equalsIgnoreCase(holding.getSec())){
					 exists = true;
					 break;
				 }
			 }
			 
			 if(!exists){
				 double total = (percent*sum)/100;
				 stock.addOrder(new Order(model.getSec(), Order.Transaction.BUY, total));
			 }
		 }
	}
	
	//printing orders
	public void printOrders(){
		for(Order order: stock.getOrderList())
			System.out.println(order);
	}
}
