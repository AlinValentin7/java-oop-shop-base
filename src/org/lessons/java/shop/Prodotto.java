package org.lessons.java.shop;
import java.util.Random;
public class Prodotto {
	
	private int code;
	private String name;
	private String description;
	private double price;
	private double iva ;
	 /*Prodotto (String name, String description){
		name = this.name;
		description = this.description;
		
	}*/
	Prodotto (){
		
	}
	
	protected double getPrezzoConIva () {
		double prezzoIntero = Math.round(((price * iva) / 100) + price);
		//System.out.println(prezzoIntero + "$");
		return prezzoIntero;
	}
	protected int getCode() {
		Random randomCode = new Random(10000000);
		 code = randomCode.nextInt();
		 return code;
		// System.out.println("il codice generato è " + code);
	}
	protected void codiceEstesto() {
		/*Random randomCode = new Random();
		 code = randomCode.nextInt();*/
		String nome = name + code;
		//return nome;
		System.out.println(nome);
	}
	protected double getPrezzoBase() {
		return this.price;
	}
	protected String getInfoProdotto() {
		String Info = "nome del prodtto "+ name + " descrizione del prodotto "
				+ description + " prezzo del prodotto " + price
				+ " Iva del prodotto " + iva;
		return Info;
	}
	
}

