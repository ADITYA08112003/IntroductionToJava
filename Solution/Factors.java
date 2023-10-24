package Solution;

import java.util.Scanner;

//Factors of number
public class Factors {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		boolean flag=false;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				flag=true;
				System.out.println("Factors of n is :"+i);
			}
		}
		if(!flag) {
			System.out.println("-1");
		}
	}
}
