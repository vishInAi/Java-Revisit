import java.util.*;

public class array2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] arr2d = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr2d[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr2d[i][j] + " ");     
            }
            System.out.println();
        }

        // Question : Take a matrix as input from the user. Search for a given number x and print the indices at which it occurs

        rows = 0;
        cols = 0;
        System.out.print("rows : ");
        rows = sc.nextInt();
        System.out.print("cols : ");
        cols = sc.nextInt();
        int[][] mat = new int[rows][cols];

        coordinate(sc, rows, cols, mat);

        sc.close();
    }
    public static void coordinate(Scanner sc, int rows, int cols, int[][] mat) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("What number to search from the output : ");
        int find = sc.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (mat[i][j] == find){
                    System.out.println("The number user war looking for is at x: " + rows + " y: " + cols + " and the number is " + find);
                }                
                else {
                    System.out.println("The number wasnt found.");
                }
            }
            
        }
        
    }
    
}
