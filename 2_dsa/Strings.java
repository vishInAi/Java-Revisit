import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = str.nextLine();
        System.out.println("Enter your age: ");
        int age = str.nextInt();
        System.out.println("the name is " + name + " and age is " + age);

        // concatenation

        String a = "it is ";
        String b = "what";
        String c = " it is.";
        System.out.println(a+b+c + "#ItisWhatitIs"); // without storing in var
        String concat = a + b + c;
        System.out.println(concat); // if stored in var

        // using loop for unnecessary manipulations cause char stored in strings can be used as array lol

        for (int i = 0; i < concat.length(); i++) {
            System.out.println(concat.charAt(i));
        }

        // comparison 

        String a1 = "Name";
        String b1 = "Name";

        if(a1.compareTo(b1) == 0){ // we used compareTo cause id doesnt fail in most cases we dont even realise you can use == too
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings not equal");
        }

        if(new String("Tony") == new String("Tony")){ // strings are same yet itll give false
            System.out.println("Equal");
        } else {
            System.out.println("not equal");
        }

        String sentence = "My name is tony";
        // substring(beginning: index, ending: index);
        String name1 = sentence.substring(11, sentence.length());
        System.out.println(name1);        

        sentence = "TonyStark";
        String name2 = sentence.substring(4);
        System.out.println(name2);

        // strings are immutable just know that

        str.close();
    }
}
