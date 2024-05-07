package day0325;

public class AbstractMethodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog2 dog = new Dog2();
		dog.sound();
		
		Cat2 cat = new Cat2();
		cat.sound();
		
		//매개변수의 다형성
		animalSound(new Dog2());
		animalSound(new Cat2());
		
	}
	public static void animalSound(Animal2 animal) {
		animal.sound();
	}

}
