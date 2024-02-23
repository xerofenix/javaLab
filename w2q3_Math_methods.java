import java.util.Scanner;

public class w2q3_Math_methods {
    public static void main(String[] args) {
        System.out.println("Enter two number");

        Scanner sc = new Scanner(System.in);
        float num = sc.nextFloat();
        float num2 = sc.nextFloat();

        System.out.println("Absolute " + Math.abs(num));
        System.out.println("Arc Cosine value " + Math.acos(num));
        System.out.println("adding by converting the value into int " + Math.addExact((int) num, (int) num2));
        System.out.println("return the arc sine value " + Math.asin(num));
        System.out.println("Arc tan value " + Math.atan(num2));
        System.out.println("Cube root of first value " + Math.cbrt(num));
//        System.out.println("Clampt the value" + Math.clamp(num2, 412, 786));
        System.out.println("Cosine value " + Math.cos(num));
        System.out.println("Cosine hyperbolic value value " + Math.cosh(num2));
//        System.out.println("Fused Multiply add " + Math.fma(num2, num, num2));
        System.out.println("Log value (base 'e') " + Math.log(num));
        System.out.println("log value base 10 " + Math.log10(num));
        System.out.println("maximum of both " + Math.max(num, num2));
        System.out.println("minimum of both " + Math.min(num, num2));
        System.out.println("multiply of both " + Math.multiplyExact(0, 0));
        System.out.println("give first number raised to power of second number " + Math.pow(num, num2));

        sc.close();
    }
}
