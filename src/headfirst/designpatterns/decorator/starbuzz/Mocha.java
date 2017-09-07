package headfirst.designpatterns.decorator.starbuzz;

public class Mocha extends CondimentDecorator {
 
	public Mocha(Beverage beverage) {
		super.CondimentDecorator(beverage);
	}
 
	public String getDescription() {
		return wrappedBeverage.getDescription() + ", Mocha";
	}
 
	public double cost() {
		return .20 + wrappedBeverage.cost();
	}
}
