package Solution;

import java.util.Scanner;

//Reverse Char Pattern
public class ReverseCharPattern {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print((char)('A'+n-j-1));
			}
			System.out.println();
		}
	}
}
