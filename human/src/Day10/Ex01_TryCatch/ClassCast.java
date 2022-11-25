package Day10.Ex01_TryCatch;

class Animal {}

class Dog extends Animal { }

class Cat extends Animal { }

public class ClassCast {

	// Dpg, Cat --> Animal
	// Animal = Cat 경우는 다시 Dog 변환 불가
	// - Cat을 Dog 으로 타입변환할 수 없다.
	public static void changeDog(Animal animal) {
		// java,lang.ClassCastException
		Dog dog = (Dog) animal;
	}
	
	public static void main(String[] args) {
		Dog dog = new Dog();
		changeDog(dog);
		
		Cat cat = new Cat();
		changeDog(cat);		// cat 이 인자로 전달된 경우, (Dog)으로 변환 불가
	}
}
