package HW;

class Unit{
	int x,y;
	void move(int x, int y) {}
	void stop() {}
}

class Marine extends Unit { // ����
void stimPack() { /* �������� ����Ѵ�.*/}
}

class Tank extends Unit { // ��ũ
void changeMode() { /* ���ݸ�带 ��ȯ�Ѵ�. */}
}

class Dropship extends Unit { // ���ۼ�
void load() { /* ���õ� ����� �¿��.*/ }
void unload() { /* ���õ� ����� ������.*/ }
}