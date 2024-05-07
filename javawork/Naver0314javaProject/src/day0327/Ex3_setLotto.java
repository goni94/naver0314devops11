package day0327;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Ex3_setLotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Set<Integer> setLotto = new TreeSet<>();
		
		int count;
		
		while (true) {
			System.out.println("로또를 구입할 금액을 입력하세요");
			int money = sc.nextInt();
			// 0이면 종료
			
			if (0 == money) {
				System.out.println("종료");
				break;
			}
			if (money < 1000) {
				System.out.println("\t금액이 부족합니다");
				break;
			}
			
			for (int i=0; i<money/1000; i++) {
				
				// 6개의 중복되지 않은 로또 숫자 구하기(1~45)
				// 기존 값 모두 삭제후 다시 구하기
				
				setLotto.clear();
				
				while (true) {
					int n = (int)(Math.random()*45)+1;
					setLotto.add(n); // 랜덤숫자(n)을 setLotto 에 넣어준다
					if (setLotto.size()==6)
						break;
					
				}
				// 출력
				System.out.printf("%3d회 : ",i+1);
				for (int a:setLotto) {
					System.out.printf("%3d",a);
				}
				System.out.println();
					
			}
			
		}
	}

}
