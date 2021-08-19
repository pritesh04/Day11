package com.Bridgelabs.Stocks;

public class StockAccount {
	String name;
	int price;
	int noShares;
	int valueOfShare;

	public StockAccount(String name, int price, int noShares) {
		super();
		this.name = name;
		this.price = price;
		this.noShares = noShares;
	}

	public void setValueOfShare(int valueOfShare) {
		this.valueOfShare = valueOfShare;
	}

	@Override
	public String toString() {
		return "StockAccount [name=" + name + ", valueOfShare=" + valueOfShare + "]";
	}

}
