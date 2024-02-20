import java.util.Scanner;

public class w5q1_TestOddAndEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        OddAndEven oe = new OddAndEven();

        System.out.println("Enter number to test ODD and Even, Q to quit");

        // char num = 's';
        String c = sc.next();
        while (c != "q" || c != "Q") {
            c = sc.next();
            int num = (int) c;
            oe.addNumber(num);
        }
        oe.tostring();// output

        sc.close();
    }

}

/**
 * OddAndEven
 */
class OddAndEven {

    int countOfOdd;
    int countOfEven;

    int addNumber(int no) {
        if (no % 2 == 0) {
            return countOfEven++;
        }
        if (no % 2 != 0) {
            return countOfOdd++;
        }
        return 0;
    }

    void tostring() {
        System.out.println("Number of odd: " + countOfOdd);
        System.out.println("Number of even: " + countOfEven);
    }
}
/*
 * class TestOddAndEven {
 * OddAndEven OddAndEven;
 * 
 * int num ;
 * 
 * while(num!="Q")
 * {
 * num = sc.nextInt();
 * addNumber(num);
 * 
 * }
 * 
 * }
 */
