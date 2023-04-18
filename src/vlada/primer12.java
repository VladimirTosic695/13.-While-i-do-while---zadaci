package vlada;

import java.util.Scanner;

public class primer12 {

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite broj a");
		int a = ulaz.nextInt();
		System.out.println("Unesite broj b");
		int b = ulaz.nextInt();
		
		System.out.println("Brojevi u intervalu od "+a+" do "+b+" su: ");
		
		while (a<=b) {
			
			System.out.println(a);
			a = a*4;
		}
		ulaz.close();

	}

}
