package Interview;
import java.util.*;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String nstr = " ";
        char ch;
        System.out.println("Original Word: " + str);

        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            nstr = ch + nstr;
        }
        System.out.println("Reversed String:" + nstr);
        scan.close();
    }
}
