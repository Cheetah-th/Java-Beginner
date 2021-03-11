import java.util.Scanner;
public class Month_Year2 {

	public static void main(String[] args) {
		String[] month = {" ","Jan","Feb","Mur","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
		int [] daymonth = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Day");
		int dd1 = sc.nextInt();
		System.out.println("Enter Month");
		int mm1 = sc.nextInt();
		System.out.println("Enter Year");
		int yy1 = sc.nextInt();
		System.out.println("Enter Number of Day");
		int backday = sc.nextInt();
		int sum = 0, dd = dd1 , mm = mm1, yy = yy1 - 543;

		while(sum < backday){
			sum++; dd--;
			
			if(dd == 0){
				mm--; dd = daymonth[mm];
				if(mm == 0){
					yy--; mm = 12; dd = daymonth[mm];
					if(yy % 4 == 0){
						daymonth[2] = 29;
					}
				}
			}
		}

		System.out.println(dd + " " + month[mm] + " " + yy);

	}

}
