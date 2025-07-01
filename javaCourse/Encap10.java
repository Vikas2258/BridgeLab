class Encap10{
	public static void main(String[] args) {
        Circle circle = new Circle();
        
        circle.setRadius(5);
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area of the circle: " + circle.getArea());
        
        circle.setRadius(-3);  
    }
}
class Circle {
    
    private double radius;
    public void setRadius(double radius) {
        if (radius >= 0) {
            this.radius = radius;
        } else {
            System.out.println("Radius cannot be negative.");
        }
    }
    public double getRadius() {
        return radius;
    }
    public double getArea() {
        return Math.PI * radius * radius; // Formula: Area = π * r^2
    }
    
}


