package day0321;

import java.util.Scanner;

public class Book199_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr[] = {};
		int score,su;
		int choice;
		int max = 0;
		while(true)
		{
			boolean exit = false;
			System.out.println("=".repeat(50));
			System.out.println("1.학생수 2.점수입력 3.점수리스트 4.분석 5.종료");
			System.out.println("=".repeat(50));
			System.out.println("선택");
			choice = sc.nextInt();

			switch(choice) {
			case 1:
				System.out.println("학생수");
				su = sc.nextInt();
				arr = new int[su];
				break;
			case 2:
				for(int i=0; i<arr.length; i++) {
					System.out.println("scores["+i+"]");
					score = sc.nextInt();
					arr[i] = score;
					max = arr[0];
				}
				break;
			case 3:
				for(int i=0; i<arr.length; i++) {
					System.out.println("scores["+i+"]"+arr[i]);

				}
				break;

			case 4:
				for(int i=1; i<arr.length; i++) {
					if(max < arr[i]) {
						max = arr[i];

					}
				}
				int sum = 0;
				for(int i=0; i<arr.length; i++) {
					sum = sum + arr[i];
				}
				double avg = sum / arr.length;
				System.out.println("최고 점수 :"+max);
				System.out.println("평균 점수 :"+avg);
				break;

			case 5:
				System.out.println("프로그램 종료");
				exit = true;
				break;
			}
			if(exit == true) {
				break;
			}
		}

	}
}