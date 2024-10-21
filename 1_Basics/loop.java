public class loop{
    public static void main(String[] args) {
        System.out.println("For Loop");
        System.out.println("Printing count vertically : ");

        for (int i = 0; i <= 4; i++ ) {
            System.out.println( i + " ");
        }

        System.out.println("Printing count horizontally : ");

        for (int i = 0; i <= 4; i++ ) {
            System.out.print( i + " ");
        }

        System.out.println("\n"); // gap in action

        System.out.println("Using while Loop :");

        int j=1;
        while(j <= 4){
            System.err.println("count : "+ j);
            j++;
        }

        System.out.println("\n");

        System.out.println("Using the Do While Loop : ");

        int k = 1;
        do{
            System.out.println("count : " + k);
            k++;
        } while ( k <= 4);

        System.out.println("\n");
    }
}