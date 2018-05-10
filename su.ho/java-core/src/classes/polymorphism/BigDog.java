package classes.polymorphism;

public class BigDog extends Dog {
	@Override
	public void greeting() {
		System.out.println("Big Dog wooooof");
	}
	
	@Override
	public void greeting(Dog another) {
		System.out.println("Big Dog Another Woooffff!!!");
	}
	
	public static void main(String[] args) {
		// subclasses
		Dog dog = new Dog();
		dog.greeting();
		BigDog bigDog = new BigDog();
		bigDog.greeting();
		
		// polymorphism
		Animal animal1 = new Dog();
		animal1.greeting();
		Animal animal2 = new BigDog();
		animal2.greeting();
		
		// Downcast
		Dog dog1 = (Dog) animal1;
		BigDog bigDog1 = (BigDog) animal2;
		dog1.greeting();
		bigDog1.greeting();
		dog.greeting(dog1);
		bigDog1.greeting(bigDog);
	}
}
