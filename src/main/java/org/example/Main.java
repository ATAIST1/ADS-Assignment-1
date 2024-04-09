package org.example;

public class Main {
    public static int sumNElements(int n, int[] arr) {
        if(n == 0) {
            return 0;
        }
        else {
            return arr[n-1] + sumNElements(n-1, arr);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println(sumNElements(5, arr));
    }
}
