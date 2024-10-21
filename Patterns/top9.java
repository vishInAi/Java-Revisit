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

        // Pyramid Shit hehe (left lean)

        n = 0;
        m = 0;
        System.out.print("Number of rows for pyramid : ");
        n = sc.nextInt();

        for(i = 1; i<=n; i++){
            for(j = 1; j<=i; j++){
                System.out.print("[ ]");
            }
            System.out.println();
        }

        // above pyramid upside down

        System.out.println("Number of rows for pyramid : ");
        m = sc.nextInt();

        for(i = m; i>=1; i--){
            for(j = i; j>=1; j--){
                System.out.print("[ ]");
            }
            System.out.println();
        }

        n = 0;
        System.out.println("Number of rows for pyramid right lean : ");
        n = sc.nextInt();

        for(i = 1; i<=n; i++){

            for(j = 1; j<=n-i; j++){
                System.out.print("   ");
            }
            for(int k = 1; k<=i; k++){
                System.out.print("[ ]");
            }

            System.out.println();
        }

        // Number pyramid left lean

        m = 0;
        System.out.print("Enter Natural Number bro : ");
        m = sc.nextInt();

        for(i = 1; i<=m; i++){
            for(j = 1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }

        // Upside down of the above pyramid

        n = 0;

        System.out.print("Enter Natural Number bro: ");
        n = sc.nextInt();

        for (i = n; i>=1; i--){
            for (j = i; j>=1; j--){
                System.out.print(j);
            }
            System.out.println();
        }

        // bruh ill fig out the upper one later

        // pyramid left lean num kept increasing

        m= 0;
        System.out.println("Pyramid of no. in a continuous manner : ");
        System.out.print("enter rows : ");
        m = sc.nextInt();
        int num = 0;

        for( i = 1; i<=m; i++){
            for(j = 1; j<=i; j++){
                num++;
                System.out.print(num);
            }
            System.out.println();
        }

        // sorry but i try to be genuine as much possible 

        // pyramid of binary kingdom 101010101010101010

        n = 0;

        System.out.println("Enter the number of rows : ");
        n = sc.nextInt();
        num = 0;

        for(i = 1; i<=n; i++){
            for(j = 1; j<=i; j++){
                if ( num == 0){
                    System.out.print("1 ");
                    num++;
                }
                else if (num == 1){
                    System.out.print("0 ");
                    num--;
                }
            }
            System.out.println();
        }

        sc.close();
    }
    
}
