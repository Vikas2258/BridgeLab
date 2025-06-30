class Encap7{
	public static void main(String[] args) {
        Temperature temp = new Temperature();
        temp.setTemperature(25);

        double fahrenheit = temp.toFahrenheit(); 
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
    }
	
}
class Temperature {
    private double celsius;
    public void setTemperature(double celsius) {
        this.celsius = celsius;
    }
    public double toFahrenheit() {
        return (celsius * 9/5) + 32;
    }

    
}
