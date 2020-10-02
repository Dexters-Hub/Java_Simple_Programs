package Days_30_Coding;

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 400 == 0) {
            System.out.println("True");
        }
        if (n % 100 == 0){
            System.out.println("False");
        }
        if (n % 4 == 0) {
            System.out.println("True");
        }
        else{
            System.out.println("False");
    }
}
}