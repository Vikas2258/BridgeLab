class Encap6{
	 public static void main(String[] args) {
        Employee emp = new Employee(101, 50000);
        emp.displayInfo();

        emp.applyBonus(5000);
        System.out.println("After applying bonus:");
        emp.displayInfo();
    }
}
class Employee {
    
    private int id;
    private double salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
	
    public void applyBonus(double bonusAmount) {
        this.salary += bonusAmount;
    }

    
    public void displayInfo() {
        System.out.println("Employee ID: " + id);
        System.out.println("Salary: ₹" + salary);
    }
   
}
