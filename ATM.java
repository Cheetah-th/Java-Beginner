import java.util.Scanner;
class ATM
{
	public static void main(String[] args) 
	{
		Scanner Sc = new Scanner(System.in);
		System.out.print("Enter Money => ");
		int money = Sc.nextInt();
		int a , b1000, b500 , b100;
		
		if(money % 100 == 0)
		{
			b1000 = money / 1000;
			a = money % 1000;
			b500 = a / 500;
			a = a % 500;
			b100 = a / 100;

			System.out.println("B1000 = " + b1000);
			System.out.println("B500 = " + b500);
			System.out.println("B100 = " + b100);
		}

		else
		{
			System.out.println("Error");
		}
	}
}
