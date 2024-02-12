import java.util.Scanner;

public class w4q4_print_separate {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 4 digit number");
        int num = sc.nextInt();
        if (num < 1000 || num > 9999) {
            System.out.println("Invalid number!, Enter 4 digit number");
            sc.close();
            return;
        }
        int[] digit = new int[4];
        // int[] digit2 = new int[4];
        // int iterate = 0;
        // while (num == 0) {
        // digit2[iterate] = num % 10;
        // num = num / 10;
        // iterate++;
        // }

        // this is four digit number so i can iterate for lopp upto 4 but if it is not
        // known then while loop will be used
        
        // taking each digits in the array
        for (int i = 0; i < 4; i++) {
            digit[i] = num % 10;
            num = num / 10;
        }

        // for printing the digits strored in the array
        for (int i = 3; i >= 0; i--) {
            System.out.println(digit[i]);
        }
        sc.close();
    }
}
