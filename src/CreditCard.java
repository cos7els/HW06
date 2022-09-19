public class CreditCard {
    private String accountNumber;
    private double accountBalance;

    public CreditCard(String accountNumber, double accountBalance) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }

    public void toAccount(double amount) {
        this.accountBalance += amount;
    }

    public boolean fromAccount(double amount) {
        if (accountBalance >= amount) {
            accountBalance -= amount;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Credit card: account number = " + this.accountNumber + ", account balance = " + this.accountBalance + ".";
    }
}
