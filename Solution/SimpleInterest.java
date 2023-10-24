package Solution;
//Simple Interest
import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int p=s.nextInt();
		double r=s.nextDouble();
		int t=s.nextInt();
		
		double si=(p*r*t)/100;
//		convert the double into integer
		int ans=(int)si;
		
		System.out.println("Simple Interest of p,r,t is:"+ans);

	}

}
