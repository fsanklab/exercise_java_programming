package ch03;
/*
1-1) 0~99까지의 짝수의 합을 구하는 코드, 실행결과: 2450
 */
public class Num_01_WhileTest {
	// 1-2) 문제 식별을 쉽게하기위해 클래스명은 Num_01_WhileTest로 함.
	// 1-3과 1-4는 Num_01_ForTest와 Num_01_DoWhileTest로 구현함.
	
	public static void main(String args[]) {
		int sum=0, i=0;
		while (i<100) {
			sum+=i;
			i+=2;
		}
		System.out.println(sum);
	}
}
 