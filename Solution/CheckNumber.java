package Solution;

import java.util.Scanner;

//Check Number
public class CheckNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		if(n>0) {
			System.out.println("if n is postive then print 1 and number is:"+n);
		}
		else if(n<0) {
			System.out.println("if n is negative then print -1 and number is:"+n);
		}
		else {
			System.out.println("if n is equal to zero then print 0 and number is:"+n);
		}
	}

}
