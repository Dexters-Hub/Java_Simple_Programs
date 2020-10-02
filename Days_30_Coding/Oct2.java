package Days_30_Coding;

import java.util.*;

public class Oct2 {
    static int MAX_SIZE = (int) 1e6;

    static boolean []prime = new boolean[MAX_SIZE + 1];
    static void sieve()
    {

        Arrays.fill(prime, true);

        for (int p = 2; p * p <= MAX_SIZE; p++)
        {


            if (prime[p])
            {
                for (int i = p * p;
                     i <= MAX_SIZE; i += p)
                    prime[i] = false;
            }
        }
    }
    static int kthPrimeGreaterThanN(int n, int k, int[] arr) {

        int res = -1;
        for (int i = n + 1; i < MAX_SIZE; i++) {
            for (int j = i; j < n; j++) {
                if (arr[j] == i)
                    if (prime[i])
                        k--;

                if (k == 0) {
                    res = i;
                    break;
                }
            }
        }
            return res;
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        int n = arr.length;
        int k = sc.nextInt();
        {
            sieve();
            System.out.println(kthPrimeGreaterThanN(n, k, arr));
        }
    }
}


