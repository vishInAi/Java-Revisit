import java.util.*;

public class control {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    try{
        System.out.println("four options choose one for which lang you want to see : \n 1 for English \n 2 for Marathi \n 4 for Spanish \n 3 for Japanese ");
        int num = sc.nextInt();

        switch (num) {
        case 1:
            System.out.println("Hello");
            break;
        case 2:
            System.out.println("Namaskar");
            break;
        case 3:
            System.out.println("Konnichiwa");
            break;
        case 4:
            System.out.println("Hola");
            break;
        default:
            System.out.println("Namaste hum aapko Gaghe Samajte");
            break;
     }

     System.out.println("Numerical Comparison Using Numbers : ");
     System.out.print("Enter First Number: ");
     int a = sc.nextInt();
     System.out.print("Enter Second Number: ");
     int b = sc.nextInt();
     if(a==b) {
        System.out.println("Both are Equal");
        }
     else if (a>b) {
        System.out.println(" first no is greater.");
        }
     else if (a<b) {
        System.out.println(" second no is greater.");
        }
     else {
        System.out.println(" you're Stupid");
        }
    }
    finally {
        sc.close();
    }
}
}
