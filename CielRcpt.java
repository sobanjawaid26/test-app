package One;

import java.util.Scanner;

public class cielRcpt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++){
		    double a = sc.nextInt();
		    int count = 0;
		    for(int j=12;j>0;j--){
		        while(a>=Math.pow(2,j-1)&& a!=0){
		            a = a-Math.pow(2,j-1);		            
		            count++;
		            
		        }
		       
		    }
		    System.out.println(count);
		}
	}
}
