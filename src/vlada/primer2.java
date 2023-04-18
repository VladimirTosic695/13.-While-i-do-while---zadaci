package vlada;

import java.util.Scanner;

public class primer2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj");
		int broj = sc.nextInt();
		
		System.out.println("Ovaj broj ispisan unazad je ");
		do {
			int cifra = broj % 10;
			broj = broj / 10;
		System.out.print(cifra);
		} while (broj!=0);
		sc.close();
		

	}

}
