package vlada;

import java.io.*;

public class primer1Do {

	public static void main(String[] args) throws Exception {
		double suma = 0;
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Unesite vrednost za n: ");
		int n = Integer.parseInt(bf.readLine());
		int i =1;
		do {
			suma+=(double)i/(i+1);
			i++;
		} while (i<=n);
		System.out.println("Suma je "+suma);
		

	}

}
