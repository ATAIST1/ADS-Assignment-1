package org.example;

public class Main {
    public static double sumToN(double b,double n) {
        if(n == 0) {
            return 1;
        }
        else {
            return Math.pow(b, n) + sumToN(b, n-1);
        }
    }


    public static void main(String[] args) {
        System.out.println(sumToN(3,3));
    }
}
