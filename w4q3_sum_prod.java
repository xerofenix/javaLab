import java.util.Scanner;

public class w4q3_sum_prod{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num1,num2,num3,num4;
        System.out.print("Enter four numbers:");
        num1 = sc.nextDouble();
        num2 = sc.nextDouble();
        num3 = sc.nextDouble();
        num4 = sc.nextDouble();

        System.out.println("The sum of all the numbers is: "+(num1+num2+num3+num4));
        System.out.print("The product of all the numbers is: "+(num1*num2*num3*num4));
    }
}