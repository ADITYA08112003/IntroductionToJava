package Solution;

import java.util.Scanner;

//Triangular Star Pattern
public class TriangularStarPattern {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int row=0;row<n;row++) {
			for(int column=0;column<=row;column++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
