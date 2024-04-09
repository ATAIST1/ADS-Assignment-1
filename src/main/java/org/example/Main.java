package org.example;


import java.util.Scanner;


public class Main {


    static Scanner scanner = new Scanner(System.in);
    static void reverseSequence(int n) {
        if (n == 0) {
            return;
        }
        String string = scanner.nextLine();
        reverseSequence(n - 1);
        System.out.println(string);
    }


    public static void main(String[] args) {
        int n = scanner.nextInt();
        reverseSequence(n);
    }
}
