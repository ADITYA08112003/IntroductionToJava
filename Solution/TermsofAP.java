package Solution;

import java.util.Scanner;

//Operations & For loop
//Terms of AP
public class TermsofAP {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int c=1;
		for(int i=1;i<=n;i++) {
			int Ap=3*c+2;
			if(Ap%4!=0) {
				System.out.print(Ap+" ");
			}
			else {
				i--;
			}
			c++;
		}
	}
}
