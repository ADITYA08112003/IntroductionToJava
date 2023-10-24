package Solution;

import java.util.Scanner;

//Alphabetic triangle
public class Alphabetictriangle {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<n;i++) {
			char s1='A';
			for(int j=0;j<=i;j++) {
				System.out.print(s1+" ");
				s1+=1;
			}
			System.out.println();
		}
	}
}
