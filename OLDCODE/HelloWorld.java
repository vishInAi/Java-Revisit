import java.util.*;
public class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    try{
        System.out.println(" for Addition of two Digits :");
        System.out.print("first Number : ");
        float a = sc.nextFloat();
        System.out.print("Second Number : ");
        float b = sc.nextFloat();
        float sum=a+b;
        System.out.println(sum);
        System.out.println("For Multiplication of two digits : ");
        System.out.print("first Number : ");
        float c = sc.nextFloat();
        System.out.print("Second Number : ");
        float d = sc.nextFloat();
        float mul=c*d;
        System.out.println(mul);
        System.out.println("For Division of two digits : ");
        System.out.print("first Number : ");
        float e = sc.nextFloat();
        System.out.print("Second Number : ");
        float f = sc.nextFloat();
        float div=e/f;
        System.out.println(div);
    }
    finally{
        sc.close();
    }
        
    }
}
