package HW_9ÀÏÂ÷;

public class FlyerMain {
	public static void main(String[] args) {
		System.out.println(Flyer.fast);
		Bird b = new Bird();
		FlyerUtil.show(b);

		Airplane ap = new Airplane();
		ap.fly();
		FlyerUtil.show(ap);
		Flyer f = new Bird();
		f.fly();
		System.out.println(f.isAnimal());
		FlyerUtil.show(f);
		Bird bf = (Bird)f;
		FlyerUtil.show(bf);
		} 
}
