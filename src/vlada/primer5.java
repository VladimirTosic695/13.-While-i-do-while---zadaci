package vlada;

import java.util.Scanner;

public class primer5 {

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite vrednost za n:");
		int n = ulaz.nextInt();
		System.out.println("Unesite vrednost za k:");
		int k = ulaz.nextInt();
		double s = 0;
		int i = 1;
		while (i <= n) {
			s += k * i / Math.pow((2 * i - 1), 2);
			i++;
		}
		System.out.println("Suma s = " + s);
		ulaz.close();

	}

}
