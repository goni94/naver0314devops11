package day0315;

import java.util.Scanner;

public class Ex12_Munje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 점수(score)를 입력받아
		 * 점수가 90 이상이면 "참 잘했어요!!"
		 * 		80 이상이면 "수고했어요!"
		 * 		70 이상이면 "조금 더 노력하세요!"
		 * 		그 나머지는 "재시험입니다!"
		 * 			메세지를 저장할 문자열 변수명 : msg
		 */
		
		Scanner sc = new Scanner(System.in);
		int score;
		String msg;
		System.out.println("점수 입력");
		score = sc.nextInt();
		
		msg = score >= 90? "참 잘했어요!!":score >= 80? "수고했어요!":
			  score >= 70? "조금 더 노력하세요!":"재시험입니다!";
			  
		System.out.println("score:"+msg);
		

	}

}
