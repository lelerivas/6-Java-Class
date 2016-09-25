package polymorphism;

public class StandardClient extends Accountholder{

	public StandardClient() {
		// TODO Auto-generated constructor stub
	}
	
	public StandardClient(Integer account, String name, Double balance) {
		super(account, name, balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Double CashoutLimit() {
		return getBalance()+3000;
	}
	
}
