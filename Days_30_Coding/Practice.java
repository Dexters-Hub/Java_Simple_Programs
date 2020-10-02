package Days_30_Coding;

import java.util.*;
public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num;
        num = sc.nextLine();
        System.out.println(convertBinaryToDecimal(num));
    }

    public static int convertBinaryToDecimal(String str){
        double j=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)== '1'){
                j=j+ Math.pow(2,str.length()-1-i);
            }

        }
        return (int) j;
    }
    }
