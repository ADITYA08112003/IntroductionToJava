package Solution;
// Find Character case
import java.util.Scanner;

public class FindCharacterCase {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		char c=s.next().charAt(0);
		int i=c;
//		a=97 and z=122
		if(i>=97 && i<=122) {
			System.out.println("0");
		}
//		A=65 and Z=90
		else if(i>=65 && i<=90) {
			System.out.println("1");
		}
		else {
			System.out.println("-1");
		}

	}

}
