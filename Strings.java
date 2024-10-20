import java.util.*;
public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        switch (key) {
            case 1:
            System.out.print("Enter Name of User : ");
            String name = sc.next();
            System.out.print("Enter SirName of User : ");
            String sirName = sc.next();
            String fullName = name +" "+ sirName;
            System.out.print("The Fullname of the user is : "+fullName);
                
                break;
            case 2:
            System.out.println("This is a String Length showing example : ");
            String fullName1 = sc.nextLine();
            System.out.println(fullName1.length());

                break;
            case 3:
            System.out.println("This is a String Length showing example : ");
            String fullName2 = sc.next();
            for (int i = 0; i < fullName2.length(); i++) {
                System.out.println(fullName2.charAt(i));   
            }

                break;
            case 4:
            System.out.println("Enter first name to Compare : ");
            String name1 = sc.next();
            System.out.println("Enter Second name to Compare : ");
            String name2 = sc.next();
            if (name1.compareTo(name2) == 0) {
                System.out.println("Strings are Equal.");
            } else {
                System.out.println("Strings are not Equal.");
            }
            if (name1.length()>name2.length()) {
                System.out.println("The First Name has More Characters.");    
            } else {
                System.out.println("The Second Name has More Characters.");
            }
            System.out.println("First name's Length : "+name1.length());
            System.out.println("Second name's Length : "+name2.length());
            if (name1 == name2) {
                System.out.println("The Strings are Identical.");
            } else {
                System.out.println("The Strings are not Identical.");
            }

                break;
            case 5:
            String sentence = "There is only one god and it's from Hinduism only.";
            System.out.println(sentence);
            System.out.print("Starting Index : ");
            int n1 = sc.nextInt();
            System.out.print("Ending Index : ");
            int n2 = sc.nextInt();
            String name5 = sentence.substring(n1,n2);
            System.out.println(name5);

                break;
            default:
                break;
        }
        
        sc.close();

    }
}
