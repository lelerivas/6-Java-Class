package execution;

import persistence.IDataAccountholder;
import persistence.TxtData;
import persistence.XmlData;
import polymorphism.Accountholder;
import polymorphism.StandardClient;

public class PolymorphismExecution {

	public static void main(String[] args) {
		
		Accountholder ac1 = new StandardClient(1100, "Nat", 5400.);
		Accountholder ac2 = new StandardClient(1200, "Ana", 5400.);
		
		System.out.println("Name:"+ac1.getName());
		System.out.println("Cashout Limit: "+ac1.CashoutLimit());
		System.out.println();
		System.out.println("Name:"+ac2.getName());
		System.out.println("Cashout Limit: "+ac2.CashoutLimit());
		System.out.println();
		
		IDataAccountholder data;
		try{
			data = new TxtData();
			data.Access();
			data.Write(ac1);
			data.Close();
			System.out.println();
			System.out.println("Data has registered.");
		}catch(Exception e){
			System.out.println("Problem: "+e.getMessage());
		}
		
		try{
			data = new XmlData();
			data.Access();
			data.Write(ac2);
			data.Close();
			System.out.println("Data has registered.");
		}catch(Exception e){
			System.out.println("Problem: "+e.getMessage());
		}
	}
}
