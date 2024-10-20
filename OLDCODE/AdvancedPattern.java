public class AdvancedPattern {
    public static void main(String[] args) {
        int n=4;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");

            }
            int spaces = 2*(n-i);

            for(int j=1;j<=spaces;j++){
                System.out.print(" "+" ");

            }

            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");

            }
            System.out.println();

        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");

            }
            int spaces = 2*(n-i);

            for(int j=1;j<=spaces;j++){
                System.out.print(" "+" ");

            }

            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");

            }
            System.out.println();

        }

        System.out.println("Pattern 2 : ");
        for(int i=4;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(" "+" ");
            }
            for(int l=1;l<=5;l++){
                System.out.print("*"+" ");

            }
            System.out.println();
        }

        System.out.println("Pattern 3 : ");
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }

        System.out.println("Pattern 4 : ");
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5-i;j++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            for(int j=2;j<=1;j++){
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println("Pattern 5 : ");
        for(int i=1;i<=n;i++){
            for(int j=4;j>=i;j--){
                System.out.print(" "+" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            for(int j=2;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=4;j>=i;j--){
                System.out.print(" "+" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            for(int j=2;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        
        
        
    
    }   
}


