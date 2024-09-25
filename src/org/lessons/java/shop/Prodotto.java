package org.lessons.java.shop;
import java.util.Random;
public class Prodotto {
	
	int code;
	String name;
	String description;
	double priece;
	double iva ;
	
	void getPrezzoConIva () {
		double prezzoIntero = Math.floor(((priece * iva) / 100) + priece);
		System.out.println(prezzoIntero + "$");
		//return iva;
	}
	void getCode() {
		Random randomCode = new Random();
		 code = randomCode.nextInt();
		// return code;
		 System.out.println("il codice generato è " + code);
	}
	void codiceEstesto() {
		/*Random randomCode = new Random();
		 code = randomCode.nextInt();*/
		String nome = name + code;
		//return nome;
		System.out.println(nome);
	}
	void getPrezzoBase() {
		System.out.println(priece + "$");
	}
	
	
}

