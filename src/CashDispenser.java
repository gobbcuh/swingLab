public class CashDispenser {
    private final static int INITIAL_COUNT = 500;
    private int count;
    
    public CashDispenser() {
        count = INITIAL_COUNT;
    }
    
    public void dispenseCash(double amount) {
        int billsRequired = (int) (amount / 20);
        count = count - billsRequired;
    }
    
    public boolean isSufficientCashAvailable(double amount) {
        int billsRequired = (int) (amount / 20);
        return count >= billsRequired;
    }
}