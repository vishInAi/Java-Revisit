import java.util.*;

public class Loops {
    public static void main(String[] args) {
        String[] alphabets={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        System.out.println("Loop Operations : ");

        // Print numbers from 0 to 10
        for(int i=0; i<11; i++){
            System.out.print(i + " ");
        }

        System.out.println(); // Add a new line

        // Print each letter of the alphabet
        for(String letter : alphabets){
            System.out.print(letter + " ");
        }
        int j=0;
        while (j<10) {
            System.out.println("Haggu is King!");
            j++;
        }
        int k=0;
        do {
            System.out.println("Thor is King!");
            k++;
        } while (k<10);
        int n=4;
        int sum = 0;
        for(int l=1;l<=n;l++){
            
            sum = sum+l;
            System.out.println(sum);
        }
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        try{
            for(int mul = 1;mul<=10;mul++){
                int table = num*mul;
                System.out.println(table);


            }



        }
        finally{
            sc.close();
        }

    }
}

