package Solution;

import java.util.Scanner;

//Square Pattern
public class SquarePattern {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int row=0;row<n;row++) {
			for(int column=0;column<n;column++) {
				System.out.print(n);
			}
			System.out.println();
		}
	}
}
