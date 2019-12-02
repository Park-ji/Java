package abstract_class;

public class Main {
	public static void main(String[] args) {
		
		//Animal animal = new Animal();//error! : 추상화 클래스는 객체로 만들수가 없다
		
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		animalSound(cat);
		animalSound(dog);
		animalSound(new Dog());//여기서 우는 dog는 위에서 오는 dog랑 다름~
		
	}
	
	public static void animalSound(Animal a) {
		//Animal이 abstract class이므로 --> 객체는 못만듦
		//그렇다면! input값으로 들어가는 것은 Animal을 상속받은 것이 들어갈것임!
		a.Sound();
	}

}
