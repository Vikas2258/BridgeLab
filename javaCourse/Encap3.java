//Define a class Student with private fields rollNo and grade.
// Create getters and setters, and print the student's details using those methods.
class Encap3{
	public static void main(String[] args){
		Student s = new Student();
		s.setgrade("A++");
		s.setrollNo(9590);
		System.out.println("This is my rollNo. " + s.getrollNo());
		System.out.println("This is my grade " + s.getgrade());
		
	}
}
class Student{
	private int rollNo;
	private String grade;
	public int getrollNo(){
		return rollNo;
	}
	public String getgrade(){
		return grade;
	}
	public void setrollNo(int rollNo){
		this.rollNo = rollNo;
	}
	public void setgrade(String grade){
		this.grade =grade;
	}
}