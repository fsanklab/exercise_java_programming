package ch03;
import java.util.Scanner;

public class Num_06 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int [] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1}; // 환산할 돈의 종류
		System.out.print("금액을 입력하시오>>");
		int money = scanner.nextInt();
		
		for (int i=0;i<unit.length;i++) {
			if (money/unit[i]!=0)
				System.out.println(unit[i] + "원 짜리 : " + money/unit[i] + "개");
			money%=unit[i];
		}
		
		scanner.close();
	}
}
 