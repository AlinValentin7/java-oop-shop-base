package org.lessons.java.shop;
import java.util.Random;
public class Prodotto {
	
	int code;
	String name;
	String description;
	double price;
	double iva ;
	
	double getPrezzoConIva () {
		double prezzoIntero = Math.round((((price * iva) / 100) + price)*100)/100;
		//System.out.println(prezzoIntero + "$");
		return prezzoIntero;
	}
	int getCode() {
		Random randomCode = new Random();
		 code = randomCode.nextInt();
		 return code;
		// System.out.println("il codice generato è " + code);
	}
	void codiceEstesto() {
		/*Random randomCode = new Random();
		 code = randomCode.nextInt();*/
		String nome = name + code;
		//return nome;
		System.out.println(nome);
	}
	void getPrezzoBase() {
		System.out.println(price + "$");
	}
	String getInfoProdotto() {
		String Info = "nome del prodtto "+ name + " descrizione del prodotto "
				+ description + " prezzo del prodotto " + price
				+ " Iva del prodotto " + iva;
		return Info;
	}
	
}

