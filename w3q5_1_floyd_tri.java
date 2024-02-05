public class w3q5_1_floyd_tri {
    public static void main(String[] args) {
        int v = 1;

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(v + " ");
                v++;
            }
            System.out.println("");
        }
    }
}
