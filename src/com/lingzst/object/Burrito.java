package com.lingzst.object;

public class Burrito {
	Spiciness degree;
	public Burrito(Spiciness degree) {
		this.degree = degree;
	}
	public void describe() {
		System.out.println("This burrito is ");
		switch (degree) {
		case NOT:
			System.out.println("not spicy at all!");
			break;
		case MILD:
			System.out.println("a little hot");

		default:	
			System.out.println("too hot");
			break;
		}
	}
	public static void main(String[] args) {
		Burrito
			plain = new Burrito(Spiciness.NOT),
			greenChile = new Burrito(Spiciness.MILD);
		plain.describe();
		greenChile.describe();
	}
}
