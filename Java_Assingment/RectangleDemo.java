package Java_Assingment;

class Rectangle
{
    int length;
    int width;
    int area;
    Rectangle(int l, int b)
    {
        length = l;
        width = b;
    }
    Rectangle areamethod(Rectangle r2)
    {
        area = r2.length * r2.width;
        return(r2);
    }
}
class RectangleDemo {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10,20);
        Rectangle r3 = r1.areamethod(r1);
        System.out.println("Area= "+r3.area);
    }
}
