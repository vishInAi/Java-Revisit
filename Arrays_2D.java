import java.util.*;

public class Arrays_2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        switch (key) {
            case 1:
            int inputs = sc.nextInt();
            int[] num= new int[inputs];
            for (int i = 0; i < inputs; i++) {
                num[inputs]=sc.nextInt();

            }
            System.out.println(num[inputs]+" ");                
                break;
            case 2:
            int rows = sc.nextInt();
            int cols = sc.nextInt();
            int[][] numbers = new int[rows][cols];
            for (int i = 0; i < rows; i++) {
                for(int j = 0; j < cols; j++) {
                    numbers[i][j] = sc.nextInt();
                }
            }
            for (int i = 0; i < rows; i++) {
                for(int j = 0; j < cols; j++) {
                    System.out.print(numbers[i][j]+" ");
                }
                System.out.println();
            }
                
                break;
            case 3:
            int rows1 = sc.nextInt();
            int cols1 = sc.nextInt();
            int[][] numbers1 = new int[rows1][cols1];
            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < cols1; j++) {
                    numbers1[i][j] = sc.nextInt();
                }               
            }
            int x = sc.nextInt();
            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < cols1; j++) {
                    if (numbers1[i][j] == x) {
                        System.out.println("x found at location ("+i+")("+j+")");   
                    }
                    else {
                        System.out.println("The number not found!");
                    }
                }
                System.out.println();
            }
                break;
            default:
            System.out.println(" youre acting dumb");
                break;
        }
        
        sc.close();
        

    }
}
