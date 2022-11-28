package SectionNr6.Lessons;

public class BankAccount {

    private int accountNumber;
    private int balance;
    private String customerName;
    private String email;
    private int phoneNumber;

    public BankAccount() {
        this(1234, 2, "Default name", "Default address",
                123456789);
        System.out.println("Empty constructor called");
    }

    public BankAccount(int accountNumber, int balance, String customerName, String email, int phoneNumber) {
        System.out.println("Account constructor with parameters called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public int getAccountNumber() {
        return this.accountNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    public int getBalance() {
        return this.balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public String getCustomerName() {
        return this.customerName;
    }

    public void setEmail(String email) {
        boolean validMail = email.contains("@");
        if (validMail) {
            this.email = email;
        } else {
            this.email = "unknown";
        }
    }
    public String getEmail() {
        return this.email;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public int getPhoneNumber() {
        return this.phoneNumber;
    }

    public void deposit(int depositFunds) {
        this.balance += depositFunds;
        System.out.println("Deposit of " + depositFunds + " made. New balance is " + this.balance);
    }
//    public int getDepositFunds() {
//        return this.depositFunds;
//    }
//
//    public int getWithdrawFunds() {
//        return this.withdrawFunds;
//    }
    public void withdrawal(int withdrawFunds) {
        if (this.balance - withdrawFunds < 0) {
            System.out.println("Only " + balance + " available. Withdrawal not processed");
        } else {
            balance -= withdrawFunds;
            System.out.println("Withdrawal of " + withdrawFunds + " processed. Remaining balance " + this.balance);
        }
    }
}
