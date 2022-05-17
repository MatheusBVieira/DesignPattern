package designPattern.command;

public class SellStock implements Order {

	private Stock abcStock;

	public SellStock(Stock abcStok) {
		 this.abcStock = abcStok;
	}

	public void execute() {
		abcStock.sell();
	}

}
