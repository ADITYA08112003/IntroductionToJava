package Solution;

import java.util.Scanner;

//Operators & For Loop
//Nth Fibonacci Number
public class NthFibonacciNumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a=0,b=1,c;
		for(int i=1;i<=n;i++) {
			c=a+b;
			a=b;
			b=c;
		}
		System.out.println(a);
	}
}
