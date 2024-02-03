/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author fenix
 */
public class w2q1_sum_diff_prod_min_max {

    public static void main(String[] args) {
        System.out.println("Enter two numbers");
        Scanner sc = new Scanner(System.in);
        float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();

        System.out.println("Sum of two numbers: " + (num1 + num2));
        System.out.println("Difference of two numbers: " + (num1 - num2));
        System.out.println("Product of two numbers: " + (num1 * num2));
        System.out.println("Quotient of two numbers: " + (num1 / num2));

        if (num1 > num2) {
            System.out.println(num1 + " is maximun");
            System.out.println(num2 + " is minimum");
        } else {
            System.out.println(num2 + " is maximum");
            System.out.println(num1 + " is minimum");
        }

        sc.close();
    }
}
