package day0325;

class Phone2
{
	private String medel;
	private String color;
	
	public Phone2(String medel, String color) {
		super();
		this.medel = medel;
		this.color = color;
	}

	public String getMedel() {
		return medel;
	}

	public void setMedel(String medel) {
		this.medel = medel;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}

class SmartPhone2 extends Phone2
{
	private String wifi;

	/**
	 * @param medel
	 * @param color
	 * @param wifi
	 */
	public SmartPhone2(String medel, String color, String wifi) {
		super(medel, color);
		this.wifi = wifi;
	}
	
	public void info()
	{
		System.out.println("모델명 : "+this.getMedel());
		System.out.println("색상 : "+this.getColor());
		System.out.println("와이파이 : "+wifi);
		System.out.println();
	}
}

public class Ex8_Inheri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone2 s1 = new SmartPhone2("갤럭시", "은색", "KT");
		s1.info();
		
		SmartPhone2 s2 = new SmartPhone2("아이폰14", "핑크색", "SK");
		s2.info();

	}

}





