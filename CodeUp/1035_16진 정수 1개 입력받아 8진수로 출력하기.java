﻿import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String n = br.readLine();
      
      int octal = Integer.parseInt(n, 16);
      
      System.out.printf("%o", octal);
    }
}
