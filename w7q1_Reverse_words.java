import java.util.*;

public class w7q1_Reverse_words {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence");
        String sent = sc.nextLine();
        // System.out.println(sent);
        StringBuffer sb = new StringBuffer(sent);
        System.out.println(sb.reverse());
        sc.close();
    }
}