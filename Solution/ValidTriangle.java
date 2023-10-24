package Solution;

import java.util.Scanner;

//Valid Triangle
public class ValidTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int t1=s.nextInt();
		int t2=s.nextInt();
		int t3=s.nextInt();
		
		if(t1+t2>t3 && t2+t3>t1 && t3+t1>t2) {
			System.out.printf("side of triangle are formed a valid triangle and side are  %d,%d.%d",t1,t2,t3);
		}
		else {
			System.out.printf("side of triangle are not formed a valid triangle and side are %d,%d,%d",t1,t2,t3);
		}
	}

}
