package day0326;

interface StudyInter
{
	public void javaStudy();
	public void springStudy();
}

interface PlayInter
{
	public void run();
	public void game();
}

class MyStudy implements StudyInter
{
	@Override
	public void javaStudy() {
		// TODO Auto-generated method stub
		System.out.println("1");
	}
	
	@Override
	public void springStudy() {
		// TODO Auto-generated method stub
		System.out.println("2");
	}
	
	public void penStudy() {
		System.out.println("3");
	}
	
}

class MyPlay implements PlayInter
{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("4");
	}
	
	@Override
	public void game() {
		// TODO Auto-generated method stub
		System.out.println("5");
	}
	
	public void ball()
	{
		System.out.println("6");
	}
}

public class Ex7_Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudyInter c = new MyStudy();
		PlayInter d = new MyPlay();
		c.javaStudy();
		c.springStudy();
		d.run();
		d.game();
		((MyStudy)c).penStudy();
		
		((MyPlay)d).ball();
	}

}
