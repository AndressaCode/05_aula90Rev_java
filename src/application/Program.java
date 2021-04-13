package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many products: ");
		int n = sc.nextInt();
		
		Product[] vect = new Product[n];
		
		for(int i = 0; i < vect.length; i++) {
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			vect[i] = new Product(name, price);  
		}
		
		double sum = 0.0;
		for(int i=0; i<vect.length; i++) {
			sum += vect[i].getPrice();
		}
		
		System.out.printf("Average price: %.2f", sum / n);
		
		sc.close();

	}

}
