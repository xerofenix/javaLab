import java.util.Scanner;

public class w8q3_Vehicle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String inp;
        int flag = 0, check = 0;
        while (true) {
            System.out.println("Enter 1 for Light Motor Vehicle, 2 for Heavy Motor Vehicle, Q/q for exit");
            inp = sc.next();
            sc.nextLine();
            if (inp.equalsIgnoreCase("Q")) {
                break;
            }
            try {
                check = Integer.parseInt(inp);

            } catch (Exception e) {
                // TODO: handle exception
                System.out.println("Invalid input");
            }

            switch (check) {
                case 1:
                    System.out.print("Enter the company name: ");
                    String cmp_name_lmv = sc.nextLine();
                    System.out.print("Enter the price of the vehicle: ");
                    double price_lmv = sc.nextDouble();
                    System.out.print("Enter the mileage of the vehicle: ");
                    double milag = sc.nextDouble();
                    LightMotorVehicle lmv = new LightMotorVehicle(cmp_name_lmv, price_lmv, milag);
                    lmv.toShow();
                    break;
                case 2:
                    System.out.print("Enter the company name: ");
                    String cmp_name_hmv = sc.nextLine();
                    System.out.print("Enter the price of the vehicle: ");
                    double price_hmv = sc.nextDouble();
                    System.out.print("Enter the mileage of the vehicle: ");
                    double capc = sc.nextDouble();
                    LightMotorVehicle hmv = new LightMotorVehicle(cmp_name_hmv, price_hmv, capc);
                    hmv.toShow();
                    break;

                default:
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
    double mileage;

    LightMotorVehicle(String company, double price, double mileage) {
        super(company, price);
        this.mileage = mileage;
    }

    void toShow() {
        System.out.print("The company of the vehicle is " + this.company);
        System.out.print("The price of the vehicle is " + this.price);
        System.out.print("The mileage of the vehicle is " + this.mileage);
    }
}

class HeavyMotorVehicle extends Vehicle {
    double capacityInTons;

    HeavyMotorVehicle(String company, double price, double capacityInTons) {
        super(company, price);
        this.capacityInTons = capacityInTons;
    }

    void toShow() {
        System.out.print("The company of the vehicle is " + this.company);
        System.out.print("The price of the vehicle is " + this.price);
        System.out.print("The capacity of the vehicle is " + this.capacityInTons + " tons");
    }
}
