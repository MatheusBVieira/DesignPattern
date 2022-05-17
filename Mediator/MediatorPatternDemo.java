package designPatterns.Mediator;

public class MediatorPatternDemo {

	public static void main(String[] args) {
		
		User rober = new User("Robert");
		
		User jonh = new User("John");
		
		rober.sendMessage("Hi, John");
		
		jonh.sendMessage("Hello, Rober");
	}
}
