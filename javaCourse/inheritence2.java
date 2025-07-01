public class inheritence2 {
    public static void main(String[] args) {
        Student s = new Student();
    }
    
}
class person{
    public person(){
        System.out.println("person is alive");
    }
}
class Student extends person{
    //this is constructor when using public with same name as class.
    public Student(){
        super();
        System.out.println("Student is alive");
    }
}