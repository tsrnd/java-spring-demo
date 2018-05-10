package classes.polymorphism;

public class Dog extends Animal {
	@Override
	public void greeting() {
		System.out.println("Dog Wooof Woooooof~~~!!!!");
	}
	
	public void greeting(Dog another) {
		System.out.println("Dog Another Woooooooooooooooof~~~");
	}
}
