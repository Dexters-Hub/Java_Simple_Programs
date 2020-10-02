package Java_Assingment;

public class Area {
    public static void main(String[] args) {
        new AreaOfShapes(4, 8);
        new AreaOfShapes(20.0, 30.0);
        new AreaOfShapes();
    }

    static class AreaOfShapes {
        AreaOfShapes(int length, int width) {

            double area = length * width;
            System.out.println("Java_Assingment.Area of Rectangle is: " + area + " Unit");
        }

        AreaOfShapes(double base, double height) {
            double area = (base * height) / 2;
            System.out.println("Java_Assingment.Area of Triangle is: " + area + " Unit");
        }
        AreaOfShapes() {
            System.out.println("Java_Assingment.Area of Square is: " + (12*12) + " Unit");
        }

    }
}


