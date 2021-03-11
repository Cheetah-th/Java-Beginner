import java.util.Scanner;
class Digit
{
	public static void main(String[] args) 
	{
		Scanner Sc = new Scanner(System.in);
		System.out.print("Enter Number => ");
		int digit = Sc.nextInt();
		int n = 0;
		int a;
		double ans = 0;
		while (digit != 0)
		{
			a = digit % 2;
			digit = digit / 2;
			ans = a * Math.pow(10,n) + ans;
			n++;
		}
		System.out.println(ans);
	}
}
