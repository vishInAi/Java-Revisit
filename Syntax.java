// package com.example; // package it is 

import java.util.*; // import statement

public class Syntax{  // Class Declaration
    public static void main(String[] args) {     // Main Method
        // Scanner Creation dont sweat it its easy just needs the above import

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Hello From Java!");    // Executable Code

        System.out.println("Haggu is King\nHaggu is King\nHaggu is king");

        // some adv pattern without loops

        System.out.println("*");
        System.out.println("* *");
        System.out.println("* * *");
        System.out.println("* * * *");
        System.out.println("* * * * *");

        // usign \n

        System.out.println("*\n**\n***\n****\n*****");

        // variable declaration

        int a = sc.nextInt();
        int b = sc.nextInt();
        int perimeter = 2*(a+b);

        System.out.println("The Perimeter is : " + perimeter);

        // data types
        // in java we have to define first had what variable is of what datatype
        // Two types of data Types
        
        // Primitive Data Types :
        // int - 4, double - 8, byte - 1, short - , char - 2, boolean - 1, long - 8, float - 4

        int c = 10;
        int d = 25;
        int sum = c+d;
        System.out.println(sum);
        float e = 9.24f;
        float f = 4.65f;
        float diff = e-f;
        System.out.println(diff);

        double mul = c*d;
        System.out.println(mul);






        // Non Primitive Data-Type :
        // String, Array, Class, Object, Interface











        sc.close(); // good practice to close the scanner you know

    }
}
