package ch02;
import java.util.Scanner;

public class Num_06 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n, count=0;
		System.out.print("1~99 사이의 정수를 입력하시오>>");
		n = scanner.nextInt();
		
		if (n%10==3 || n%10==6 || n%10==9)
			count++;
		if (n/10==3 || n/10==6 || n/10==9)
			count++;
		
		if (count==1)
			System.out.println("박수짝");
		else
			System.out.println("박수짝짝");
		
		scanner.close();
	}
}
