package Solution;

import java.util.Scanner;

//All Fibonacci Number
public class AllFibonacciNumber {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		if(n<=0) {
			System.out.println("Invalid Number");
		}
		else if(n==1) {
			System.out.println("0");
		}
		else if(n==2) {
			System.out.println("1");
		}
		else {
			int n1=0;
			int n2=1;
			System.out.print(n1+" "+n2+" ");
			for(int i=3;i<=n;i++) {
				int sum=n1+n2;
				System.out.print(sum+" ");
				n1=n2;
				n2=sum;
			}
			
		}
	}
}
