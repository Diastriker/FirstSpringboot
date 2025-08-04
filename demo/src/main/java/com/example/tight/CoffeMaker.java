package com.example.tight;

public class CoffeMaker {
//	private EspressoMachine espressoMachine;
	private DripCoffeMachine dripCoffeeMachine;
	public CoffeMaker() {
//		this.espressoMachine = new EspressoMachine();
		this.dripCoffeeMachine = new DripCoffeMachine();
	}
	public void makeCoffe () {
//		System.out.println(espressoMachine.brew());
		System.out.println(dripCoffeeMachine.brew());
	}
}
