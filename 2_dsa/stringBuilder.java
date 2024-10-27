import java.util.*;

public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        // char at index 0
        System.out.println(sb.charAt(0));

        // set char at index 0
        sb.setCharAt(0, 'P');
        System.out.println(sb);

        // insert char at index
        sb.insert(2,'n');
        System.out.println(sb);

        // delete from certain index
        sb.delete(2, 4);
        System.out.println(sb);

        //misc for getting the name ok
        sb.setCharAt(0, 'T');
        sb.insert(2, 'n');


        // append
        sb.append("S");
        sb.append("t");
        sb.append("a");
        sb.append("r");
        sb.append("k");
        System.out.println(sb.length());
        System.out.println(sb);

        for (int i = sb.length() - 1; i >= 0; i--) {
            System.out.print(sb.charAt(i));
        }

        for (int i = 0; i < sb.length()/2; i++) {
            int back = sb.length() - 1 - i;

            char fchar = sb.charAt(i);
            char bchar = sb.charAt(back);

            sb.setCharAt(i, bchar);
            sb.setCharAt(back, fchar);
            
        }
        System.out.println("\n" + sb);


    }
    
}
