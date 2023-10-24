package Solution;

import java.util.Scanner;

//Basic Pattern
public class BasicPattern {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int row=0;row<n;row++) {
			for(int column=0;column<n;column++) {
				System.out.print("#");
			}
			System.out.println();
		}
	}
}
