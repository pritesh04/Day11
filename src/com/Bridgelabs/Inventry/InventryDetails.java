package com.Bridgelabs.Inventry;

public class InventryDetails {
	private Inventry[] inventryarr;
	int items = 0;

	InventryDetails() {
		inventryarr = new Inventry[10];
	}

	private void addDetails(String name, int weight, int price) {
		inventryarr[items] = new Inventry(name, weight, price);
		items++;
	}

	private void calculate() {
		for (int i = 0; i < items; i++) {
			inventryarr[i].setValue(this.calculate(inventryarr[i]));
			System.out.println(inventryarr[i]);
		}
	}

	private int calculate(Inventry inventry) {

		inventry.value = inventry.price * inventry.weight;
		System.out.println(inventry.value);
		return inventry.value;

	}

	public static void main(String[] args) {
		InventryDetails iv = new InventryDetails();
		iv.addDetails("Rice", 32, 12);
		iv.addDetails("pulses", 23, 12);
		iv.addDetails("pen", 32, 12);
		iv.addDetails("sch", 23, 12);
		iv.addDetails("ool", 32, 12);
		iv.addDetails("aaa", 23, 12);
		iv.addDetails("bb", 32, 12);
		iv.addDetails("ee", 23, 12);
		iv.addDetails("vv", 32, 12);

		iv.calculate();
	}
}
