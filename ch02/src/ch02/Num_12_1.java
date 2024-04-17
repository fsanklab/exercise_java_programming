package ch02;
import java.util.Scanner;

public class Num_12_1 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int a, b, result=0;
		String c;
		System.out.print("연산>>");
		a = scanner.nextInt();
		c = scanner.next();
		b = scanner.nextInt();
		if (b==0) {
			System.out.println("0으로 나눌 수 없습니다.");
			return;
		}
		
		if (c.equals("+"))
				result=a+b;
		else if (c.equals("-"))
			result=a-b;
		else if (c.equals("*"))
			result=a*b;
		else
			result=a/b;
		
		System.out.println(a+c+b+"의 계산 결과는 " + result);
		
		scanner.close();
	}
}
