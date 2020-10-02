package Java_Assingment;

public class AvgMaxArray {
    public static void main(String[] args){
        int[] arr = {2,4,6,8,9};
        AvgMaxArray ObjArr = new AvgMaxArray();
        ObjArr.Avg(arr);
        ObjArr.Max(arr);
    }
    void Avg(int[] a) {
        double sum = 0, avg;
        for(double i: a){
            sum+=i;
        }
        avg = sum/a.length;
        System.out.println("Avg of elements: " +avg);
    }

    void Max(int[] a){
        int max = a[0];
        for(int i: a){
            if(i>max)
                max=i;
        }
        System.out.println("Maximum of elements: "+max);
    }
}
