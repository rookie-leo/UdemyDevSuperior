package heranca.entities;

public class SavingsAccount extends Account{

	private Double interestRate;
	
	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	/*Calcula a taxa de juros*/
	public void updateBalance() {
		balance += balance * interestRate;
	}
	
	/*Realiza saque na conta poupanca*/
	@Override //Informa que o metodo eh uma sobreposicao do metodo da super classe
	public void withdraw(double amount) {
		balance -= amount;
	}
}
