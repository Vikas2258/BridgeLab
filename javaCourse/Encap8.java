class Encap8{
	public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.setLength(5);
        rect.setWidth(10);
        
        
        double area = rect.calculateArea();
        System.out.println("Area of rectangle: " + area);
        
        
        rect.setLength(-5);  // Invalid
        rect.setWidth(-10);   // Invalid
    }
}
class Rectangle {
    
    private double length;
    private double width;
	public double getlength(){
		return length;
	}
	public double getwidth(){
		return width;
	}
    public void setLength(double length) {
        if (length > 0) {
            this.length = length;
        } else {
            System.out.println("Length must be positive.");
        }
    }
    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        } else {
            System.out.println("Width must be positive.");
        }
    }
    public double calculateArea() {
        return length * width;
    }
    
}
