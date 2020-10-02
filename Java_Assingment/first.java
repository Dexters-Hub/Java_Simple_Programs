package Java_Assingment;

class second
{
    first obj1;
    second(first obj)
    {
        this.obj1 = obj;
    }

    void display()
        {
            System.out.println(obj1.data);
        }

}
class first {
    int data =10;
    first()
    {
        second b = new second(this);
        b.display();
    }

    public static void main(String[] args) {

            first a = new first();
    }
}
