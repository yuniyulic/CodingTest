﻿import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num[] = br.readLine().split(" ");
        long a = Long.parseLong(num[0]);
        long b = Long.parseLong(num[1]);
        long c = Long.parseLong(num[2]);

        System.out.println(a + b + c);
        System.out.println(String.format("%.1f", (double)(a+b+c)/3));
    }
}
