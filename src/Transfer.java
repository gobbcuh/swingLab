public class Transfer extends Transaction {
    private int destinationAccountNumber;
    private double amount;
    
    public Transfer(int accountNumber, BankData bankDatabase, 
            int destinationAccountNumber, double amount) {
        super(accountNumber, bankDatabase);
        this.destinationAccountNumber = destinationAccountNumber;
        this.amount = amount;
    }
    
    @Override
    public void execute() {
        Account sourceAccount = bankData.getAccount(accountNum);
        Account destinationAccount = bankData.getAccount(destinationAccountNumber);
        
        if (destinationAccount == null) {
            throw new RuntimeException("Destination account not found");
        }
        
        if (sourceAccount.getBalance() < amount) {
            throw new RuntimeException("Insufficient funds");
        }
        
        sourceAccount.debit(amount);
        destinationAccount.credit(amount);
    }
}