// this file is dedicated to functions and methods

import java.util.*;

public class funcmeth {
    public static void printName(String name){
        System.out.println(name + " is king of the world you see");
    }
    public static int printSum(int a, int b){
        int sum = a+b;
        return sum;
    }
    public static int printMul(int x, int y){
        int mul = x*y;
        return mul;
    }
    public static int facto(int f){
        int fact = 1;
        for (int i = f; i>=1; i--){
            fact *= i;
        }
        return fact;
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Operation :\n 1 Name entrance to cool sentence \n 2 sum of two nums \n 3 mul of two nums \n 4 factorial of a number ");
        System.out.print("Choose option: ");
        int butt = sc.nextInt();
        switch (butt) {
            case 1:
                String name = sc.nextLine();
                printName(name);
                break;
            case 2:
                System.out.print("first num: ");
                int a = sc.nextInt();
                System.out.print("Second Num:");
                int b = sc.nextInt();
                // sum below by calling function within sum var
                int sum = printSum(a, b);
                System.out.println("Sum of two nums: " + sum);
                break;
            case 3:
                System.out.println("first num: ");
                int x = sc.nextInt();
                System.out.println("Second num: ");
                int y = sc.nextInt();
                // calculation you see
                int mul = printMul(x,y);
                System.out.println("Mul of two numbers: " + mul);
                break;
            case 4:
                System.out.println("Enter a num to find factorial: ");
                int f = sc.nextInt();
                int fact = facto(f);
                System.out.println("the factorial of " + f + " is " + fact);
                break;

        
            default:
                 main(args);
                break;
        }



        

        



        sc.close();
    }
}