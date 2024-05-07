package Test1;

public class BankAccount {
	protected String number;
	protected String password;
	protected String name;
	protected long balance; //잔액
	
	public BankAccount() {
	
	}
	
	public BankAccount(String number, String password, String name, long balance) {
		
		this.name = name; // name을 자신의 name 변수에 대입한다
		this.password = password;
		this.number = number;
		this.balance = balance;
	}
	
	public void deposit(long inputAccount) {
		if(inputAccount <= 0) {
			System.out.println("0이하의 금액을 입금할 수 없습니다.");
		}else {
			this.balance += inputAccount;
			System.out.println(inputAccount+"원이 입금되었습니다.");
		}
	}
	
	public void withdraw(long outputAccount) {
		if(outputAccount <= 0) {
		System.out.println("0이하의 금액은 출금할 수 없습니다.");
		}
		else if(balance < outputAccount)
		{
			System.out.println("잔액이 부족합니다.");
		}else {
			this.balance -= outputAccount;
			System.out.println(outputAccount+"원이 출금되었습니다.");
		}
	}

//	public long getBalance() {
//		return balance;
//	}

	public void printAccount() {
		System.out.println("(일반) 계좌번호:" +number);
		System.out.println("비밀번호:" +password);
		System.out.println("예금주:" +name);
		System.out.println("계좌잔액:" +balance+"원");
	}
		

}
