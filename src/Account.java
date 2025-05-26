import javax.swing.JOptionPane;

public class Account {
    private int accountNum;
    private int pin;
    private double balance;
    private double totalBalance;

    public Account(int accountNum, int pin, double balance, double totalBalance) {
        this.accountNum = accountNum;
        this.pin = pin;
        this.balance = balance;
        this.totalBalance = balance;
    }

    public boolean validatePin(int pin) {
        return this.pin == pin;
    }

    public double getBalance() {
        return balance;
    }

    public double getTotalBalance() {
        return totalBalance;
    }

    public void credit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            totalBalance = totalBalance + amount;
        } 
        else {
            JOptionPane.showMessageDialog(null, "Invalid amount to credit.");
        }
    }

    public void debit(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            totalBalance = totalBalance - amount;
        } 
        else {
            JOptionPane.showMessageDialog(null, "Invalid amount to debit or insufficient funds.");
        }
    }

    public int getAccountNum() {
        return accountNum;
    }

    public void changePin(int newPin) {
        if (String.valueOf(newPin).length() == 4) {
            this.pin = newPin;
        } else {
            JOptionPane.showMessageDialog(null, "PIN must be 4 digits.");
        }
    }
}
