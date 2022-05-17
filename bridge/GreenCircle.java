package designPattern.bridge;

public class GreenCircle implements DrawApi {

	@Override
	public void drawCircle(int radius, int x, int y) {
		System.out.println("Drawing circle[ color: green, radius: "+ radius + ", x: " + x + ", " + y + "]");
	}
	
	

}
