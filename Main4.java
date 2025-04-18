class BankAccount {
    protected double balance;
    BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: ₹" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: ₹" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }
   
    // Method to display balance
    void displayBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }
   }
   
   //Subclass
   class SavingsAccount extends BankAccount {
   
    SavingsAccount(double initialBalance) {
        super(initialBalance);
    }
    void withdraw(double amount) {
        if (amount > 0 && (balance - amount) >= 100) {
            balance -= amount;
            System.out.println("Withdrew: ₹" + amount);
        } else {
            System.out.println("Withdrawal denied. Balance cannot fall below ₹100.");
        }
    }
   }
   public class Main4 {
    public static void main(String[] args) {
        SavingsAccount myAccount = new SavingsAccount(500);
        myAccount.displayBalance();        
        myAccount.withdraw(200);            
        myAccount.displayBalance();         
        myAccount.withdraw(250);            
        myAccount.displayBalance();         
        myAccount.deposit(100);             
        myAccount.displayBalance();         
    }
   }
