import java.util.*;
public class stringsBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.next());
        System.out.println(sb);
        sb.setCharAt(0, 'H');
        System.out.println(sb);
        sb.insert(sb.length(), ".D Luffy");
        System.out.println(sb);
        sb.delete(0, 6);
        System.out.println(sb);
        sb.append(" Monkey");
        System.out.println(sb);

        sc.close();
    }
}
