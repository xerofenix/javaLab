import java.util.*;

class Box {
    double volume(double length, double breadth, double height) {
        double vl = length * breadth * height;
        return vl;
    }

    double volume(double side) {
        double vl = side * side * side;
        return vl;
    }
}

public class w9q6_Volumes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double l, b, h;
        System.out.println("Enter the length, breadth and height of the box");
        l = sc.nextInt();
        b = sc.nextInt();
        h = sc.nextInt();

        Box bx = new Box();
        double vol = bx.volume(l, b, h);
        System.out.println("The volume of the box is " + vol);
        sc.close();
    }
}
