package designPattern.interpreter;

public class InterpreterPatternDemo {

	public static Expression getMaleExpression() {
		TerminalExpression robert = new TerminalExpression("Robert");
		TerminalExpression john = new TerminalExpression("John");
		
		return new OrExpression(robert, john);
	}
	
	public static Expression getMarriedWomanxpression() {
		TerminalExpression julie = new TerminalExpression("Julie");
		TerminalExpression married = new TerminalExpression("Married");
		
		return new OrExpression(julie, married);
	}
	
	public static void main(String[] args) {
		Expression isMale = getMaleExpression();
		Expression isMarriedWoman = getMarriedWomanxpression();
		
		System.out.println("John is male? " + isMale.interpret("John"));
		System.out.println("Julie is married woman? " + isMarriedWoman.interpret("Married Julie"));
	}
	
	
}
