package Days_30_Coding;

import java.io.*;
import java.util.*;
import java.lang.Math;
public class quad {
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float a, b, c;
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();
            float d = (b * b - 4 * a * c);
            double val = Math.sqrt(Math.abs(d));
            if (d > 0) {
                double x = (-b +val ) / (2 * a);
                double y = (-b -val ) / (2 * a);
                System.out.println("Real and Distinct");
                System.out.print(Math.round(y) + " " + Math.round(x));
            } else if (d == 0) {
                double x = (-b) / (2 * a);
                System.out.println("Real and Equal");
                System.out.println(Math.round(x) + " " + Math.round(x));
            } else {
                System.out.println("Imaginary");
            }
    }
}

