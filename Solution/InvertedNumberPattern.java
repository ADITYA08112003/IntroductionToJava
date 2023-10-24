package Solution;

import java.util.Scanner;

//Inverted Number Pattern
public class InvertedNumberPattern {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i;j++) {
				System.out.print(n-i);
			}
			System.out.println();
		}
	}
}
