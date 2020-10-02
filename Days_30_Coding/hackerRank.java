package Days_30_Coding;

import java.util.Scanner;

public class hackerRank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int[] myArray = new int[n];
        for(int i =0; i<n; i++){
            myArray[i] = sc.nextInt();
        }

        double average = 0;
        for(int i =0; i<n; i++){
            average = average + myArray[i];
        }

        average = average/n;
        System.out.println(average);
    }

}
