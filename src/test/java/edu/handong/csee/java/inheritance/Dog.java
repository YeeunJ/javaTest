package edu.handong.csee.java.inheritance;

public class Dog extends Animal {
	private String dog;
	
	public static void testClassMethod() {
		System.out.println("The static method in Dog");
	}
	
	public void testInstanceMethod() {
		System.out.println("The instance method in Dog");
	}
	
	public void setDog(String var) {
		dog = var;
	}
	public String getDog() {
		return dog;
	}
	
	public static void main(String[] args) {
		Dog myDog = new Dog();
		Animal myAnimal = myDog;
		Cat myCat = new Cat();
		Animal myAnimal2 = myCat;
		Animal.testClassMethod();
		myAnimal.testInstanceMethod(); //오버라이딩
		myAnimal2.testInstanceMethod();
		myDog.setDog("John");//은닉화
		myDog.getDog();//은닉화
		//이렇게 오버라이딩 하는 것을 다형성이라고 
	}
}

