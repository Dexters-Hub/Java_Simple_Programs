package Days_30_Coding;

import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Foces_Day_5 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int res = 0;
        String[] list;
        list = br.readLine().split(" ");
        if (n >= -100 && (n <= 100))
            switch (n) {
                case 1 : for (String i : list) {
                            res += Integer.parseInt(i);
                        }
                        System.out.println(res);
                        break;
                case 2 : for (String i : list) {
                            res -= Integer.parseInt(i);
                        }
                        System.out.println(res);
                        break;
                case 3 : for (String i : list) {
                            res *= Integer.parseInt(i);
                        }
                        System.out.println(res);
                        break;
                case 4 : for (String i : list) {
                            res /= Integer.parseInt(i);
                        }
                        System.out.println(res);
                        break;
                default:
                    System.out.println("Output Error");
            }
    }
}