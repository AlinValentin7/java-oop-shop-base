package org.lessons.java.shop;

public class Main {
	public static void main(String[] args) {
		Prodotto oil = new Prodotto();
		oil.name = "Olio di oliva quasi vergine ";
		oil.priece= 9.99;
		oil.iva = 22;
		oil.code = 123;
		oil.getPrezzoConIva();;
		oil.codiceEstesto();
		//System.out.println(oil.codiceEstesto());
		oil.getCode();
		//System.out.println(oil.getCode());
		oil.getPrezzoBase();
	}
}
