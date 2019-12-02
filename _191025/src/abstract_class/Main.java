package abstract_class;

public class Main {
	public static void main(String[] args) {
		
		//Animal animal = new Animal();//error! : �߻�ȭ Ŭ������ ��ü�� ������� ����
		
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		animalSound(cat);
		animalSound(dog);
		animalSound(new Dog());//���⼭ ��� dog�� ������ ���� dog�� �ٸ�~
		
	}
	
	public static void animalSound(Animal a) {
		//Animal�� abstract class�̹Ƿ� --> ��ü�� ������
		//�׷��ٸ�! input������ ���� ���� Animal�� ��ӹ��� ���� ������!
		a.Sound();
	}

}
