package HW;

class SutdaDeck {
	final int CARD_NUM = 30;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];

	SutdaDeck() {
		for (int i = 0; i < cards.length; i++) {
			int card_num = i + 1;
			int num = 0;
			if (card_num % 10 == 0)
				num = (i + 1) / 10;
			else
				num = (i + 1) % 10;

			boolean isKwang = (num == 3 || num == 6 || num == 9);
			cards[i] = new SutdaCard(card_num, isKwang);
		}
	}
}

class SutdaCard {
	int num;
	boolean isKwang;

	SutdaCard() {
		this(1, true);
	}

	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}

// info()대신 Object클래스의 toString()을 오버라이딩했다.
	public String toString() {
		return num + (isKwang ? "K" : "");
	}
}

public class ClassAa {
	public static void main(String args[]) {
		SutdaDeck deck = new SutdaDeck();
		for (int i = 0; i < deck.cards.length - 1; i++)
			System.out.print(deck.cards[i] + ",");
		System.out.print(deck.cards[deck.cards.length - 1]);
	}
}
