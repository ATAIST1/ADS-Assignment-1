package org.example;
public class Main {
    public static boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        return (n == 1) || ((n % 2 == 0) && isPowerOfTwo(n / 2));
    }
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(16));
    }
}
