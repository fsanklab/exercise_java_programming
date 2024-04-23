package ch03;

public class Num_13 {
	public static void main(String args[]) {
		for (int i=1;i<100;i++) {
			if (i<10 && i%3==0)
				System.out.println(i + "박수 짝");
			if (i>10) {
				// 1. 십의 자리와 일의 자리 모두 369인 경우
				if ((i/10==3 || i/10==6 || i/10==9)
					&& (i%10==3 || i%10==6 || i%10==9)) {
					System.out.println(i + "박수 짝짝");
					continue;
				}
				// 2. 십의 자리만 369인 경우
				if (i/10==3 || i/10==6 || i/10==9)
					System.out.println(i + "박수 짝");
				// 3. 일의 자리만 369인 경우
				if (i%10==3 || i%10==6 || i%10==9)
					System.out.println(i + "박수 짝");
			}
		}
	}
}