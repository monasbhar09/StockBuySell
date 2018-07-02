package com.crd.data;

import java.util.ArrayList;
import java.util.List;


/**
 * 
 * @author Monas
 * This is the main Model of our Stock system. It contains a list of order, models and holdings.
 */
public class StockModel {

	private List<Order> orderList;
	private List<Model> modelList;
	private List<Holding> holdingList;

	public StockModel() {
		orderList = new ArrayList<>();
		modelList = new ArrayList<>();
		holdingList = new ArrayList<>();
	}

	public List<Order> getOrderList() {
		return orderList;
	}

	public void setOrderList(List<Order> orderList) {
		this.orderList = orderList;
	}

	public List<Model> getModelList() {
		return modelList;
	}

	public void setModelList(List<Model> modelList) {
		this.modelList = modelList;
	}

	public List<Holding> getHoldingList() {
		return holdingList;
	}

	public void setHoldingList(List<Holding> holdingList) {
		this.holdingList = holdingList;
	}

	public void addOrder(Order order) {
		orderList.add(order);
	}

	public void addHolding(Holding holding) {
		holdingList.add(holding);
	}

	public void addModel(Model model) {
		modelList.add(model);
	}
}
