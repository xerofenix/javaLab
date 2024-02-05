public class w3q5_2_Modi_Floyd {

    public static void main(String[] args) {
        
        int p = 0;
        int q = 1;
        for (int i = 0; i < 7; i++) {
            if (i % 2 == 0) {
                p = 0;
                q = 1;
            } else {
                p = 1;
                q = 0;
            }
            for (int j = 0; j <= i; j++) {
                if (j % 2 == 0) {
                    System.out.print(q+" ");
                } else {
                    System.out.print(p+" ");
                }

            }
            System.out.println("");
        }
    }

}
