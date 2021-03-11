import java.util.Scanner;
class FacPower
{ public static void main (String args[])
    { double sum = 1;
	  Scanner scan = new Scanner(System.in);
	  System.out.print("Enter number :");
	  int n = scan.nextInt();
	  for (int p=1; p<=n; p++ )
		{  
		  long fac = 1;       
          for(int i = 1; i<=p; i++)
              fac *= i;    
                   
          double pow = 1;       
          for(int i = 1; i <= Math.abs(p); i++)
              pow *= 2;
	      if(p < 0) pow = 1/pow;

		  sum = sum + pow/fac;
		}
      System.out.println(sum);
	}
}