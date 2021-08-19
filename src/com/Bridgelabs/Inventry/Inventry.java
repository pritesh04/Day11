package com.Bridgelabs.Inventry;

public class Inventry {
	String name;
	int weight;
	int price;
	int value;

	public void setValue(int value) {
		this.value = value;
	}

	public Inventry(String name, int weight, int price) {

		this.name = name;
		this.weight = weight;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Inventry name=" + name + ", value=" + value;
	}

}
