class Abst5{
	//Define an abstract class Employee with abstract method calculateSalary(). 
	//Implement this method in FullTimeEmployee and PartTimeEmployee.
	public static void main(String[] args){
		FullTimeEmployee f = new FullTimeEmployee();
		//PartTimeEmployee p = new PartTimeEmployee(3000);
		f.calculateSalary(3);
		//p.calculateSalary();
	
	}
}
interface Employee{
	abstract void calculateSalary(int a);
}
class FullTimeEmployee implements Employee{
	public void calculateSalary(int a){
		System.out.println( a*12 + " this is your salary");
	}
}
