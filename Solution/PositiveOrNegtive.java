package Solution;

import java.util.Scanner;

//Positive or Negative
public class PositiveOrNegtive {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		if(n>0) {
			System.out.println("n is positive and number is:"+n);
		}
		else {
			System.out.println("n is negative and number is:"+n);
		}
	}
}
