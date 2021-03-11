import java.util.Scanner;
class Scanner1 
{
	public static void main(String[] args) 
	{
		Scanner Sc = new Scanner(System.in);
		System.out.print("input x => ");
		double x = Sc.nextDouble();
		System.out.print("input y => ");
		double y = Sc.nextDouble();
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("x + y = " + (x+y));
		System.out.println("x - y = " + (x-y));
		System.out.println("x * y = " + (x*y));
		System.out.println("x / y = " + (x/y));
	}
}
