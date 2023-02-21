public class BankAccount {

    private double balance;
    private double minimumBalance;
    public boolean isActive = true;
    private String holderName;

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public BankAccount(double balance, double minimumBalance) {
        this.balance = balance;
        this.minimumBalance = minimumBalance;
    }

    public double getBalance() {
        return balance;
    }

    public double getMinimumBalance() {
        return minimumBalance;
    }

    public double withdraw(double ammount) {
        if (balance - ammount > minimumBalance) {
            balance -= ammount;
            return ammount;
        } else {
            throw new RuntimeException();
        }
    }

    public double deposit(double amount) {
//        try {
//            Thread.sleep(1);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        return balance += amount;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
