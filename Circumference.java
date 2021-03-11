import java.util.Scanner;
class Circumference
{
	public static void main(String[] args) 
	{
		Scanner Sc = new Scanner(System.in);
		System.out.print("input r => ");
		double r = Sc.nextDouble();
		double a = 2 * Math.PI * r;
		System.out.println("Circumference = " + a);
	}
}
