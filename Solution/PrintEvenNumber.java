package Solution;

import java.util.Scanner;

//Print Even Number
public class PrintEvenNumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=2;i<=n;i+=2) {
			System.out.print(i+" ");
		}
	}
}
