import java.util.Scanner;

public class w7q4_Shapes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // taking user input length and breadth
        System.out.println("Enter the length and breadth of the rectangle");
        double l_r = sc.nextDouble();
        double b_r = sc.nextDouble();
        Rectangle r = new Rectangle();// making object of the rectangle class
        System.out.println("The perimeter of the rectangle " + r.perimeter(l_r, b_r));
        System.out.println("The area of the rectangle is " + r.area(l_r, b_r));

        System.out.println("Enter the side of the sqaure");
        double s_Sq = sc.nextDouble();
        Square s = new Square();// making object of the Square class

        System.out.println("The area of the Square " + s.area(s_Sq, s_Sq));
        System.out.println("The perimeter of the Square " + s.perimeter(s_Sq, s_Sq));
        sc.close();
    }
}

interface Shapes {
    double area(double a, double b);

    double perimeter(double a, double b);
}

class Rectangle implements Shapes {
    @Override
    public double area(double a, double b) {
        return a * b;
    }

    @Override
    public double perimeter(double a, double b) {
        return 2 * (a + b);
    }
}

class Square implements Shapes {
    @Override
    public double area(double a, double b) {
        return a * b;
    }

    @Override
    public double perimeter(double a, double b) {
        return 2 * (a + b);
    }
}