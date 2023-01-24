/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hackerrankjava;

import java.util.Scanner;

/**
 *
 * @author anhta
 */
public class demo1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {

            try {
                long x = sc.nextLong();
                System.out.println(x + " can be fitted in:");
                if (x <= Byte.MAX_VALUE && x >= Byte.MIN_VALUE) {
                    System.out.println("* byte");
                }
                if (x <= Short.MAX_VALUE && x >= Short.MIN_VALUE) {
                    System.out.println("* short");
                }
                if (x <= Integer.MAX_VALUE && x >= Integer.MIN_VALUE) {
                    System.out.println("* int");
                }
                if (x <= Long.MAX_VALUE && x >= Long.MIN_VALUE) {
                    System.out.println("* long");
                }
                //Complete the code
            } catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }
        }
    }
}
