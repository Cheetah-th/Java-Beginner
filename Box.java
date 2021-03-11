import java.util.Scanner;
class Box 
{
	public static void main(String[] args) 
	{
		Scanner Sc = new Scanner(System.in);
		System.out.print("P => ");
		int p = Sc.nextInt();
		int l,m,s,r,pay;
		s = 0;
		l = p / 20;
		m = p % 20 / 10;
		r = p % 20 % 10;

		if (r > 5)
		{
			m++;
		}
		
		else
		{
			s++;
		}
		
		pay = p * 30 + l * 25 + m * 15 + s * 10;

		System.out.println(pay);
	}
}
