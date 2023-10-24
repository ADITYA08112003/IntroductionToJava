package Solution;

import java.util.Scanner;

//Triangle Number Pattern
public class TriangleNumberPattern {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int row=1;row<=n;row++) {
			for(int column=1;column<=row;column++) {
				System.out.print(row);
			}
			System.out.println();
		}
	}
}
