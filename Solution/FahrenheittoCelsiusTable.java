package Solution;

import java.util.Scanner;

//Fahrenheit to Celsius Table
public class FahrenheittoCelsiusTable {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int start=s.nextInt();
		int end=s.nextInt();
		int step=s.nextInt();
		for(int i=start;i<=end;i+=step) {
			int celsius=(i-32)*5/9;
			System.out.println("convert the farhenheit to celsius:and farhenheit is:  "+i+"  celsius is:"+celsius);
		}
	}
}
