package designPattern.factory;

public interface AbstractFactory<T> {
    T create(PizzaType pizzaType) ;
}
