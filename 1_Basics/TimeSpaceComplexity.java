import java.util.*;

public class TimeSpaceComplexity {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        // basically less the no. of operations less the Run Time
        
        // only one operation below so itll take the least time : 
        System.out.println("Hello World!");
        // if we add more operations 
        System.out.println("Hello World!");
        // itll now take more time cause the no. of operations increased

        // op count = 3

        int n = sc.nextInt(); // operation no. 4
        // sometimes the run time depend on the input size as well

        for (int i = 0; i < n; i++) { // no. of iterations is the no. of operations
            System.out.println("im saying Hello ya'll");
        } // more operations more time complexity

        // three cases best avg and worst
        int find = 0;
        int[] li = {1,2,3,4,5};
        // best = code running in desired time
        // omega(1)
        find = 1; // at first index 0
        number(find, li);
        // avg is mid
        // theta(n+1/2)
        find = 3; // somewhere in middle
        number(find, li);
        // worst = specific time which shouldnt be exceeded max time possible you get what im telling right lol
        // Big O(n)
        find = 0; // it doesnt exist so first we search then exit for and print outside statement haha
        number(find, li);

        // Time Complexity = O(n^2)

        int f = sc.nextInt();

        // two loops i used to draw a pattern you see
        // so the inner loop and outer loop both are going for no. of iterations stored in f
        // one iteration of i = f*j iterations 
        // thus f*f number of operations
        // O(n^2)

        for (int i = 0; i < f; i++) {
            for (int j = 0; j < f; j++) {
                System.out.print(" # ");
            }
            System.out.println();
        }
        
        // Time complexity = O(n*m)

        System.out.print("no. of rows : ");
        int x = sc.nextInt();
        System.out.print("no. of cols : ");
        int y = sc.nextInt();

        // time complexity x*y 
        // thus, O(x*y)

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(" # ");
            }
            System.out.println();            
        }

        // Time Complexity = O(x + y)

        x = 0;
        y = 0;

        System.out.print("no. of times you wanna print 'sadface' :");
        x = sc.nextInt();
        for (int i = 0; i < x; i++) {
            System.out.println(":(");
        }
        System.out.print("no. of times you wanna print 'happyface' :");
        y = sc.nextInt();
        for (int i = 0; i < y; i++) {
            System.out.println(":)");
        }

        // Space Complexity

        n = 0;
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Hello");
        }

        // space remains constant input size dont dictate space ok

        // Space complexity 2

        // arrays : in arrays the space complexity highly depend on the input

        // ill upload array file next














        
        sc.close();
        
    }
    public static void number(int find, int[] li){
        for (int i = 0; i < li.length; i++) {
            if (li[i] == find){
                System.out.println("Num is located at pos "+ i);
                return;
            }          
        }
        System.out.println("Number not found");

        }
}
