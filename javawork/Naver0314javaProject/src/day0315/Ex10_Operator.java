package day0315;

public class Ex10_Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 증감연산자
		// 전치일경우는 1순위, 후치일경우는 끝순위
		
		int m = 5, n = 5;
		int a = 10,b = 10;
		// 단 단항일경우는 상관없음
		m++;
		++n;
		System.out.println("m="+m);
		System.out.println("n="+n);
		
		a+=m++; // a= a+m, m=m+1; // 후치는 제일 마지막에 계산한다
		System.out.println("a="+a); // 16
		System.out.println("m="+m); // 7
		
		b+=++n; // n=n+1,b=b+n, 먼저 증가후 a에 더해진다
		System.out.println("b="+b); // 17
		System.out.println("n="+n); // 7
		
		m = 5;
		System.out.println(m++); // 먼저 출력후 증가,5
		
		n = 5;
		System.out.println(++n); // 먼저 증가후 출력,6
		
		System.out.println("m="+m+",n="+n); // 6,6
		
		
	}

}
