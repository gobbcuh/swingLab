public abstract class Transaction {
    protected int accountNum;
    protected BankData bankData;

    public Transaction(int accountNum, BankData bankData) {
        this.accountNum = accountNum;
        this.bankData = bankData;
    }

    public abstract void execute();
}