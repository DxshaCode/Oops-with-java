
class BankAccount {
    private String accountHolder;
    private int accountNumber;
    private double balance;
  
    BankAccount(String holder, int number, double balance) {
        this.accountHolder = holder;
        this.accountNumber = number;
        if (balance >= 0) {
            this.balance = balance;
        } 
        else {
            this.balance = 0;
        }
    }
    public String getAccountHolder() {
        return accountHolder;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
  
    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("amount is deposited " + amount);
        } 
        else {
            System.out.println("invalid amount!");
        }
    }
    public void withdraw(double amount) {

        if (amount <= 0) {
            System.out.println("invalid amount!");
        }
        else if (amount > balance) {
            System.out.println("less balance");
        }
        else {
            balance = balance - amount;
            System.out.println("amount withdrawed succesfully" + amount);
        }
    }
}

public class Main {

    public static void main(String[] args) {
        BankAccount account = new BankAccount("diksha", 101, 5000);
        System.out.println("holder name"+ account.getAccountHolder());
        System.out.println("account Number: "+ account.getAccountNumber());
        System.out.println("prsent balance"+ account.getBalance());
        account.deposit(2000);
        account.deposit(-500);
        account.withdraw(1000);
        account.withdraw(-200);0
        account.withdraw(10000);
        System.out.println("updated balamnce"+ account.getBalance());
    }
}

