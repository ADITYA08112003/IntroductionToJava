package Solution;
//Average Marks
import java.util.Scanner;

public class AverageMarks {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.next();
		int a1=s.nextInt();
		int a2=s.nextInt();
		int a3=s.nextInt();
		int Average=(a1+a2+a3)/3;
		System.out.println(str);
		System.out.println(Average);
	}
}
