package day0318;

import java.util.Scanner;

public class Ex1_Munje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 점수(score)를 입력 후
		 * 점수가 90 이상이면 "A"
		 * 점수가 80 이상이면 "B"
		 * 점수가 70 이상이면 "C"
		 * 점수가 60 이상이면 "D"
		 * 나머지는 "F"를 출력
		 * 
		 * (조건연산자를 이용해서 구하기)
		 * 
		 * (예)
		 * 점수는?
		 * 89
		 * 
		 * 89점은 B학점 입니다
		 */
		
		Scanner sc = new Scanner(System.in);
		int score;
		String msg;
		System.out.println("점수?");
		score = sc.nextInt();
		
		// if문을 이용해서 점수를 잘못입력했을경우 메서드 종료를 하자
		if (score < 1 || score > 100) {
			System.out.println("잘못된 점수입니다");
			return; // main 메서드를 종료(곧 프로그램이 종료됨)
		}
		
		
		msg = score >= 90 ? "A" : score >= 80 ? "B" : score >= 70 ? "C" : score >= 60 ? "D" : "F";
		
		System.out.println(score+"점=>"+msg+"학점");
		
		
		
	}

}
