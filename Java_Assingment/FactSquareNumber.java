package Java_Assingment;

public class FactSquareNumber {
    int Fact(int num){
        int i = 1;
        int fact = 1;
        while (i <= num) {
            fact *= i;
            i++;
        }

        return fact;
    }
    int Square(int num){
        return num * num;
    }
}
