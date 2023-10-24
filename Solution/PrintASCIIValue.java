package Solution;

import java.util.Scanner;

//Print ASCII Value
public class PrintASCIIValue {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		char c=s.next().charAt(0);
		int i=c;
		System.out.println("Print ASCII Value of character "+c+" is :"+i);
	}
}
