package Solution;

import java.util.Scanner;

//Operation & For Loop
//Reverse of a number
public class Reverseofanumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int val=0;
		while(n>0) {
			int rem=n%10;
			val=val*10+rem;
			n=n/10;
		}
		System.out.println(val);
	}
}
