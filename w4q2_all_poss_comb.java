import java.util.*;

public class w4q2_all_poss_comb {
    public static void main(String[] args) {
        int i, j, k;
        System.out.println("Enter 3 digit(s): ");
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if ((a | b | c) > 9) {
            System.out.println("Invalid! input.You didn't enter digit");
            sc.close();
            return;
        }
        int d[] = { a, b, c };
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                for (k = 0; k < 3; k++) {
                    if (i != j && j != k && k != i)
                        System.out.println(d[i] + " " + d[j] + " " + d[k]);
                }
            }
        }
        sc.close();
    }
}
