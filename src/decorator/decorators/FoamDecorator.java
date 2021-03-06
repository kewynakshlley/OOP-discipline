package decorator.decorators;

import decorator.Drink;

public class FoamDecorator extends DrinkDecorator{
	public FoamDecorator(Drink drink){
		super.drink = drink;
		super.decoratorDescription = "Foam";
	}

	@Override
	public String getDescription() {
		return drink.getDescription() + " with " + decoratorDescription;
	}

	@Override
	public double getCost() {
		return drink.getCost() + 1;
	}

}
