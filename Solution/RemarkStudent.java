package Solution;

import java.util.Scanner;

//Remark Student
public class RemarkStudent {
 public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	if(n<0) {
		System.out.println("Invalid Number");
	}
	else {
		if(n>75 && n<=100) {
			System.out.println("Distinction and Number is:"+n);
		}
		else if(n>50 && n<=75) {
			System.out.println("Average and Number is:"+n);
		}
		else if(n>35 && n<=50) {
			System.out.println("Below Average and Number is:"+n);
		}
		else {
			System.out.println("Failed and Number is:"+n);
		}
	}
}
}
