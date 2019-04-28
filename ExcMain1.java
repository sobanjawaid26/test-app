import java.util.Scanner;

public class ExcMain1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st no");
		int a = sc.nextInt();
		System.out.println("Enter 2nd no");
		int b = sc.nextInt();
		try{
		double q = a/b;
		System.out.println("result is " + q);
		}catch(Exception e){
			System.out.println("Enter valid b value");
		}
		finally {
			System.out.println("I run no matter what ");
		}
	}
}
