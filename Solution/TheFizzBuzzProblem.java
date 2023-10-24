package Solution;
//The FizzBuzz Problem

import java.util.Scanner;

public class TheFizzBuzzProblem {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		if(n%3==0 && n%5==0) {
			System.out.println("FizzBuzz");
		}
		else if(n%3==0) {
			System.out.println("Fizz");
		}
		else if(n%5==0) {
			System.out.println("Buzz");
		}
		
		else {
			System.out.println("number is:"+n);
		}
	}
}
