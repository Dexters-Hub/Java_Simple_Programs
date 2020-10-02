package Java_Assingment;

class sec
{
    sec method1()
    {
        return this;
    }
    void msg()
    {
        System.out.println("Hello");
    }
}
class Test1 {
    public static void main(String[] args) {
        sec obj = new sec();
        obj.method1();
        obj.msg();
    }
}
