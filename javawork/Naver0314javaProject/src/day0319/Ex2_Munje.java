package day0319;

public class Ex2_Munje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1 != 1
     	   2 ! =2
		   3 ! =6 
           4 ! =24...10까지 출력
		 */

		int num = 1;
		
		for (int i=1; i<=10; i++) {
			num*=i;
		
		System.out.println(i+"!"+num);
		
		}

	}

}
