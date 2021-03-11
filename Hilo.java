import java.util.Random;
import java.util.Scanner;
class Hilo 
{
	public static void main(String[] args) {

		Random rand = new Random();
		int x = rand.nextInt(6);
		int y = rand.nextInt(6);
		int z = rand.nextInt(6);
		Scanner sc = new Scanner(System.in);
		System.out.println("H or L");
		String HL = sc.nextLine().toUpperCase();
		String Hilo;
		double point = (int)(x + y + z);

		if (point > 11) Hilo = "H";
		else Hilo = "L";
		
		if (HL.equals(Hilo)) System.out.println("Win");
		else System.out.println("Lose");

		System.out.println(x +" "+ y +" "+ z);
	}
}
