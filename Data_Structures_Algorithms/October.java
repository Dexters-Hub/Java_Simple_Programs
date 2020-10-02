package Data_Structures_Algorithms;

import java.util.Scanner;
class BinarySearch {

    int binarySearch(int[] arr, int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;

            if (arr[mid] == x)
                return mid;

            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);

            return binarySearch(arr, mid + 1, r, x);
        }
        return -1;
    }

}
public class October {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinarySearch ob = new BinarySearch();
        int num, temp;
        num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();

            }
        for (int i = 0; i < num; i++)
            for (int j = i + 1; j < num; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
            }
        }
            int n = arr.length;

            int x;
            x = sc.nextInt();
            sc.close();
            int result = ob.binarySearch(arr, 0, n - 1, x);
            System.out.println(result);

    }
}
