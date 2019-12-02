package HW_11ÀÏÂ÷;

class UnsupportedFuctionException extends RuntimeException {
	final private int ERR_CODE = 100;	
	//public UnsupportedFuctionException() {}
	public UnsupportedFuctionException(String message, int ERR_CODE) {
		super(message);
		if(getErrorCode() == ERR_CODE) getMessage();
	}
	public int getErrorCode() {
		return ERR_CODE;
	}
		
	@Override
	public String getMessage() {
		return "["+ERR_CODE+"]" + super.getMessage();
	}

}
