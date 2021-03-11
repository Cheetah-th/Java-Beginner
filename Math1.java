import java.util.Scanner;
class Math1
{
	public static void main(String[] args) 
	{
		Scanner Sc = new Scanner(System.in);
		System.out.print("input a => ");
		double a = Sc.nextDouble();
		System.out.print("input b => ");
		double b = Sc.nextDouble();
		System.out.print("input c => ");
		double c = Sc.nextDouble();
		
		double k = Math.sqrt((Math.pow(b,2)) - 4 * a * c);
		double m = -b + k / (2 * a);
		double n = -b - k / (2 * a);
		System.out.println("x = " + m );
		System.out.println("x = " + n );
	}
}
