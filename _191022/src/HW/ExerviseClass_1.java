package HW;

public class ExerviseClass_1 {

	public static int max(int[] arr) {
		if (arr != null) {
			if (arr.length == 0)
				return -999999;
			else {
				int maxValue = arr[0];
				int i = 1;
				while (i < arr.length) {
					if (arr[i] > maxValue) {
						maxValue = arr[i];
						//maxIdx = i;
					}
					i++;
				}
				return maxValue;
			}
		}
		return -999999;
	}

	public static int abs(int value) {
		return ((value < 0) ? -value : value);
	}

	public static void main(String[] args) {
		int[] data = { 3, 2, 9, 4, 7 };
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("�ִ밪:" + max(data));
		System.out.println("�ִ밪:" + max(null));
		System.out.println("�ִ밪:" + max(new int[] {})); // ũ�Ⱑ 0�� �迭
		int value = 5;
		System.out.println(value + "�� ���밪:" + abs(value));
		value = -10;
		System.out.println(value + "�� ���밪:" + abs(value));
	}
}
