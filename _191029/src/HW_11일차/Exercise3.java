package HW_11����;

class GoodsStock {
	String goodsCode;
	int stockNum;

	GoodsStock(String code, int num) {
		goodsCode = code;
		stockNum = num;
	}

	void addStock(int amount) {
		stockNum += amount;
	}

	int subtractStock(int amount) throws StockShortageException {
		if (stockNum < amount)
			throw new StockShortageException("��� �����մϴ�.");
		stockNum -= amount;
		return amount;
	}
}

class StockShortageException extends Exception {
	public StockShortageException() {
		// TODO Auto-generated constructor stub
	}
	public StockShortageException(String message) {
		super(message);
	}
	
}