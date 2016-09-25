package polymorphism;

public abstract class Accountholder {
	private Integer account;
	private String name;
	private Double balance;
	
	public Accountholder() {
		// TODO Auto-generated constructor stub
	}
	
	public Accountholder(Integer account, String name, Double balance) {
		super();
		this.account = account;
		this.name = name;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Accountholder [account=" + account + ", name=" + name + ", balance=" + balance + "]";
	}

	public Integer getAccount() {
		return account;
	}

	public void setAccount(Integer account) {
		this.account = account;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}
	
	public abstract Double CashoutLimit();	
	
}
