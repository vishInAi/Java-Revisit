import java.util.*;

public class arrayIntro {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        System.out.println("How many elements you wanna add into the array : ");
        int arrlen = sc.nextInt();
        int[] nums = new int[arrlen];

        for (int i = 0; i < arrlen; i++) {
            System.out.print("Element " + i + " : ");
            nums[i]= sc.nextInt();
        }

        System.out.println("Elements inside the Array : ");

        for (int i = 0; i < nums.length; i++) {
            System.out.println("Element " + i + " : " + nums[i]);            
        }

        System.out.println("Exercise Question ahead : ");

        // Take an array as an input from the user search for a given number x and print the index at which it occurs 

        arrlen = 0;
        System.out.print("length of the array : ");
        arrlen = sc.nextInt();
        int[] que = new int[arrlen];
        ques(que, sc, arrlen);

        sc.close();

    }
    public static void ques(int[] que, Scanner sc, int arrlen) {
        for (int i = 0; i < arrlen; i++) {
            System.out.print("element "+ i +" : ");
            que[i] = sc.nextInt();
        }

        System.out.print("Input which number you want to search for in the array : ");
        int arritem = sc.nextInt();
        
        for (int i = 0; i < que.length; i++) {
            if (que[i] == arritem){
                System.out.println("The item searched for is at index " + i + " and the item is " + que[i]);
                break;
            }
            else {
                System.out.println("Item not found");
            }
            
        }
        
    }
}
