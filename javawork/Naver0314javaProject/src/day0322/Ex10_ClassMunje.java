package day0322;

class Member //클래스 member
{
	//필드선언, 필드선언시 자동으로 초기화됨
	private String name; 
	private String hp;
	private String addr;
	
	//생성자
	Member()
	{
		
	}
	
	Member(String name)
	{
		this.name = name;
	}
	
	Member(String name,String hp)
	{
		this.name = name;
		this.hp = hp;
		
	}
	
	Member(String name,String hp,String addr)
	{
		this.name = name;
		this.addr = addr;
		this.hp = hp;
	}
	
	//setter
	//외부로부터 데이터를 전달받아 멤버변수에 저장. 매개변수만 있고, 리턴값은 없는 메서드로 정의.
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setHp(String hp)
	{
		this.hp = hp;
	}
	
	public void setAddr(String addr)
	{
		this.addr = addr;
	}
	
	//getter
	//내부의 멤버변수에 저장된 값을 외부로 리턴.
//    메개변수는 없고, 리턴값만 있는 메서드로 정의한다. 
//    메서드명은 주로 getXXX() 메서드 형식으로 지정
//    XXX은 해당 멤버변수의 변수명을 사용.
	
	public String getName()
	{
		return name;
	}
	
	public String getHp()
	{
		return hp;
	}
	
	public String getAddr()
	{
		return addr;
	}
	
}
public class Ex10_ClassMunje {

	public static void writeMember(Member m)
	{
//		System.out.println(m.getName()+","+m.getAddr()+","+m.getHp());
		System.out.println("** "+m.getName()+" 님의 정보 **");
		System.out.println("핸드폰 : "+m.getHp());
		System.out.println("주 소 : "+m.getAddr());
		System.out.println("=".repeat(30));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member m1=new Member();
		Member m2=new Member("이강인");
		Member m3=new Member("손흥민","010-2222-3333");
		Member m4=new Member("Candy","010-444-5555","제주도");
		
		System.out.println("** 멤버 명단 출력 **");
		writeMember(m1);
		writeMember(m2);
		writeMember(m3);
		writeMember(m4);
		
		System.out.println("** m1 멤버의 값 변경하기 **");
		m1.setName("이영자");
		m1.setHp("011-2323-6767");
		m1.setAddr("부산");
		
		writeMember(m1);
	}
}
