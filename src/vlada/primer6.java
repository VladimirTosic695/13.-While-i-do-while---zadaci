package vlada;

import java.util.Scanner;

public class primer6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int suma = 0, p = 1, i = 1;
		
		System.out.println("Unesite n");
		int n = sc.nextInt();
		
		while (i<=n) {
			
			p*=i;
			suma+=p; 
			i++;
		}
		System.out.println("Suma je "+suma);
		sc.close();
	}

}
