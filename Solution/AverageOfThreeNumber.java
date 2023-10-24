package Solution;
//Average of three number
import java.util.Scanner;

public class AverageOfThreeNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		double d1=s.nextDouble();
		double d2=s.nextDouble();
		double d3=s.nextDouble();
		double average=(d1+d2+d3)/3;
		System.out.println("Average of three Number is:"+average);
		System.out.println("Roundoff of Average is:"+Math.round(average));

	}

}
