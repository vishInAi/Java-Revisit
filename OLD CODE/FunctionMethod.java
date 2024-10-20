import java.util.*;
public class FunctionMethod {
    public static int sum(int a,int b){
        int cal = a+b;
        System.out.println("The sum of two numbers is : "+cal);
        return cal;
    }
    public static int mul(int c,int d){
        int cal = c*d;
        System.out.println("The Multiplication of two numbers is : "+cal);
        return cal;
    }
    public static void factorial(int f){
        int fact =1;
        for(int i=f;i>=1;i--){
            fact=fact*i;
        }
        System.out.println("The factorial of the provided number "+f+" is "+fact);
        return ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //I added switch after i got over with code :)
        try{
        System.out.println("Hello user! \n You can perform various operations here to do them Select Valid Option from options below : \n 1 for Addition \n 2 for Multiplication \n 3 for Facrorial of a Number \n");
        System.out.println("Enter your Selection : ");
        int key = sc.nextInt();
        switch (key) {
            case 1:
            // 1st sum program
        System.out.println(" For Addition of Two Numbers : ");
        System.out.print("Enter first no : ");
        int a = sc.nextInt();
        System.out.print("Enter second no : ");
        int b = sc.nextInt();
        sum(a, b);               
                break;
            case 2:
            // 2nd mul program
        System.out.println(" For Multiplication of Two Numbers : ");
        System.out.print("Enter first no : ");
        int c = sc.nextInt();
        System.out.print("Enter second no : ");
        int d = sc.nextInt();
        mul(c, d);
                
                break;
            case 3:
            // 3rd factorial program
        System.out.println(" For Factorial of any Number : ");
        System.out.print("Enter any no : ");
        int f = sc.nextInt();
        factorial(f);               
                break;
        
            default:
            System.out.println(" YOU Gotta be dumb to enter Invalid key");
                break;
        }
    }
    finally{
        sc.close();
    }
    

        // what about methods : Well Methods are similar to Functions both are a block of code that take input return output the only diff is we call them by class objects :)
    }
}
