package org.example;
public class Main {
    public static int squareSum(int n) {
        if(n == 1) {
            return 1;
        }
        else {
            return n*n + squareSum(n-1);
        }
    }


    public static void main(String[] args) {
        System.out.println(squareSum(5));
    }
}
