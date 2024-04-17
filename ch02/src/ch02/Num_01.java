package ch02;
import java.util.Scanner;

public class Num_01 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int won;
		double dollar;
	
		System.out.print("원화를 입력하세요(단위 원)>>");
		won = scanner.nextInt();
		dollar = won/1100.;
		System.out.println(won+"원은 $"+dollar+"입니다.");
		
		scanner.close();
	}
}
