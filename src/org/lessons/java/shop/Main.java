package org.lessons.java.shop;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Prodotto product = new Prodotto();
		product.name = "Olio";
		product.description = "Olio di oliva quasi vergine ";
		product.price= 9.99;
		product.iva = 22;
		product.code = 123;
		product.getPrezzoConIva();;
		product.codiceEstesto();
		//System.out.println(product.codiceEstesto());
		product.getCode();
		//System.out.println(product.getCode());
		product.getPrezzoBase();
		Scanner scan = new Scanner(System.in);
		System.out.println("insereisci il nome del prodotto");
		Prodotto product2= new Prodotto();
		product2.name = scan.nextLine();
		System.out.println("insereisci la descrizione del prodotto");
		product2.description = scan.nextLine();
		System.out.println("insereisci il prezzo senza iva del prodotto");
		product2.price = scan.nextDouble();
		System.out.println("insereisci l'iva del prodotto");
		product2.iva = scan.nextDouble();
		System.out.println("Il prezzo con iva e ugaula e a " + product2.getPrezzoConIva());
		System.out.println("Il codice del prodotto e " + product2.getCode());
		System.out.println("Le info del prodotto inserito sono "+ product2.getInfoProdotto());
		
		
		
		
		
		
	}
}
