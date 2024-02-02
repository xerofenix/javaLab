import java.util.Scanner;

public class w3q1_count_odd_even {
    public static void main(String[] args) {
        int c_eve = 0;
        int c_odd = 0;

        System.out.println("Enter how many numbers you want to enter");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the numbers");
        float[] arr = new float[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextFloat();
            if (arr[i] % 2 == 0) {
                c_eve++;
            } else
                c_odd++;
        }

        System.out.println("There is/are " + c_eve + " even numbers");
        System.out.println("There is/are " + c_odd + " odd numbers");

        sc.close();
    }
}
