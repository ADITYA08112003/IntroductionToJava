package Solution;

import java.util.Scanner;

//Sum of Even and Odd number in number
public class SumOfEvenandOdd {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int sumofEven=0,sumofOdd=0;
		while(n>0) {
			if(n%2==0) {
				sumofEven+=n%10;
				
			}
			else {
				sumofOdd+=n%10;
			}
			n/=10;
		}
		System.out.println("sum of Even :"+sumofEven+"  sum of Odd :"+sumofOdd);
	}
}
