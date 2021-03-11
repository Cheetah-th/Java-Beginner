import java.util.Scanner;
import java.util.ArrayList;

class StudentAB0 {
	private int id;
	private String group;
	private String name;
	private double gpa;
	private double onetEng;
	private double onetMath;
	private double onetScience;

	StudentAB0(int i, String gr, String n, double g, double eng, double math, double sci) {
		id = i;
		group = gr;
		name = n;
		gpa = g;
		onetEng = eng;
		onetMath = math;
		onetScience = sci;
	}

	public int getId() {
		return id;
	}

	public String getGroup() {
		return group;
	}

	public String getName() {
		return name;
	}

	public double getGpa() {
		return gpa;
	}

	public double getEng() {
		return onetEng;
	}

	public double getMath() {
		return onetMath;
	}

	public double getScience() {
		return onetScience;
	}

	public double calPoint() {
		return gpa * 10 / 4 + onetEng * 20 / 100 + onetMath * 40 / 100 + onetScience * 30 / 100;
	}

}

class StudentA0 extends StudentAB0 {
	private double gat;
	private double pat1;
	private double pat2;

	StudentA0(int i, String gr, String n, double g, double eng, double math, double sci, double ga, double p1,
			double p2) {
		super(i, gr, n, g, eng, math, sci);
		gat = ga;
		pat1 = p1;
		pat2 = p2;
	}

	public double getGat() {
		return gat;
	}

	public double getPat1() {
		return pat1;
	}

	public double getPat2() {
		return pat2;
	}

	public String printAB0() {
		String x = "GAT " + gat + " PAT1 " + pat1 + " PAT2 " + pat2;
		return x;
	}

	public double calPointAB0() {
		return gat * 20 / 100 + pat1 * 40 / 100 + pat2 * 40 / 100;
	}

}

class StudentB0 extends StudentAB0 {
	private double s19;
	private double s29;
	private double s39;
	private double s49;

	public StudentB0(int i, String gr, String n, double g, double eng, double math, double sci, double ss19,
			double ss29, double ss39, double ss49) {
		super(i, gr, n, g, eng, math, sci);
		s19 = ss19;
		s29 = ss29;
		s39 = ss39;
		s49 = ss49;
	}

	public double getS19() {
		return s19;
	}

	public double getS29() {
		return s29;
	}

	public double getS39() {
		return s39;
	}

	public double getS49() {
		return s49;
	}

	public String printAB0() {
		String x = "S19 " + s19 + " S29 " + s29 + " S39 " + s39 + " S49 " + s49;
		return x;
	}

	public double calPointAB0() {
		return s19 * 10 / 100 + s29 * 20 / 100 + s39 * 40 / 100 + s49 * 30 / 100;
	}

}

class StudentObjAB0 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayList<StudentA0> aList = new ArrayList<>();
		ArrayList<StudentB0> bList = new ArrayList<>();
		int id = 0;
		String name, group;
		double gpa, eng, math, science, gat, pat1, pat2, s19, s29, s39, s49;

		while (true) {
			System.out.print("Enter ID or Enter -1 for Exit : ");
			id = sc.nextInt();
			if (id == -1) {
				break;
			}
			System.out.print("Enter Group : ");
			group = sc.next();
			System.out.print("Enter Name : ");
			name = sc.next();
			System.out.print("Enter GPA : ");
			gpa = sc.nextDouble();
			System.out.print("Enter ONET English : ");
			eng = sc.nextDouble();
			System.out.print("Enter ONET Math : ");
			math = sc.nextDouble();
			System.out.print("Enter ONET Science : ");
			science = sc.nextDouble();
			switch (group) {
			case "a":
				System.out.print("Enter GAT : ");
				gat = sc.nextDouble();
				System.out.print("Enter PAT1 : ");
				pat1 = sc.nextDouble();
				System.out.print("Enter PAT2 : ");
				pat2 = sc.nextDouble();
				aList.add(new StudentA0(id, group, name, gpa, eng, math, science, gat, pat1, pat2));
				break;
			case "b" :
				System.out.print("Enter s19 : ");
				s19 = sc.nextDouble();
				System.out.print("Enter s29 : ");
				s29 = sc.nextDouble();
				System.out.print("Enter s39 : ");
				s39 = sc.nextDouble();
				System.out.print("Enter s49 : ");
				s49 = sc.nextDouble();
				bList.add(new StudentB0(id, group, name, gpa, eng, math, science, s19, s29, s39, s49));
				break;
			}
		}
		System.out.println("-----------------------------------------------");
		reportStudentA0(aList);
		reportStudentB0(bList);
		System.out.println("----------------------END----------------------");

	}
	
	public static void reportStudentA0(ArrayList<StudentA0> aList) {
		for(StudentA0 x : aList) {
			System.out.printf("ID %8d Group %s Name %-20s \n", x.getId(), x.getGroup(), x.getName());
			System.out.printf("GPA %5.2f ONET English %6.2f \n", x.getGpa(), x.getEng());
			System.out.printf("ONET Math %5.2f ONET Science %6.2f \n", x.getMath(), x.getScience());
			System.out.printf(x.printAB0());
			System.out.printf("\npoint = %6.2f \n", (x.calPoint() + x.calPointAB0()) / 2);
			System.out.printf("-----------------------------------------------\n");
		}
		
	}
	
	public static void reportStudentB0(ArrayList<StudentB0> bList) {
		for(StudentB0 x : bList) {
			System.out.printf("ID %8d Group %s Name %-20s \n", x.getId(), x.getGroup(), x.getName());
			System.out.printf("GPA %5.2f ONET English %6.2f \n", x.getGpa(), x.getEng());
			System.out.printf("ONET Math %5.2f ONET Science %6.2f \n", x.getMath(), x.getScience());
			System.out.printf(x.printAB0());
			System.out.printf("\npoint = %6.2f \n", (x.calPoint() + x.calPointAB0()) / 2);
			System.out.printf("-----------------------------------------------\n");
		}
		
	}

}
