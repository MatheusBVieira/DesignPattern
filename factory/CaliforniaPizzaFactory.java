package designPattern.factory;

public class CaliforniaPizzaFactory implements AbstractFactory<Pizza> {

	@Override
	public Pizza create(PizzaType pizzaType) {
		if(PizzaType.cheese.equals(pizzaType)) {
			return new CheesePizza();
		} else if (PizzaType.greek.equals(pizzaType)) {
			return new GeekPizza();
		} else if (PizzaType.peperoni.equals(pizzaType)) {
			return new PeperoniPizza();
		} else if (PizzaType.veggie.equals(pizzaType)) {
			return new VeggiePizza();
		}
		
		throw new PizzaInexistenteException();
	};
	
}
