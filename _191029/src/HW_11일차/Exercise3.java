package HW_11일차;

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
			throw new StockShortageException("재고가 부족합니다.");
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