
import java.util.Scanner;
// Issue-> Invalid AccNo, acc Type hone par bhi program proceed kr jaa raha hai
//Issue-> accType ka input accNo. ke baad lete hain to to input lene se pehle hi invalid account type show ho jaa raha hai. Means input dene se pehele hi cunstructoer call ho jaa raha hai (as far as i understand
//Issue-> Exception handling implement nahi hai

public class w6q3_BankAcc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name :");
        String name = sc.nextLine();

        System.out.print("Enter account type (saving/current)");
        String AcTyp = sc.nextLine();
        
        System.out.print("Enter account number: ");
        long AcNum = sc.nextLong();
        

        BankAccount ba = new BankAccount(name, AcNum, AcTyp);
        while (true) {

            System.out.println(
                    "\nWhat do you want to perform --\n1: To deposit\n2: To Wihdraw\n3: To see details\n0: Quit");
            int operation = sc.nextInt();
            if (operation == 0) {
                System.out.println("Thankyou! Visit agian");
                break;
            }
            switch (operation) {
                case 1:
                    System.out.print("Enter the amount to deposit: ");
                    double dAmnt = sc.nextDouble();
                    ba.deposit(dAmnt);
                    break;
                case 2:
                    System.out.print("Enter the amount to deposit: ");
                    double wAmnt = sc.nextDouble();
                    ba.withdraw(wAmnt);
                    break;
                case 3:
                    ba.display();
                    break;

                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
        sc.close();
    }
}

class BankAccount {

    String AccHolderName;
    long AccNo;
    String AccType;
    double balance;

    BankAccount(String name, long AcNo, String AcType) {
        this.AccHolderName = name;

        // checking if account type is saving or corrent not anything
        if (AcType.equalsIgnoreCase("saving")) {
            this.AccType = AcType;
        } else if (AcType.equalsIgnoreCase("current")) {
            this.AccType = AcType;
        } else {
            System.out.println("Invalid Account type");
        }
        // if (AcType == "saving" || AcType == "Saving" || AcType == "SAVING") {
        // this.AccType = AcType;
        // } else if (AcType == "current" || AcType == "Current" || AcType == "CURRENT")
        // {
        // this.AccType = AcType;
        // } else {
        // System.out.println("Invalid Account type");
        // }

        // checking if account number is valid
        if (AcNo > 1000000000L || AcNo < 9999999999999999L)
            this.AccNo = AcNo;
        else
            System.out.println("Invalid Account Number");

    }

    // depositing money to the account
    void deposit(double dAmnt) {
        this.balance += dAmnt;
        System.out.println("Money deposited sucessfully");

    }

    void withdraw(double wAmnt) {
        if (this.balance < wAmnt)
            System.out.println("You don't have sufficient money to withdraw");

        if (this.balance >= wAmnt) {
            this.balance -= wAmnt;
            System.out.println("Money withdrawn successfully");
        }

    }

    // displaying name and account balnce
    void display() {
        System.out.println("Name of account holder is: " + this.AccHolderName);
        System.out.println("Balance in your account is: " + this.balance);
    }
}
