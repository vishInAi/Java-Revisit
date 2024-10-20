import java.util.*;
public class PlacementQuestions {
    //Local function 1
    public static int average(int a1,int a2,int a3){
        int cal = (a1+a2+a3)/3;
        System.out.println("The average is : "+ cal);
        return cal;
    }
    //Local function 2
    public static int oddSum(int num,int odd){
        for(int i=1;i<=num;i++){
            if (i%2!=0) {
                odd+=i;             
            }
        }
        System.out.println("The total sum : "+ odd);
        return odd;
    }
    //Local function 3
    public static int greatFinder(int g1,int g2){
        int greater;
        if (g1>g2) {
            greater=g1;            
        }else{
            greater=g2;
        }
        System.out.println("The greater number from both of them is : "+greater);
        return greater;
    }
    //Local function 4
    public static float circumferenceFinder(float radius){
        float circumference=2*3.14f*radius;
        System.out.println("The circumference of the circle with radius "+ radius+" is : "+ circumference);
        return circumference;
    }
    //Local function 5
    public static void legibleAge(float age){
        if (age>=18) {
            System.out.println(" The person is Eligible to vote");  
        } else {
            System.out.println(" The Person is not Eligible to vote");
        }
        return ;
    }
    //Local Function 6
    public static void infiniteLoop(){
        Scanner lp = new Scanner(System.in);
        char userChoice;
        do {
            System.out.println("Thor is God of Thunder");
            System.out.print("Do you want to continue? (y/n) : ");
            userChoice=lp.next().charAt(0);
        } while ( userChoice=='y' || userChoice=='Y' );
        lp.close();

    }
    //Local Function 7
    public static void infiniteNumberInput(){
        Scanner lp = new Scanner(System.in);
        char userChoice;
        int positiveCount =0;
        int negativeCount =0;
        int ZeroCount =0;
        do {
            System.out.println("Enter a fkin number bro : ");
            int num = lp.nextInt();
            if (num>0) {
                positiveCount++;   
            }
            else if (num<0){
                negativeCount++;
            }
            else {
                ZeroCount++;
            }
            System.out.print("Do you want to continue? (y/n) : ");
            userChoice=lp.next().charAt(0);
        } while ( userChoice=='y' || userChoice=='Y' );
        System.out.println("The no. of Positive values entered : "+positiveCount);
        System.out.println("The no. of negative values entered : "+negativeCount);
        System.out.println("The no. of Zero values entered : "+ZeroCount);
        lp.close();

    }
    //Local Function 8
    public static double Indices(double x,double n) {
        double Calculation = Math.pow(x, n);
        System.out.println("The format Preview "+x+"^"+n);
        System.out.println("The fkin calculation of indices is : "+Calculation);
        return Calculation;
        
    }
    //Local Function 9
    public static int calculateGCD(int a, int b) {
        if (b == 0) {
            return a;
        }else{
            return calculateGCD(b, a % b);
        }
    }
    //Local Function 10
    public static void fibonacciSeries(int Range) {
        int firstTerm = 0;
        int secondTerm = 1;
        System.out.print("Fibonacci series up to " + Range + " terms: ");
        for (int i = 1; i <= Range; i++) {
            System.out.print(firstTerm + " ");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
            
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("************************************Switch Operations************************************");
        System.out.println("""
                Here's The Big Fkin List of what this Program can do : 
                press 1 for 3numbers Average Calculation
                press 2 for Sum of Odds upto entered no
                press 3 for Greater number finder
                press 4 for Circumference finder
                press 5 for Voter Age eligibility checker
                press 6 for Infinite Loop with Control to stop it
                press 7 for Infinite Loop to input digits and see no. of +ve -ve and Zeros hehe
                press 8 for Digit with Power (Basically Indices stuff)
                press 9 for Function calculating GCD of 2 Numbers
                press 10 for Fibonacci Series Printer
                """);
    try{
        int key= sc.nextInt();
        switch (key) {
            case 1:
            System.out.println(":) 3numbers Average Calculation : ");
            System.out.print("Enter First Number : ");
            int a1 = sc.nextInt();
            System.out.print("Enter Second Number : ");
            int a2 = sc.nextInt();
            System.out.print("Enter Third Number : ");
            int a3 = sc.nextInt();
            average(a1, a2, a3);
                
                break;
            case 2:
            System.out.println("Sum of Odds upto entered no : ");
            System.out.print("Enter Number : ");
            int num = sc.nextInt();
            int odd =0;
            oddSum(num,odd);
                
                break;
            case 3:
            System.out.println("Greater number finder : ");
            System.out.print("Enter First Number : ");
            int g1 = sc.nextInt();
            System.out.print("Enter Second Number : ");
            int g2 = sc.nextInt();
            greatFinder(g1, g2);

                break;
            case 4:
            System.out.println("Circumference finder : ");
            System.out.print("Enter Radius of circle : ");
            float radius = sc.nextFloat();
            circumferenceFinder(radius);
                
                break;
            case 5:
            System.out.println("Voter Age eligibility checker : ");
            System.out.print("Person's Age : ");
            int age = sc.nextInt();
            legibleAge(age);
                
                break;
            case 6:
            System.out.println("Infinite Loop with Control to stop it : ");
            infiniteLoop();
            System.out.println("The loop is Successfully Terminated lol.");
                
                break;
            case 7:
            System.out.println("Infinite Loop to input digits hehe : ");
            infiniteNumberInput();
            System.out.println("The Number input has been stopped by user");
                
                break;
            case 8:
            System.out.println("Digit with Power (Basically Indices stuff) : ");
            System.out.print("Enter the Number : ");
            double x= sc.nextDouble();
            System.out.print("Enter it's Power : ");
            double n= sc.nextDouble();
            Indices(x, n);
                
                break;
            case 9:
            System.out.println("Function calculating GCD of 2 Numbers : ");
            System.out.println("""
            ____________________________Instruction____________________________    
            -Make sure the first number be Greater than Second number you Enter. 
            -As we will divide first_no. by the Second_no. right""");
            System.out.print("Enter First Number : ");
            int num1 = sc.nextInt();
            System.out.print("Enter Second Number : ");
            int num2 = sc.nextInt();
            int gcd = calculateGCD(num1, num2);
            System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
            
                break;
            case 10:
            System.out.println("Fibonacci Series Printer : ");
            System.out.print("Enter the number of terms for Fibonacci series : ");
            int Range = sc.nextInt();
            fibonacciSeries(Range);
                
                break;
        
            default:
            System.out.println("How can you be so DUMB to input this shit instead of real Function key");
                break;
        }
    }
    finally{
        sc.close();
    }
       
    }
    
}
