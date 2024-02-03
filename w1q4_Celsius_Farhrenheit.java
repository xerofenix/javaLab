/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author fenix
 */
public class w1q4_Celsius_Farhrenheit {

    public static void main(String[] args) {

        System.out.print("Enter temperature in fahrenheit: ");
        Scanner sc = new Scanner(System.in);
        double fah = sc.nextDouble();
        double cel = ((fah - 32) / 9) * 5;
        System.out.println("The temperature in Celcius is");

        System.out.println(cel + "\u00B0");
        sc.close();
    }
}
