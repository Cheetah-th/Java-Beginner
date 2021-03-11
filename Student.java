import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n : ");
		int n = sc.nextInt();
		StudentType[] a = new StudentType[n + 1];
		
		GetData(a);
		System.out.println("Data");
		PrintData(a);
		System.out.println();

		BubbleSortByGPA(a);
		System.out.println("Sort By GPA");
		PrintData(a);
		System.out.println();

		BubbleSortByName(a);
		System.out.println("Sort By Name");
		PrintData(a);
		System.out.println();

		MaxMin(a);
		System.out.println();
		
		System.out.println("Top3");
		Top3(a);

	}

	public static void GetData(StudentType[] a) {
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i <= a.length - 1; i++) {
			a[i] = new StudentType();
			System.out.print("Enter Id : ");
			a[i].id = sc.nextInt();
			System.out.print("Enter Name : ");
			a[i].name = sc.next();
			System.out.print("Enter GPA : ");
			a[i].gpa = sc.nextDouble();
		}
	}

	public static void PrintData(StudentType[] a) {
		for (int i = 1; i <= a.length - 1; i++) {
			// System.out.print(a[i].id + " ");
			// System.out.print(a[i].name + " ");
			// System.out.println(a[i].gpa + " ");
			System.out.printf("%10d %15s %5.2f%n", a[i].id, formText(a[i].name, 15), a[i].gpa);

		}
	}

	public static void BubbleSortByGPA(StudentType[] a) {
		for (int i = 1; i <= a.length - 1; i++) {
			for (int j = 1; j <= a.length - 1 - i; j++) {
				if (a[j].gpa > a[j + 1].gpa) {
					StudentType temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}

	}

	public static void BubbleSortByName(StudentType[] a) {
		for (int i = 1; i <= a.length - 2; i++) {
			for (int j = 1; j <= a.length - 2; j++) {
				if ((a[j].name).compareTo(a[j + 1].name) > 0) {
					StudentType temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}

	}

	public static void MaxMin(StudentType[] a) {
		BubbleSortByGPA(a);
		double min = a[1].gpa;
		double max = a[a.length - 1].gpa;
		System.out.println("Min = " + min);
		System.out.println("Max = " + max);
	}

	public static void Top3(StudentType[] a) {
		BubbleSortByGPA(a);
		// t1 = a[a.length - 1].gpa;
		// t2 = a[a.length - 2].gpa;
		// double t3 = a[a.length - 3].gpa;
		// System.out.println("Top1 = " + t1);
		// System.out.println("Top2 = " + t2);
		// System.out.println("Top3 = " + t3);
		for (int i = a.length - 1; i >= a.length - 3 && i != 0; i--) {
			System.out.printf("%10d %15s %5.2f%n", a[i].id, formText(a[i].name, 15), a[i].gpa);
		}
	}
	
	public static String formText(String x, int len) {
		int p = x.length();
		for (int i = p + 1; i <= len; i++) {
			x = x + " ";
		}
		return x;
	}

}
