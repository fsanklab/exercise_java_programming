package ch03;
import java.util.Scanner;

public class Num_14 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		String course[] = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
		int score[] = {95, 88, 76, 62, 55};
		String inputCourse="";
		int index=-1;
		
		while (true) {
			System.out.print("과목 이름>>");
			inputCourse = scanner.next();
			if (inputCourse.equals("그만"))
				break;
			
			// course에서 맞는 인덱스 찾기
			for (int i=0;i<course.length;i++)
				if (course[i].equals(inputCourse)) {
					index = i;
					break;
				}
			if (index==-1)
				System.out.println("없는 과목입니다.");
			else
				System.out.println(course[index] + "의 점수는 " + score[index]);
		}
		
		scanner.close();
	}
}
 