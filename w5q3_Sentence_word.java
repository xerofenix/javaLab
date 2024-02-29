
import java.util.Scanner;
import java.util.*;

public class w5q3_Sentence_word {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence or string");
        String str = sc.next();
        sc.next();
        String delim = " ";

        // making an object of StringTockenizer class
        StringTokenizer tokenizer = new StringTokenizer(str, delim);

        int cntWord = 0;
        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
            cntWord++;
        }
        System.out.println(cntWord);
        sc.close();
    }
}
