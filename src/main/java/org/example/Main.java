package org.example;

public class Main {
    public static int sumToN(int n) {
        if(n == 1) {
            return 1;
        }
        else {
            return n + sumToN(n-1);
        }
    }


    public static void main(String[] args) {
        System.out.println(sumToN(5));
    }
}
