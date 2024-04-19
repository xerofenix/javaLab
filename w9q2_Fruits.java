class Fruit {
    String fruitName;
    boolean isBunch = false;
    boolean isSingle = false;

    Fruit(String name, boolean bunch) {
        this.fruitName = name;
        this.isBunch = bunch;
        if (bunch) {
            this.isSingle = false;
        }
        if (!bunch) {
            this.isSingle = true;
        }
    }

    Fruit() {
    }

    void displayFruit() {
        System.out.println("The name of the fruit is: " + this.fruitName);
        if (isBunch && !isSingle) {
            System.out.println("The fruit is bunch fruit");
        }

        if (!isBunch && isSingle) {
            System.out.println("The fruit is single");
        }
    }
}

public class w9q2_Fruits {
    public static void main(String[] args) {
        Fruit f1 = new Fruit("grapes", true);
        f1.displayFruit();

        Fruit f2 = new Fruit("Apple", false);
        f2.displayFruit();
    }
}
