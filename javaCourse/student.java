public class student {
    private String name;
    private int rollnumber;
    private double marks;
    public student(String name, int rollnumber,double marks){
        this.name = name;
        this.rollnumber = rollnumber;
        this.marks = marks;
    }
    public void Display(){
        System.out.println("name of student is " + name);
        System.out.println("Roll number of student is " + rollnumber);
        System.out.println("Marks of student is " + marks);
    }
    public static void main(String[] args) {
        student s = new student("Vikas", 959, 99.9);
        s.Display();
    }
}
