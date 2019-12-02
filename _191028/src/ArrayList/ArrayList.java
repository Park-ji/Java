package ArrayList;

public class ArrayList {
	int size = 4;
	int a[];
	int idx = 0;

	public int[] add(int val) {
		if (idx == 0)
			a = new int[size];
		idx = 1;
		int cnt = 0;
		for (int i = 0; i < size; i++) {
			if (a[i] == 0)
				cnt++;
		}
		if (cnt == 0)
			size++;
		int tmp[] = new int[a.length];
		for (int i = 0; i < tmp.length; i++) {
			tmp[i] = a[i];
		}
		a = new int[size];
		for (int i = 0; i < tmp.length; i++) {
			a[i] = tmp[i];
		}
		for (int i = 0; i < size; i++) {
			if (a[i] != 0)
				continue;
			a[i] = val;
			break;
		}
		return a;
	}

	void delete(int pos) {
		int tmp[] = new int[size];
		int idx = 0;
		a[pos] = 0;
		for (int i = 0; i < size; i++) {
			if (a[i] == 0)
				continue;
			tmp[idx] = a[i];
			a[i] = 0;
			idx++;
		}
		for (int i = 0; i < size; i++) {
			a[i] = tmp[i];
		}
	}

	void print() {
		for (int i = 0; i < size; i++) {
			if (a[i] == 0)
				break;
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

}
