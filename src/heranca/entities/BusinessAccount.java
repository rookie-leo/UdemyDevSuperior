package heranca.entities;

public class BusinessAccount extends Account{

	private Double loanLimit;
	
	public BusinessAccount() {
	}

	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	/*Metodo para fazer emprestimos*/
	public void loan(double amount) {
		if(amount <= loanLimit) {
			balance += amount - 10.0;
		}
	}
	
	/*Realiza o saque com desconto de 7*/
	@Override //Informa que o metodo eh uma sobreposicao do metodo da super classe
	public void withdraw(double amount) {
		super.withdraw(amount); //utiliza o metodo da super classe
		balance -= 2.0;
	}
}
