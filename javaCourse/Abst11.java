class Abst11{
	//Create an abstract class Logger with an abstract method log(String message). 
	//Implement FileLogger and ConsoleLogger.
	public static void main(String[] args){
		FileLogger f = new FileLogger();
		ConsoleLogger c = new ConsoleLogger();
		f.log();
		c.log();
	}
}
interface Logger{
	abstract void log();
}
class FileLogger implements Logger{
	public void log(){
		System.out.println("this is a String message");
	}
}
class ConsoleLogger implements Logger{
	public void log(){
		System.out.println("This is another String message");
	}
}
