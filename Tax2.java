import java.util.Scanner;
public class Tax2 {

	public static void main(String[] args) {
		double electric ,electricFT ,unit ,bill;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Electric Unit => ");
		electric = sc.nextDouble();
		electricFT = electric * 0.47;
		
		if (electric <= 20)
			unit = electric * 2;
		else if (electric <= 100)
			unit = 40 + (electric - 20) * 3;
			else if (electric <= 500)
				unit = 280 + (electric - 100) * 3.5;
				else unit = 1680 + (electric - 500) * 4;
		
		bill = unit + electricFT + 60;
		
		System.out.println("Electricity Bill = " + bill);
	}

}
