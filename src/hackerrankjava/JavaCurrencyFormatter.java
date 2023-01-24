/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hackerrankjava;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author anhta
 */

/* -OUTPUT EXPECTED-
    US: $12,324.13
    India: Rs.12,324.13
    China: ￥12,324.13
    France: 12 324,13 €
 */
/*https://stackabuse.com/how-to-format-number-as-currency-string-in-java/*/
public class JavaCurrencyFormatter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = 12324.13;
        scanner.close();
        //Create a new locale
        Locale usLC = Locale.US;
        Locale indiaLC = new Locale("en", "IN");
        Locale chinaLC = Locale.CHINA;
        Locale franceLC = Locale.FRANCE;
        
        //Create a Currency instance for the Locale
//        Currency USCurrency = Currency.getInstance(usLC);
//        Currency ChinaCurrency = Currency.getInstance(chinaLC);
//        Currency FranceCurrency = Currency.getInstance(franceLC);
        
        //Create a formatter given the Locale
        NumberFormat USFormat = NumberFormat.getCurrencyInstance(usLC);
        NumberFormat IndiaFormat = NumberFormat.getCurrencyInstance(indiaLC);
        NumberFormat ChinaFormat = NumberFormat.getCurrencyInstance(chinaLC);
        NumberFormat FranceFormat = NumberFormat.getCurrencyInstance(franceLC);
//        System.out.println(USCurrency.getDisplayName() + ": " + USFormat.format(payment));
       
        String us = USFormat.format(payment);
        String india = IndiaFormat.format(payment);
        String china = ChinaFormat.format(payment);
        String france = FranceFormat.format(payment);
        
        //OUTPUT
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
