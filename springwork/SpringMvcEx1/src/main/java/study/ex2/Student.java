package study.ex2;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor //final 이나 NonNull 이 붙은 멤버변수만 생성자 주입
@Setter
public class Student {
	private String schoolName;
	@NonNull	//final을 주거나 @NonNull을 준다
	MyInfo myInfo;
	
	//MyInfo 정보는 생성자 주입
//	public Student(MyInfo info) {
//		// TODO Auto-generated constructor stub
//		myInfo=info;
//	}
//	
//	//학교명은 setter 주입
//	public void setSchoolName(String schoolName) {
//		this.schoolName = schoolName;
//	}
	
	public void show()
	{
		System.out.println(myInfo);//toString 호출
		System.out.println("학교명 : "+schoolName);
	}
}





































