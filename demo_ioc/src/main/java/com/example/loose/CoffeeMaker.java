package com.example.loose;

public class CoffeeMaker {
	private CoffeeMachine  coffeeMachine; //인터페이스 타입
	
	public void setCoffeeMachine(CoffeeMachine coffeeMachine) { //
		this.coffeeMachine = coffeeMachine;
	}
	
	public void makeCoffee() {
		System.out.println( coffeeMachine.brew());
	}
}
