package vlada;

import java.text.DecimalFormat;
import java.util.Scanner;

public class primer3 {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.##");
		Scanner sc = new Scanner(System.in);
		double a,eps; int n;
		System.out.println("Unesite n");
		n = sc.nextInt();
		System.out.println("Unesite a");
		a = sc.nextDouble();
		System.out.println("Unesite epsilon");
		eps = sc.nextDouble();
		
		double x0,x1;
		x0 = (a+n-1)/n;
		x1 = ((n-1)*x0+a/Math.pow(x0, n-1))/n;
		
		do {
			x0 = x1;
			x1 = ((n-1)*x0+a/Math.pow(x0, n-1))/n;
		} while (Math.abs(x1-x0)>eps);
		System.out.println("Dobijena vrednost x = "+df.format(x1));
		sc.close();
	}

}
