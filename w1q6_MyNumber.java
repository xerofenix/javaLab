/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author CSD
 */
public class w1q6_MyNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();

        double numRound = Math.round(num);
        System.out.println(numRound);
    }
}
