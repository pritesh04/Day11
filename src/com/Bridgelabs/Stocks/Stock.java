package com.Bridgelabs.Stocks;

import java.util.Scanner;

public class Stock {

	StockAccount[] sc;
	public int number = 0;

	Stock() {
		sc = new StockAccount[10];
	}

	private void addStock(String name, int price, int noOfShares) {
		sc[number] = new StockAccount(name, price, noOfShares);
		number++;
	}

	private void calculateValue() {
		for (int i = 0; i < number; i++) {
			sc[i].setValueOfShare(this.calculate(sc[i]));
			// System.out.println(sc[i]);
		}
	}

	private int calculate(StockAccount stockAccount) {
		stockAccount.valueOfShare = stockAccount.price * stockAccount.noShares;
		System.out.println(stockAccount.valueOfShare);
		return stockAccount.valueOfShare;
	}

	private void sellStock() {
		for (int i = 0; i < number; i++) {
			System.out.println("value of shres is  " + sc[i].valueOfShare + " name is " + sc[i].name + "index is " + i);

		}
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		sc[a] = null;
		number--;
		System.out.println("deleted");
		this.display();

	}

	private void display() {
		for (int i = 0; i < number; i++) {
			System.out.println("value of shres is  " + sc[i].valueOfShare + " name is " + sc[i].name + "index is ");
		}
	}

	private void buyStock(String name, int price, int noOfShares) {
		sc[number] = new StockAccount(name, price, noOfShares);
		number++;
		this.calculateValue();
		System.out.println("added Succesfully");
	}

	public static void main(String[] args) {
		Stock obj = new Stock();
		obj.addStock("jio", 200, 3);
		obj.calculateValue();
		obj.buyStock("abc", 1200, 2);
		obj.display();
		obj.sellStock();

	}
}
