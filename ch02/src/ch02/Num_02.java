package ch02;
import java.util.Scanner;

public class Num_02 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n;
		System.out.print("2자리수 정수 입력(10~99)>>");
		n = scanner.nextInt();
		
		// 1. 십의 자리 == 1의 자리
		if (n/10 == n%10)
			System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
		
		// 2. 십의 자리 != 1의 자리
		else
			System.out.println("No.. 10의 자리와 1의 자리가 같지 않습니다.");
		scanner.close();
	}
}
