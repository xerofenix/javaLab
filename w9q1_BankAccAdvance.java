public class w9q1_BankAccAdvance {

    public static void main(String[] args) {
        System.out.println("Hello world");
    }
}

abstract class Account {
    long accNo;
    String cusName;
    String accType;
    double balance;

    // displaying account balance| showing warning for min balance
    abstract void displayBalance();

    // withdrawing money from account
    void withdraw(double wAmnt) {
        if (this.balance < wAmnt) {
            System.out.println("Your current balance is low, can't withdraw");
        }

        if (this.balance >= wAmnt) {
            this.balance -= wAmnt;
            System.out.println("Money withdrawn successfully");
        }
    }

    // depositing money to account
    void deposit(double dAmnt) {
        this.balance += dAmnt;
        System.out.println("Money deposited successfully");
    }
}

class Curr_Acc extends Account {

    void displayBalance() {
        System.out.println("Your current balance is: " + this.balance);

        if (this.balance < 500) {
            System.out.println(
                    "Your account balance is very low (below 500), a charge will be imposed for not maintaing minimum balance");
        }
    }
}

class Sav_Acc extends Account {
    void displayBalance() {
        System.out.println("Your account balance is: " + this.balance);
    }
}