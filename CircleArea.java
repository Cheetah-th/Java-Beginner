import java.util.Scanner;
class CircleArea
{
	public static void main(String[] args) 
	{
		Scanner Sc = new Scanner(System.in);
		System.out.print("input r => ");
		double r = Sc.nextDouble();
		double a = Math.PI * (r * r);
		System.out.println("Circle Area = " + a);
	}
}
