package com.driver;

import java.util.*;
public class Main{
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        Product p = new Product();
        int ans_1 = p.product(x,y);
        int ans_2 = p.product(x,y,z);
        double ans_3 = p.product((double)x, (double)y);
        System.out.println(ans_1);
        System.out.println(ans_2);
        System.out.println(ans_3);
    }
}
    class Product{
    public static int product  (int x, int y){
        return x*y;
    }
    public static int product (int x, int y, int z){
        return x*y*z;
    }
    public static double product (double x, double y){
        return x*y;
    }
}
