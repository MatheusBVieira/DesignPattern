package designPattern.visitor;

public interface ComputerPart {
	public void accept(ComputerPartVisitor computerPartVisitor);

	public class Keyboard implements ComputerPart {

		   public void accept(ComputerPartVisitor computerPartVisitor) {
		      computerPartVisitor.visit(this);
		   }
		}
	
}