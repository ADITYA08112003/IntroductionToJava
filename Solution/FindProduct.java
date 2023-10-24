package Solution;

//Find Product
import java.util.Scanner;
public class FindProduct {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int product=1;
		if(n<0) {
			System.out.println("n is not defined");
		}
		else if(n==0 || n==1) {
			product=1;
		}
		else {
			for(int i=1;i<=n;i++) {
				product*=i;
			}
		}
		System.out.println(product);
	}
}
