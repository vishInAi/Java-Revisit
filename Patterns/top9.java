package Patterns;

import java.util.*;

public class top9 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("THe Box : ");
        int n = sc.nextInt();
        int j , i;

        for (i = 1; i <= n; i++){
            for ( j = 1; j <= n; j++) {
                System.out.print("[ ]");
            }
            System.out.println();
        }

        // Hollow Shit
        n = 0;

        System.out.print("Enter Rows: ");
        n = sc.nextInt();
        System.out.print("Enter Columns: ");
        int m = sc.nextInt();

        for (i = 1; i <= n; i++){
            for ( j = 1; j <= m; j++) {
                if (i == 1 || j == 1 || i == n || j == m) {
                    System.out.print("[ ]");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }


    }
    
}
