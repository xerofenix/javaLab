import java.util.Arrays;
import java.util.Scanner;

public class w7q3_Sort_Sen_lexicographically {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of string/words you want to enter: ");
        int numWords = sc.nextInt();
        String[] str = new String[numWords];

        for (int i = 0; i < str.length; i++) {
            System.out.println("Enter word " + (i + 1) + ": ");
            str[i] = sc.next();
        }
        Arrays.sort(str);
        System.out.println(Arrays.toString(str));

        //the above print-statement prints in string, we can print it in a sentence
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i]+" ");
        }

        sc.close();
    }
}