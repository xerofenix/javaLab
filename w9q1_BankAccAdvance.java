import java.util.*;

public class w9q1_BankAccAdvance {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("C: current account\nS: saving account");
        // String ch = sc.next().toLowerCase();
        char ch = sc.next().charAt(0);

        if (ch == 's' || ch == 'S') {

            savAcc sa = new savAcc();
            while (true) {

                System.out.println(
                        "\nWhat do tou want to perform\n1: Deposite    2:Withdrawl    3: View Balance    4: Compute Interest  0:Exit");
                int choiceSA = sc.nextInt();
                if (choiceSA == 0) {
                    System.out.println("Exiting");
                    break;
                }

                switch (choiceSA) {
                    case 1:
                        System.out.print("Enter the amount to deposite: ");
                        double dpAmnt = sc.nextDouble();
                        sa.deposit(dpAmnt);
                        break;
                    case 2:
                        System.out.print("Enter the amount to withdraw: ");
                        double wdAmnt = sc.nextDouble();
                        sa.withdraw(wdAmnt);
                        break;
                    case 3:
                        sa.displayBalance();
                        break;
                    case 4:
                        sa.compIntrst();
                    default:
                        System.out.println("Invalid Operation");
                        break;
                }
            }

        }
        if (ch == 'c' || ch == 'C') {

            currAcc ca = new currAcc();
            while (true) {

                System.out.println(
                        "\nWhat do tou want to perform\n1: Deposite   2:Withdrawl     3: View Balance   0:Exit");
                int choiceCA = sc.nextInt();
                if (choiceCA == 0) {
                    System.out.println("Exiting");
                    break;
                }

                switch (choiceCA) {
                    case 1:
                        System.out.print("Enter the amount to deposite: ");
                        double dpAmnt = sc.nextDouble();
                        ca.deposit(dpAmnt);
                        break;
                    case 2:
                        System.out.print("Enter the amount to withdraw: ");
                        double wdAmnt = sc.nextDouble();
                        ca.withdraw(wdAmnt);
                        break;
                    case 3:
                        ca.displayBalance();
                        break;
                    default:
                        System.out.println("Invalid Operation");
                        break;
                }

            }
        }
        if (ch != 'c' || ch != 'C' || ch != 's' || ch != 'S') {
            System.out.println("Invalid account type. Exiting");
        }

        sc.close();
    }
}

abstract class Account {
    // private long accNo;
    // private String cusName;
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
            System.out.println("Money withdrawn successfully " + wAmnt);
        }
    }

    // depositing money to account
    void deposit(double dAmnt) {
        this.balance += dAmnt;
        System.out.println("Money deposited successfully " + dAmnt);
    }
}

class currAcc extends Account {

    void displayBalance() {
        System.out.println("Your current balance is: " + this.balance);

        if (this.balance < 500) {
            System.out.println(
                    "Your account balance is very low (below 500), a charge will be imposed for not maintaing minimum balance");
        }
    }

    void withdraw(double wAmnt) {
        if (this.balance < wAmnt) {
            System.out.println("Your current balance is low, can't withdraw");
        }

        if (this.balance >= wAmnt) {
            this.balance -= wAmnt;
            System.out.println("Money withdrawn successfully " + wAmnt);
        }
    }
}

class savAcc extends Account {
    void displayBalance() {
        System.out.println("Your account balance is: " + this.balance);
    }

    void compIntrst() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter for how many years you want compund interest:");

        int yr = sc.nextInt();

        double ci = this.balance * (Math.pow((1 + (2.9 / 100)), yr) - 1);
        this.balance += ci;
        sc.close();
    }
}