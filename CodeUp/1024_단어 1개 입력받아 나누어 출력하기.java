import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] array_str;
        
        array_str = str.split("");
        
        for (int i=0;i<array_str.length;i++) {
            System.out.printf("\'%s\'\n", array_str[i]);
        }
    }
}
