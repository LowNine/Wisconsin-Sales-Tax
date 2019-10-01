import java.util.Scanner;
import java.lang.Math;

public class WisconsinSalesTax {
	public static double wisconsinTax(double totalSale) {
	totalSale = totalSale + totalSale * 0.055;
	totalSale = Math.round(totalSale * 100.0); // Multiply by 100.0 then use round method to get ####.0
	totalSale = totalSale / 100.0; // Divide by 100.0 to get a ##.## (Rounded to 2 decimal places for $)
	
	return totalSale;
	
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total sale amount ($): ");
		double price = sc.nextDouble();
		System.out.println("$" + wisconsinTax(price));
	}
	
	
}
