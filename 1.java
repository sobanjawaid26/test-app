import java.util.Scanner;

public class Demo {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int star = n/2;
	int space = 1;
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < star; j++) {
			System.out.print("*");
		}
		for (int j = 0; j < space; j++) {
			System.out.print(" ");
		}
		for (int j = 0; j < star; j++) {
			System.out.print("*");
		}
		if(i<n/2) {
			star--;
			space +=2;
		}
		else {
			star++;
			space -=2;
		}
		System.out.println();

	}
}
}