package vlada;

import java.text.DecimalFormat;


public class primer11 {

	public static void main(String[] args) {
		
		double y;
		int i = 1;
		DecimalFormat df = new DecimalFormat("#.##"); 
		
		System.out.println("\tR.BR."+"\tX"+"\tY(X)");
		
		for(double x = 1; x<=2; x+=0.2) {
			y = x + 2.5 * Math.pow(x, 3) / (x-2.8);
			System.out.println("\t"+i+"\t"+df.format(x)+"\t"+df.format(y));
			i++;
		}
	}

}
