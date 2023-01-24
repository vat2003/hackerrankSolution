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
/*
        In computing, End OF File
        (commonly abbreviated EOF) is a condition in a computer operating system 
        where no moer data can be read from a data source
*/

public class Solution_EOF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lineNum = 0;
        while(sc.hasNext()){
            lineNum++;
            System.out.println(lineNum + " " + sc.nextLine());
        }
    }
}
