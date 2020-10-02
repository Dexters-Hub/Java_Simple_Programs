package Java_Assingment;
class Student {
    String name;
    int age;
    int fee;
    public Student(String initName,int initAge, int initFee) {
        this.name = initName;
        this.age = initAge;
        this.fee = initFee;
    }
}
public class StudentDetails {
    public static void main(String[] args) {
        Student stu = new Student("Alwin",19,35000);
        System.out.printf("Name: %s\nAge: %d\nFee: %d Rs\n",stu.name,stu.age,stu.fee);
        }
    }



