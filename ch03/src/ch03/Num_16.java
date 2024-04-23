package ch03;
import java.util.Scanner;
import java.util.Random;

public class Num_16 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String user;
		String str[]= {"가위", "바위", "보"};
		
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		while (true) {
			System.out.print("가위 바위 보!>>");
			user = scanner.next();
			// "그만"을 입력한다면 종료
			if (user.equals("그만")) {
				System.out.println("게임을 종료합니다...");
				break;
			}
			// 컴퓨터 가위바위보 결정
			// 현재 시간 기반으로 시드 설정
			long seed = System.currentTimeMillis();
			Random random = new Random(seed);
			int com = (int)(random.nextInt(3));
			System.out.print("사용자 = " + user + ", 컴퓨터 = " + str[com]);
			
			// 1. 비겼다
			if ((user.equals("가위") && str[com].equals("가위"))
				|| (user.equals("바위") && str[com].equals("바위"))
				|| (user.equals("보") && str[com].equals("보")))
				System.out.println(", 비겼습니다.");
			// 2. 사용자 win
			else if ( (user.equals("가위") && str[com].equals("보"))
				|| (user.equals("바위") && str[com].equals("가위"))
				|| (user.equals("보") && str[com].equals("주먹")))
				System.out.println(", 사용자가 이겼습니다.");			
			// 3. 컴퓨터 win
			else
				System.out.println(", 컴퓨터가 이겼습니다.");	
		}
		
		scanner.close();
	}
}
 