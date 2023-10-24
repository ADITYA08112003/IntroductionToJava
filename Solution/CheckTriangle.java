package Solution;

import java.util.Scanner;

//Check Triangle
public class CheckTriangle {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n1=s.nextInt();
		int n2=s.nextInt();
		int n3=s.nextInt();
		if(n1+n2>n3 && n2+n3>n1 && n3+n1>n2) {
			if(n1==n2 && n2==n3 && n3==n1) {
				System.out.printf("Side of triangle are valid and formed a equilateral triangle and side are:%d,%d,%d",n1,n2,n3);
			}
			else if(n1==n2 || n2==n3 || n3==n1) {
				System.out.printf("Side of triangle are valid and formed a isoscelec triangle and side are:%d,%d,%d",n1,n2,n3);
			}
			else {
				System.out.printf("Side of triangle are valid and formed a scalence triangle and side are:%d,%d,%d",n1,n2,n3);
			}
		}
		else {
			System.out.println("side of traingle are invalid.");
		}
	}
}
