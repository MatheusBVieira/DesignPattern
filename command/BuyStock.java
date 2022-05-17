package designPattern.command;

public class BuyStock implements Order{

	private Stock abcStock;
	
	public BuyStock(Stock abcStok) {
		 this.abcStock = abcStok;
	}
	
	public void execute() {
		abcStock.buy();
	}
}
