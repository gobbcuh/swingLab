import java.util.Map;

public class BankData {
    private Map<Integer, Account> accounts;

    public BankData() {
        accounts = new java.util.HashMap<>();
        accounts.put(123456, new Account(123456, 1234, 1000.0, 1000.0));
        accounts.put(654321, new Account(654321, 4321, 2000.0, 2000.0));
    }

    public boolean authenticateUser(int accountNum, int pin) {
        Account account = accounts.get(accountNum);
        if (account != null) {
            return account.validatePin(pin);
        }
        return false;
    }

    public Account getAccount(int accountNum) {
        return accounts.get(accountNum);
    }

    public void addAccount(int accountNum, int pin, double balance) {
        accounts.put(accountNum, new Account(accountNum, pin, balance, balance));
    }
}
