package ir.heydarii.lib;

import java.util.Scanner;

/*
This class is a test class to learn java's functionallities
 */
public class MyClass {


    //assigning a number
    static double P_NUMBER = 3.14;
    static String my = "hi";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        CalculatorClass cc = new CalculatorClass();
        int c = cc.sum(a, b);
        System.out.println("sum is : " + c);
        int d = cc.mul(a, b);
        System.out.println("mul is : " + d);

    }


    /**
     * this
     *
     * @param a to get the user's birthYear
     * @return user's name
     */
    public static String getName(int a) {
        String s = "Pouya";
        return s;
    }


    public static void checkString(String name) {
        if (name.equalsIgnoreCase("Pouya")) {
            System.out.print("its equal to Pouya");
        } else {
            System.out.print("its not equal to Pouya");
        }

    }


    public static void checkMail(String email) {
        if (email.contains("@")) {
            System.out.print("email address is fine");
        } else {
            System.out.print("wrong email address");
        }
    }


    //      { }     curly brace


    //      [       brace


    //      #       sharp


    //      /       slash


    //      \       back slash


    //      |       pipe line


    //      -       dash

    //      _       under line

    //      ( )     parantez

    //      &       ampersand

    //      *       star

    //      :       colon

    //      ;       semi - colon

    //      '       single quotation

    //      "       double quotation

    //      ,       comma

    //      $       dollar sign


}
