import java.util.Scanner;

public class w3q4_even_sum {
    public static void main(String[] args) {
        System.out.println("Enter the number of even terms that is added (starting from 2)");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;
        for (int i = 2; i <= n * 2; i += 2) {
            sum += i;
        }
        System.out.println("The sum all even number form 2 to " + n + " is " + sum);
        sc.close();
    }
}
