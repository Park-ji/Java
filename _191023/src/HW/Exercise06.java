package HW;

public class Exercise06 {
	
	static double sumArea(Shape[] arr) {
		int len = arr.length;
		double sum = 0;
		for(int i=0;i<len;i++) {
			if(arr[i] instanceof Circle) {
				sum += arr[i].calcArea();
			}
			else if(arr[i] instanceof Rectangle) {
				sum+=arr[i].calcArea();
			}
		}
		return sum;
		
	}
	
	public static void main(String[] args)
	{
	Shape[] arr = {new Circle(5.0), new Rectangle(3,4), new Circle(1)};
	System.out.println("면적의 합:"+sumArea(arr));
	}

}
