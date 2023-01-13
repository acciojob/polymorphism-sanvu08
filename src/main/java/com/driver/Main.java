package com.driver;

import java.util.*;
public class Main{
    public static void main (String[] args) {
        Product p = new Product();
        p.product (5,6);
        p.product(5,6,7);
        p.product(5.0, 6.0);

    }
    public static class  Product{
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
}
