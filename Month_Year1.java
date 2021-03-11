import java.util.Scanner;
public class Month_Year1 {

	public static void main(String[] args) {
		String[] month = {" ","Jan","Feb","Mur","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
		int [] daymonth = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Day => ");
		int dd1 = sc.nextInt();
		System.out.println("Enter Month => ");
		int mm1 = sc.nextInt();
		System.out.println("Enter Year => ");
		int yy1 = sc.nextInt();
		System.out.println("Enter Number of Day => ");
		int pastday = sc.nextInt();
		int sum = 0, dd = dd1 , mm = mm1, yy = yy1 - 543;

		while(sum < pastday){
			sum++; dd++;
			
			if(dd > daymonth[mm]){
				mm++; dd = 1;
				if(mm == 13){
					yy++; mm = 1;
					if(yy % 4 == 0){
						daymonth[2] = 29;
					}
				}
			}
		}

		System.out.println(dd + " " + month[mm] + " " + yy);

	}

}
