package Java_Assingment;

public class SumMatrix {
    public static void main(String[] args) {
        int sum = 0;
        int[][] matrix = {{1,2},{3,4}};
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                sum = sum + matrix[i][j];
            }
        }
        System.out.println("Sum of all elements is: " + sum);
    }
}