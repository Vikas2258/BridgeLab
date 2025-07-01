class Abst4{
	//Create an abstract class Animal with an abstract method makeSound().
	//Extend it to Dog and Cat, each with their own implementation of makeSound().
	public static void main(String[] args){
		Dog d = new Dog();
		Cat c = new Cat();
		d.makeSound();
		c.makeSound();
		
	}
}
interface Animal{
	abstract void makeSound();
}

class Dog implements Animal{
	public void makeSound(){
		System.out.println("Hi! I am Dog");
	}
}
class Cat implements Animal{
	public void makeSound(){
		System.out.println("Hi! I am car");
	}
}
