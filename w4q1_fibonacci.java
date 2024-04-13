import java.util.Scanner;

public class w4q1_fibonacci {
    public static void main(String[] args) {
        int a = 0, b = 1, nxt = 0, i = 0, m;
        Scanner sc = new Scanner(System.in);

        // System.out.println("Enter the number upto which you want the fibonacci series");
        System.out.println("Enter the number of terms you want the fibonacci series");
        m = sc.nextInt();

        do {
            if (i == 0)
                System.out.print(a + ",");

            if (i == 1)
                System.out.print(b + ",");

            nxt = a + b;
            a = b;
            b = nxt;
            System.out.print(nxt + ",");
            i++;
        } while (i < (m-2));

        sc.close();
    }
}
