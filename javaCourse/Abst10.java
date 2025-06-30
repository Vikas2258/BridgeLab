class Abst10{
	//Create an abstract class Question with method displayQuestion().
	//Extend it to MCQQuestion and TrueFalseQuestion.
	public static void main(String[] args){
		MCQQuestion m = new MCQQuestion();
		TrueFalseQuestion t = new TrueFalseQuestion();
		m.displayQuestion();
		t.displayQuestion();
		
	}
}
abstract class Question{
	abstract void displayQuestion();
}
class MCQQuestion extends Question{
	void displayQuestion(){
		System.out.println("this is mcq ");
	}
}
class TrueFalseQuestion extends Question{
	void displayQuestion(){
		System.out.println("this is true and false");
	}
}

