import java.util.Scanner;

public class w5q4_Sales_n_Commision {
    public static void main(String[] args) {
        double com_val = 0.0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the sale: ");
        double s = sc.nextDouble();

        if (s < 0.0) {
            System.out.println("Invalid Input!");
        } else {
            Commission c = new Commission(s);
            com_val = c.commission(s);
            System.out.println("Your commision is:" + com_val);
        }
        sc.close();
    }
}

/**
 * Commission
 */
class Commission {
    double sale;

    Commission(double s) {
        this.sale = s;
    }

    double commission(double sale) {
        // this.sale = sale;
        if (this.sale < 500.0) {
            double under_500 = this.sale * 0.02;
            return under_500;
        }
        if ((this.sale >= 500.0) && (this.sale < 5000.0)) {
            double btwn500_5k = this.sale * 0.05;
            return btwn500_5k;
        }
        if (this.sale >= 5000.0) {
            double above5k = this.sale * 0.08;
            return above5k;
        }
        return 0;
    }
}
