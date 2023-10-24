package Solution;
//Check Prime Number
import java.util.Scanner;

public class CheckPrimeNumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		if(n<0) {
			System.out.println("Invalid Number");
		}
		else {
			boolean flag=true;
			for(int i=2;i<n;i++) {
				if(n%i==0) {
					flag=false;
					System.out.println("n is not a prime number and number is:"+n);
					break;
				}
			}
			if(flag) {
				System.out.println("n is prime numebr and number is:"+n);
			}
		}
	}
}
