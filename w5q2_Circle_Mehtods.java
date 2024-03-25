
import java.util.Scanner;
import java.lang.Math;

public class w5q2_Circle_Mehtods {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r, c_x, c_y, x, y;

        while (true) {
            System.out.println("Enter radius and co-ordinate of center of the circle");
            r = sc.nextDouble();
            // continue to take value unless user give negative value of radius
            if (r < 0) {
                System.out.println("Finished! you enterd radius a negative number");
                break;
            }
            c_x = sc.nextDouble();
            c_y = sc.nextDouble();

            Circle cr = new Circle(r, c_x, c_y);

            double ar = cr.areaCircle(cr.rad);
            System.out.println("The area of the circle is: " + ar);

            double pr = cr.periCircle(cr.rad);
            System.out.println("The perimeter of the circle is: " + pr);

            // taking co-ordinates
            System.out.println("Enter co-ordinate to check if this lies inside the circle or not");
            x = sc.nextDouble();
            y = sc.nextDouble();

            // checking the co-ordinate if it lies inside, on or outside the circle
            double ck = cr.checkPoint(x, y);
            if (ck == cr.rad) {
                System.out.println("The given co-ordinate lies on the circumference of the circle");
            } else if (ck > cr.rad) {
                System.out.println("The given co-ordinate doesn't lie inside the circle");
            } else if (ck < cr.rad) {
                System.out.println("The given co-ordinate lies inside the circle");

            }
        }


        sc.close();
    }
}

/**
 * Circle
 */
class Circle {

    double rad;
    double x, y;

    Circle(double rad, double x, double y) {
        this.rad = rad;
        this.x = x;
        this.y = y;
    }

    double areaCircle(double rad) {
        double area = (22.0 / 7.0) * rad * rad;
        return area;
    }

    double periCircle(double r) {
        double peri = 2 * (22.0 / 7.0) * r;
        return peri;
    }

    double checkPoint(double x, double y) {
        double dist = Math.sqrt(Math.pow((this.x - x), 2) + Math.pow((this.y - y), 2));
        // System.out.println(dist);

        return dist;
    }

}
