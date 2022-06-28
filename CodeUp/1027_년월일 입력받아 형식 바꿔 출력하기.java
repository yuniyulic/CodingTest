import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      String[] date = sc.next().split("\\.");
      
      System.out.println(String.format("%2s-%2s-%4s",date[2],date[1],date[0]));
    }
}
