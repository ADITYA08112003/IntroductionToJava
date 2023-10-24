package Solution;

import java.util.Scanner;

//Sum of even Numeber
public class SumofEvenNumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		if(n<0) {
			System.out.println("Invalid Number for sum of even number: "+n);
		}
		else {
			int sum=0;
			for(int i=2;i<=n;i+=2) {
				sum+=i;
			}
			System.out.println(sum);
		}
	}
}
