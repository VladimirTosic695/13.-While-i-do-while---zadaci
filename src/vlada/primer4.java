package vlada;

import java.util.Scanner;

public class primer4 {

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		int suma = 0, i = 1,broj;
		broj = i;
		while(broj!=0 && i<=10) {
			System.out.println("Unesite "+i+". broj.");
			broj = ulaz.nextInt();
			i++;
			if (broj%2==0)
				suma+=broj;
		}
		System.out.println("Suma parnih brojeva je "+suma);
		ulaz.close();
	}

}
