package Test1;

public class MinusAccount extends BankAccount {
	long minus;
	
	public MinusAccount() {
		
	}
	
	public MinusAccount(String number, String password, String name, long balance, long minus) {
		super(number,password,name,balance);
		this.minus = minus;
	}
	
	@Override
	public void withdraw(long outputAccount) {
		if(outputAccount <= 0) {
			System.out.println("0이하의 금액은 출금할 수 없습니다.");
		}else if(balance < outputAccount){
			System.out.println("잔액이 부족합니다.");
		}else if(balance + minus < outputAccount){
			System.out.println("한도초과로 출력되지 않습니다.");
		}
	}
	
	@Override
	public void deposit(long inputAccount) {
		
	}
	
	@Override
	public void printAccount() {
		System.out.println("(마이너스) 계좌번호:" +number);
		System.out.println("비밀번호:" +password);
		System.out.println("예금주:" +name);
		System.out.println("계좌잔액:" +balance+"원");
	}
}
