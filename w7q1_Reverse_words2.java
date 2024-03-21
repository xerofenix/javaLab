import java.util.Scanner;

public class w7q1_Reverse_words2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence");
        String sent = sc.nextLine();

        String words[] = sent.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            String reverseWord = reverseWord(word);
            result.append(reverseWord).append(" ");
        }
        System.out.println("\n" + "Output: ");
        System.out.println(result.toString().trim());

        sc.close();
    }

    public static String reverseWord(String word) {
        int start = 0;
        int end = word.length() - 1;
        char chars[] = word.toCharArray();

        while (start < end) {
            if (!Character.isLetter(chars[start])) {
                start++;
            } else if (!Character.isLetter(chars[end])) {
                end--;
            } else {
                char temp = chars[start];
                chars[start] = chars[end];
                chars[end] = temp;
                start++;
                end--;
            }
        }
        return new String(chars);
    }
}
