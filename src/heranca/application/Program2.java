package heranca.application;

import heranca.entities.Account;
import heranca.entities.BusinessAccount;
import heranca.entities.SavingsAccount;

/*Aula Sobreposicao, super e anotacao @Override*/
public class Program2 {

	public static void main(String[] args) {

		Account acc = new Account(1001, "Alex", 1000.0);
		Account sacc = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
		Account bacc = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
		
		acc.withdraw(200.0);
		System.out.println(acc.getBalance());
		
		sacc.withdraw(200.0);
		System.out.println(sacc.getBalance());
		
		bacc.withdraw(200.0);
		System.out.println(bacc.getBalance());

	}

}
