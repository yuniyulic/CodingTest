import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str = sc.next();
        String[] arr = new String[str.length()];
        arr = str.split("");
        int digit = 1;
        int num;
        
        for (int i = 1 ; i < str.length(); i++) {
            digit *= 10;
        }
        
        for (int i = 0 ; i < str.length(); i++) {
            num = (Integer.parseInt(arr[i])) * digit;
            System.out.println("[" + num + "]");
            digit /= 10;
        }
    }
}
