public class Withdrawal extends Transaction {
    private double amount;
    private CashDispenser cashDispenser;
    
    public Withdrawal(int accountNumber, BankData bankData, 
            CashDispenser cashDispenser, double amount) {
        super(accountNumber, bankData);
        this.cashDispenser = cashDispenser;
        this.amount = amount;
    }
    
    @Override
    public void execute() {
        Account account = bankData.getAccount(accountNum);
        
        if (account.getBalance() < amount) {
            throw new RuntimeException("Insufficient funds");
        }
        
        if (!cashDispenser.isSufficientCashAvailable(amount)) {
            throw new RuntimeException("ATM out of cash");
        }
        
        account.debit(amount);
        cashDispenser.dispenseCash(amount);
    }
}