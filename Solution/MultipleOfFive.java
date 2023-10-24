package Solution;

import java.util.Scanner;

//Multiple of Five

public class MultipleOfFive {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		if(n%5==0) {
			System.out.println(n+" is Multiple of 5");
		}
		else {
			System.out.println(n+" is not Multiple of 5");
		}
	}
}
