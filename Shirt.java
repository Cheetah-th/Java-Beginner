import java.util.Scanner;
public class Shirt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Price => ");
		double price = sc.nextDouble();
		System.out.print("Enter Number => ");
		int shirt = sc.nextInt();
		price = price * shirt;
		
		if (price >= 300) {
		price = price - 97 / 100;
		}
		
		price =  price + 107 / 100;
		
		System.out.println("All Price = "+price);
		
		System.out.print("Enter Money => ");
		double money = sc.nextDouble();
		double change = money - price;
		
		System.out.println("Change = "+change);
	}

}
