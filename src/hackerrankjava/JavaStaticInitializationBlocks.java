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
public class JavaStaticInitializationBlocks {

    static Scanner sc = new Scanner(System.in);
    static int B = sc.nextInt();
    static int H = sc.nextInt();
    static boolean flag = B > 0 && H > 0;

    static {
        if(!flag){
            System.out.print("java.lang.Exception: Breadth and height must be positive");
        }
    }
    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.println(area);
        }
    }
}
//System.out.print("java.lang.Exception: Breadth and height must be positive");
