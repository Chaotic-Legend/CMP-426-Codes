// CMP 426: Operating Systems - Homework 0 - Isaac D. Hoyos

// The Account class represents a bank account and implements AccountInterface.
public class Account implements AccountInterface {
    private Person owner;
    private final double RATE = 0.0435;
    private double balance;
    private long acctNumber;

    // This constructor initializes the account with an owner, account number, and initial balance.
    public Account(Person owner, long acctNumber, double initialBalance) {
        this.owner = owner;
        this.acctNumber = acctNumber;
        this.balance = initialBalance;
    }

    // This method deposits the specified amount and returns the new balance.
    @Override
    public double deposit(double amount) {
        balance += amount;
        return balance;
    }

    // This method withdraws the specified amount and fee and returns the new balance.
    @Override
    public double withdraw(double amount, double fee) {
        balance -= (amount + fee);
        return balance;
    }

    // This method withdraws the specified amount and returns the new balance.
    @Override
    public double withdraw(double amount) {
        balance -= amount;
        return balance;
    }

    // This method adds interest to the balance and returns the new balance.
    @Override
    public double addInterest() {
        balance += balance * RATE;
        return balance;
    }

    // This method increases the balance by one and returns the new balance.
    @Override
    public double increment() {
        balance += 1;
        return balance;
    }

    // This method decreases the balance by one and returns the new balance.
    @Override
    public double decrement() {
        balance -= 1;
        return balance;
    }

    // This method returns the owner of the account.
    @Override
    public Person getOwner() {
        return owner;
    }

    // This method sets the owner of the account.
    public void setOwner(Person owner) {
        this.owner = owner;
    }

    // This method returns the account number.
    @Override
    public long getAcctNumber() {
        return acctNumber;
    }

    // This method sets the account number.
    public void setAcctNumber(long acctNumber) {
        this.acctNumber = acctNumber;
    }

    // This method returns the current balance.
    @Override
    public double getBalance() {
        return balance;
    }

    // This method sets the current balance.
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // This method returns the interest rate.
    public double getRate() {
        return RATE;
    }
}