package Solution;

import java.util.Scanner;

//Operations & For loop
//Binary to decimal
public class Binarytodecimal {
	
//	process1
	public static void BinaryToDecimal1() {
		Scanner s=new  Scanner(System.in);
		int n=s.nextInt();
		int c=0;
		double val=0;
		while(n>0) {
			int rem=n%2;
			val=rem*Math.pow(2.0, c)+val;
			c++;
			n=n/10;
		}
		int val1=(int)val;
		System.out.println(val1);
	}
	
//	Process2
	public static void BinaryToDecimal2() {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int decimal=0,pow=1;
		for(;n>0;) {
			int last=n%2;
			decimal+=last*pow;
			pow*=2;
			n=n/10;
			
		}
		System.out.println(decimal);
	}
	
	public static void main(String[] args) {
		BinaryToDecimal1();
		BinaryToDecimal2();
	}
}
