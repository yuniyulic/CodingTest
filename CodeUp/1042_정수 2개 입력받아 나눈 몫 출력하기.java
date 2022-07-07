import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num[] = br.readLine().split(" ");
        long a = Long.parseLong(num[0]);
        long b = Long.parseLong(num[1]);
        System.out.print(a/b);
    }
}
