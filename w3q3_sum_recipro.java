public class w3q3_sum_recipro {
    public static void main(String[] args) {
        double sum = 0.0;
        for (int i = 1; i < 11; i++) {
            sum = sum + (1.0 / i);
        }
        System.out.println(sum);
    }
}
