import java.util.Scanner;
public class Past200_Past45 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Day => ");
		int dd1 = sc.nextInt();
		System.out.println("Enter Month => ");
		int mm1 = sc.nextInt();
		System.out.println("Enter Year => ");
		int yy1 = sc.nextInt();
		System.out.println("Enter Expire Day => ");
		int pastday = sc.nextInt();
		int sum = 0, dd = dd1 , mm = mm1, yy = yy1 - 543;
		past(pastday, sum, dd, mm, yy);
		
	}
	
	public static void  past (int pastday, int sum, int dd, int mm, int yy) {
		
		String[] month = {" ","Jan","Feb","Mur","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
		int[] daymonth = {0,31,28,31,30,31,30,31,31,30,31,30,31};

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

		System.out.println("Will expire in another : " + dd + " " + month[mm] + " " + yy + "\n");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Election Day => ");
		int pastday2 = sc.nextInt();
		sum = 0;
		
		while(sum < pastday2){
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

		System.out.println("Will election in another : " + dd + " " + month[mm] + " " + yy);

	}

}