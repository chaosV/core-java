package com.qk19;

public class TestDrink {

	public void  Drinker(DrinkType drinktype) {
		if (drinktype == DrinkType.beer) {
			System.out.println(Beer.dBeer());
		} else if (drinktype == DrinkType.milk) {
			System.out.println(Milk.dMilk());
		}else if(drinktype == DrinkType.coffee){
			System.out.println(Coffee.DCoffee());
		
		}
	}

	public static void main(String[] args) {
		TestDrink td = new TestDrink();
		td.Drinker(DrinkType.beer);
		td.Drinker(DrinkType.coffee);
		td.Drinker(DrinkType.milk);

	}

}
