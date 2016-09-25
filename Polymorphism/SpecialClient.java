package polymorphism;

public class SpecialClient extends Accountholder{
	
	public SpecialClient() {
		// TODO Auto-generated constructor stub
	}
	
	public SpecialClient(Integer account, String name, Double balance) {
		super(account, name, balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Double CashoutLimit() {
		return getBalance()+8000;
	}
	
	public Double Loan(){
		return 10000.;
	}
}
