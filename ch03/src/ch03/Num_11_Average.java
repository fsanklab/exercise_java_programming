package ch03;

public class Num_11_Average {
	public static void main(String args[]) {
		int sum=0;
		if (args.length==0) {
			System.out.println("입력된 명령형 변수가 없습니다.");
			return;
		}
		for (int i=0;i<args.length;i++)
			sum+=Integer.parseInt(args[i]);  // 문자열->정수 변환시, Integer.parseInt("10");을 이용한다.
		System.out.println(sum/args.length);
	}
}
 