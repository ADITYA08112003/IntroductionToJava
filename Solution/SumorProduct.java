package Solution;

import java.util.Scanner;

// Operators & For Loop
//Sum or Product
public class SumorProduct {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int n1=s.nextInt();
		
		if(n1==1) {
			int sum=0;
			for(int i=1;i<=n;i++) {
				sum+=i;
			}
			System.out.println("sum of n number is:"+sum);
		}
		else if(n1==2) {
			int product=1;
			for(int i=1;i<=n;i++) {
				product*=i;
			}
			System.out.println("Product of n number is:"+product);
		}
		else {
			System.out.println("-1");
		}
	}
}
