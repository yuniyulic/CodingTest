﻿import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      String[] arr = sc.nextLine().split(":");
      System.out.println(Integer.parseInt(arr[1]));
    }
}
