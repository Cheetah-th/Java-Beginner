import java.util.Scanner;

class Person {
	private int id;
	private String name;
	private double scoreBefore;

	Person(int i, String n, double s) {
		id = i;
		name = n;
		scoreBefore = s;
	}

	public int getID() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getScoreBefore() {
		return scoreBefore;
	}

}

class Nursary_Student extends Person {
	private double scoreTerm1;
	private double scoreTerm2;
	private double scoreCompare;

	Nursary_Student(int i, String n, double s, double st1, double st2) {
		super(i, n, s);
		scoreTerm1 = st1;
		scoreTerm2 = st2;
	}

	public double Calculate() {
		scoreCompare = ((scoreTerm1 + scoreTerm2) / 2 - getScoreBefore());
		return scoreCompare;
	}

}

class Student_Extends {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Get ID : ");
		int id = sc.nextInt();
		System.out.print("Get Name : ");
		String name = sc.next();
		System.out.print("Get Score Before Class : ");
		double scoreBefore = sc.nextDouble();
		System.out.print("Get Score Term 1 : ");
		double scoreTerm1 = sc.nextDouble();
		System.out.print("Get Score Term 2 : ");
		double scoreTerm2 = sc.nextDouble();

		Nursary_Student x = new Nursary_Student(id, name, scoreBefore, scoreTerm1, scoreTerm2);

		System.out.println("ID : " + x.getID());
		System.out.println("Name : " + x.getName());
		System.out.println("Score Before Class : " + x.getScoreBefore());
		System.out.println("Score Compare : " + x.Calculate());

	}

}
