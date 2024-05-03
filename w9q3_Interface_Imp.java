interface Car {
    void engineCapacity();

    void price();

    void modelYear();

    void company();

}

class Baleno implements Car {

    @Override
    public void company() {

        System.out.println("The company of the car is Maruti");
    }

    @Override
    public void engineCapacity() {

        System.out.println("The capacity of the engine is 1197cc");
    }

    @Override
    public void modelYear() {

        System.out.println("The model year of the car is 2024");
    }

    @Override
    public void price() {
        System.out.println("The price of the car is 16 Lac");

    }

}

public class w9q3_Interface_Imp {
    public static void main(String[] args) {
        Baleno bl = new Baleno();
        bl.company();
        bl.engineCapacity();
        bl.modelYear();
        bl.price();
    }
}
