public class PatternQues{
    public static void main(String[] args) {
        System.out.println("Pattern 1 : \n ****** \n ******\n ******\n ******");
        for(int i=1;i<=4;i++){
            for(int j=1;j<=6;j++){
                System.out.print("*"+" ");
            }
            System.out.println(" ");
        }
        System.out.println("Pattern 2 : \n ****** \n *    *\n *    *\n ******");
        int q=4;
        int w=6;
        for(int k=1;k<=q;k++){
            for(int l=1;l<=w;l++){
                if( k==1 || k==q || l==1 || l==w){
                    System.out.print("*"+" ");
                }else {
                    System.out.print("  "); // Two spaces to maintain the shape
                    }
            }
            System.out.println();
        }
        System.out.println("Pattern 3 : \n * \n **\n ***\n ****");
        for(int t=1;t<=4;t++){
            for(int t1=1;t1<=t;t1++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Pattern 4 : ");
        for(int t3=4;t3>=1;t3--){
            for(int t4=1;t4<=t3;t4++){
                System.out.print("*");
            }
            System.out.println();
        }  
        System.out.println("Pattern 5 : ");
        int n1=5;
        for(int t5=1;t5<=n1;t5++){
            for(int t6=1;t6<=n1-t5;t6++){
                System.out.print(" ");
                for(int t7=1;t7<=1;t7++){
                    System.out.print("*");
                }

            }
            System.out.println();
        }  
        System.out.println("Pattern 6 : \n * \n **\n ***\n ****");
        for(int t=1;t<=5;t++){
            for(int t1=1;t1<=t;t1++){
                System.out.print(t1+" ");
            }
            System.out.println();
        }
        System.out.println("Pattern 7 :");
        for(int t=5;t>=1;t--){
            for(int t1=1;t1<=t;t1++){
                System.out.print(t1+" ");
            }
            System.out.println();
        }
        System.out.println("Pattern 8 : \n * \n **\n ***\n ****");
        int i6=5;
        int i7=1;
        for(int t=1;t<=i6;t++){
            for(int t1=1;t1<=t;t1++){
                System.out.print(i7+" ");
                i7++;
 
 
            }
            System.out.println();
        }

    
    }
}