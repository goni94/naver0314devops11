package day0322;

class Apple
{
	String msg = "Happy Day!!";	//인스턴스 멤버변수
	static String message = "오늘은 금요일"; //static 멤버변수(클래스 멤버변수)
}

class Banana{
	static int kor = 100;
	static int eng = 80;
	String name = "마이클";
}
public class Ex1_Object {
	//멤버 변수들
	String name = "홍길동"; //인스턴스 변수
	final static int MAX = 100; //static 변수, final: 상수 지정, 값 변경이 안됨

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * static 멤버 메서드는 static 멤버 변수나 멤버 메서드만
		 * 접근이 가능하다
		 * 일반 인스턴스 메서드나 변수를 접근하기 위해서는 new로 생성후
		 * 그 변수를 이용해서 호출해야만 한다
		 */
		
//		System.out.println(name); //오류 발생
		System.out.println(Ex1_Object.MAX); //static 변수는 클래스명.변수명
		System.out.println(MAX); //같은 클래스일 경우는 앞에 클래스명은 생략이 가능하다
		
		
		//name을 출력하려면 new 생성한 인스턴스 변수가 필요하다
		Ex1_Object ex = new Ex1_Object(); //Ex1_Object 자료형을 변수명 ex로 선언 Ex1_Object 클래스를 할당
		//ex가 인스턴스 변수이다. 이 변수를 이용해야만 name 이 접근이 가능하다
		System.out.println(ex.name); //Ex1_Object 인스턴스 변수 홍길동을 출력
		
		
		//Apple이 가진 2개의 멤버변수를 출력해보세요
		Apple ex1 = new Apple(); //Apple 자료형을 변수명 ex1으로 선언 Apple 클래스를 할당
		System.out.println(ex1.msg); //Apple 클래스에서 Happy Day 출력
		System.out.println(Apple.message);
		
		//Banana 클래스의 kor,eng 점수 출력하고 합계도 출력
		//Banana 클래스의 name 도 출력해보세요
		Banana ex2 = new Banana(); //Banana 자료형을 변수명 ex2로 선언
		System.out.println(ex2.name); //마이클 출력
		System.out.println(Banana.eng); //80 출력
		System.out.println(Banana.kor); //100 출력
		int sum = Banana.kor + Banana.eng; // sum을 선언할때 변수명앞에 Banana. 붙여줘야함
		System.out.println(sum);

	}

}
