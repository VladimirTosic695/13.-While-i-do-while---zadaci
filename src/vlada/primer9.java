package vlada;

import java.util.Scanner;

public class primer9 {

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in); 
		System.out.println("Unesite vrednost za n:");
		int n = ulaz.nextInt();
		System.out.println("Unesite vrednost za k:");
		int k = ulaz.nextInt();
		
		int i = 1;
		double s = 0,p = 1;
		while (i<=n) {
			p*=i;
			s+=p/Math.pow(k, i);
			i++;
		}
		System.out.println("Suma je "+s);
		ulaz.close();
		

	}

}
