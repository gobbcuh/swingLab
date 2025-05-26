public class BalanceInquiry extends Transaction {
    public BalanceInquiry(int accountNumber, BankData bankDatabase) {
        super(accountNumber, bankDatabase);
    }
    
    @Override
    public void execute() {
    }
    
    public double getAvailableBalance() {
        return bankData.getAccount(accountNum).getBalance();
    }
    
    public double getTotalBalance() {
        return bankData.getAccount(accountNum).getTotalBalance();
    }
}