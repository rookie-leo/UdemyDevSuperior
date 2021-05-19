package heranca.application;

import heranca.entities.Account;
import heranca.entities.BusinessAccount;
import heranca.entities.SavingsAccount;

/*Aula UPCASTING  e DOWNCASTING*/
public class Program {

	public static void main(String[] args) {

		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

		/**
		 * UPCASTING 
		 * Casting da subclasse para superclasse
		 */
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Ana", 0.0, 0.01);
		
		/**
		 * DOWNCASTING 
		 * Casting da superclasse para subclasse
		 */
		BusinessAccount acc4 = (BusinessAccount) acc2;
		acc4.loan(200.0);
		
//		BusinessAccount acc5 = (BusinessAccount) acc3; // Gera um erro de compilacao
		
		// Testa se a variavel acc3 eh uma instancia de BusinessAccount
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount) acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		
		// Testa se a variavel acc3 eh uma instancia de SavingsAccount
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
		
	}
}
