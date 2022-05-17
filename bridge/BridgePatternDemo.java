package designPattern.bridge;

public class BridgePatternDemo {
	public static void main(String[] args) {
		Circle redCircle = new Circle(new RedCircle(), 100, 10, 100);
		Circle greenCircle = new Circle(new GreenCircle(), 100, 10, 100);
		
		redCircle.draw();
		greenCircle.draw();
	}
}
