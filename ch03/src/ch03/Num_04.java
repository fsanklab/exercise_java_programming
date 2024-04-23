package ch03;
import java.util.Scanner;

public class Num_04 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("소문자 알파벳 하나를 입력하시오>>");
		String s = scanner.next(); // Scanner에 문자를 입력받는 기능은 없다. 그러므로 문자열을 입력받아야 한다.
		char alphabet = s.charAt(0); // 문자열의 첫번째 문자를 따로 빼낸다.

		for (int i=0;i<=alphabet-'a';i++) {
			for (char c='a';c<=(char)(alphabet-i);c++)
				System.out.print(c);
			System.out.println();
		}
		
		scanner.close();
	}
}
 