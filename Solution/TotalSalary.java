package Solution;

import java.util.Scanner;

//Total Salary

//totalSalary = basic + hra + da + allow – pf
//hra   = 20% of basic
//da    = 50% of basic
//allow = 1700 if grade = ‘A’
//allow = 1500 if grade = ‘B’
//allow = 1300 if grade = ‘C' or any other character
//pf    = 11% of basic.
public class TotalSalary {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int basic=s.nextInt();
		char grade=s.next().charAt(0);
		int allow;
		if(grade=='A') {
			allow=1700;
		}
		else if(grade=='B') {
			allow=1500;
		}
		else {
			allow=1300;
		}
		double d=basic+.2*basic+.5*basic+allow-.11*basic;
		int totalsalary=(int)Math.round(d);
		System.out.println("Total Salary is: "+totalsalary);
		
	}
}
