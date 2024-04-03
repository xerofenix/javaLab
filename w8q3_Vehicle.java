import java.util.Scanner;

public class w8q3_Vehicle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String in;
        while (true) {
            System.out.println("Enter 1 for Light Motor Vehicle, 2 for Heavy Motor Vehicle, Q/q for exit");
            in = sc.next();
            int check = Integer.parseInt(in);
            if (in.equalsIgnoreCase("Q")) {
                break;
            }

        }
        System.out.println("Quitted");
        sc.close();
    }
}

class Vehicle {
    String company;
    double price;

    Vehicle(String company, double price) {
        this.company = company;
        this.price = price;
    }
}

class LightMotorVehicle extends Vehicle {
    String mileage;

    LightMotorVehicle(String company, double price, String mileage) {
        super(company, price);
        this.mileage = mileage;
    }
}

class HeavyMotorVehicle extends Vehicle {
    double capacityInTons;

    HeavyMotorVehicle(String company, double price, double capacityInTons) {
        super(company, price);
        this.capacityInTons = capacityInTons;
    }
}
