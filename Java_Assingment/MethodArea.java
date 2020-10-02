package Java_Assingment;

public class MethodArea {
    public static void main(String[] args) {
        MethodArea area = new MethodArea();
        area.Area(4,8);
        area.Area(20.0,30.0);
        area.Area();
    }
    public void Area(int length, int width) {

            double area = length * width;
            System.out.println("Java_Assingment.Area of Rectangle is: " + area + " Unit");
        }

    public void Area(double base, double height) {
            double area = (base * height) / 2;
            System.out.println("Java_Assingment.Area of Triangle is: " + area + " Unit");
        }

    public void Area() {
            System.out.println("Java_Assingment.Area of Square is: " + (12*12) + " Unit");
        }
}
