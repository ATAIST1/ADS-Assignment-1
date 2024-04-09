package org.example;

import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static String inputSum(int n, ArrayList<Integer> list){
        if(n == 1) {
            int b = sc.nextInt();
            return b+ "";
        }
        else {
            int b = sc.nextInt();
            list.add(b);
            return inputSum(n-1, list) + " " + b;
        }
    }


    public static void main(String[] args) {
        int r = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(inputSum(r, list));
    }
}
