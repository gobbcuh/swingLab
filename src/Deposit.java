public class Deposit extends Transaction {
    private double amount;
    
    public Deposit(int accountNumber, BankData bankDatabase, double amount) {
        super(accountNumber, bankDatabase);
        this.amount = amount;
    }
    
    @Override
    public void execute() {
        bankData.getAccount(accountNum).credit(amount);
    }
}