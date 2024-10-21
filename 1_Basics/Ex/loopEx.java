package Ex;
import java.util.*;

public class loopEx{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
    // Q . Print the sum of first n natural numbers
        // n = 35

        // Value Input

        System.out.println("Enter the no. of natural numbers :");
        int n = sc.nextInt();
        
        // use the summation formula n(n+1)/2
        
        int natSum = (n*(n+1))/(2);
        System.out.println("The Sum of n Natural Numbers : " + natSum);

        // Using Loop

        natSum = 0;

        for(int i = 0; i <= n; i++){
            natSum += i;
            if(i == n){
                System.out.println("The total of Nat Num Sum : " + natSum);
            }
        }

        // gap 
        System.out.println("\n");
    
    // Q. Print the table of a number input by the user.
        
        // input

        System.out.println("Input the Table number you want to print : ");
        int digit = sc.nextInt();

        for (int j = 1; j<=10; j++){            
            System.err.println(digit+" x "+j+" = "+(digit*j));
        }

        sc.close();

    }
}