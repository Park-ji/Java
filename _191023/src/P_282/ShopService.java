package P_282;

public class ShopService {
	private ShopService() {}
	public static ShopService ss = new ShopService();
	static ShopService getInstance(){
		return ss;
	}

}
