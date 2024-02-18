package client;

import application.GSNormalAcc;
import application.GSPrimeAcc;
import application.GSShopFactory;
import framework.NormalAcc;
import framework.PrimeAcc;
import framework.ShopFactory;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShopFactory sf = new GSShopFactory();
		
		PrimeAcc pa = new GSPrimeAcc(101, "Madhuri", 395.0f, false);
		pa.bookProduct(pa.getCharges());
		pa.toString();
		
		NormalAcc na = new GSNormalAcc(201, "Dalvi", 250.0f, 59.0f);
		na.bookProduct(na.getDeliveryCharges());
		na.toString();
	}

}
