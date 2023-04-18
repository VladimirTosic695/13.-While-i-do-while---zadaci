package vlada;

import java.util.Scanner;

public class primer13 {

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		int s = 0,a=1;

		while (a!=5) {
			System.out.println("Unesite vrednost za a:");
			a = ulaz.nextInt();
			if (a%2==0 || a%7==0)
				s+=a;
			
		}
		System.out.println("Suma je "+s);
		ulaz.close();
	}

}
