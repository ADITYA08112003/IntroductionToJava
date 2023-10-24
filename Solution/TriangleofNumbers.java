package Solution;

import java.util.Scanner;

//Pattern2
//Triangle of Numbers
public class TriangleofNumbers {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			int q=i;
			for(int k=1;k<=i;k++) {
				System.out.print(q);
				q++;
			}
			q=2*i-2;
			for(int k1=1;k1<=i-1;k1++) {
				System.out.print(q);
				q--;
			}
			System.out.println();
		}
	}
}
