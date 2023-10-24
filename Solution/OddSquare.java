package Solution;

import java.util.Scanner;

//Pattern2
//Odd Square
public class OddSquare {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++) {
			int value=2*i-1;
			for(int j=1;j<=n;j++) {
				System.out.print(value);
				value+=2;
				int maxValue=2*n-1;
				if(value>maxValue) {
					value=1;
				}
			}
			System.out.println();
		}
	}
}
