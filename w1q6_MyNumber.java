/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author fenix
 */
public class w1q6_MyNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();

        double numRound = Math.round(num);
        System.out.println(numRound);

        double numCeil = Math.ceil(num);
        System.out.println(numCeil);

        double numFloor = Math.floor(num);
        System.out.println(numFloor);
    }
}
