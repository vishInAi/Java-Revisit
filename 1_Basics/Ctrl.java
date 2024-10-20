import java.util.*;

public class Ctrl{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first value : ");
        int a = sc.nextInt();
        System.out.println("Enter second value : ");
        int b = sc.nextInt();

        if(a == b) {
            System.out.println("It is what it is");
        } else {
            System.out.println("You Smooth Nigga!");
        }

        if(a % 2 == 0) // yeah it works without the curly braces too 
            System.out.println("a is even yk");

        // we are trying the switch and if else and seeing the diff 
        // know that switch has less syntax and i like less syntax you should too haha

        System.out.println("\n... if else imitating switch ...\n");

        System.out.println("\n1. Bike \n2. Car \n3. Bus \n4. Monorail \n choose or you'll walk dawg.\n");

        int button = sc.nextInt();

        if (button == 1) {
            System.out.println("get a bike");
        } else if (button == 2) {
            System.out.println("get a car");
        } else if (button == 3) {
            System.out.println("Use Bus Transport");
        } else if (button == 4) {
            System.out.println("Take the monorail dawg");
        } else {
            System.out.println("Take a walk");
        }

        System.out.println("\n... Switch working just like if else ...\n");

        System.out.println("\n1. Bike \n2. Car \n3. Bus \n4. Monorail \n choose or you'll walk dawg.\n");


        int press = sc.nextInt();

        switch(press) {
            case 1 : System.out.println("get a bike");
            break;
            case 2 : System.out.println("get a car");
            break;
            case 3 : System.out.println("Use Bus Transport");
            break;
            case 4 : System.out.println("Take the monorail dawg");
            break;
            case 5 : System.out.println("Take a walk");
            break;
        }

        sc.close();
    }
}