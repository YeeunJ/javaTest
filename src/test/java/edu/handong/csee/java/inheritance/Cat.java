package edu.handong.csee.java.inheritance;

public class Cat extends Animal{
	/*오버라이딩은 메서드의 재정의
	 * 부모 클래스의 메서드를 같은 리턴 타입, 이름, 매개변수를 갖고 있는 메서드로 자식 클래스에서 재정의 하는 것
	 * 아래 testClassMethod(), testInstanceMethod()
	 * 메소드 오버라이딩해서 사용하는 것을 다형성이라고 함!!
	 */
	public static void testClassMethod() {
		System.out.println("The static method in Cat");
	}
	
	public void testInstanceMethod() {
		System.out.println("The instance method in Cat");
	}

	public static void main(String[] args) {
		Cat myCat = new Cat();
		Animal myAnimal = myCat;
		Animal.testClassMethod();
		myAnimal.testInstanceMethod();
	}

}
