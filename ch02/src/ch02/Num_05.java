package ch02;
import java.util.Scanner;

public class Num_05 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int a,b,c;
		System.out.print("정수 3개를 입력하시오>>");
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
		
		int max=a<b?a:b;
		max = max<c?c:max;
		if ((max==a && b+c>a) || (max==b && a+c>b) || (max==c&&a+b>c))
			System.out.println("삼각형이 됩니다");
		else
			System.out.println("삼각형이 안됩니다");
		
		scanner.close();
	}
}
