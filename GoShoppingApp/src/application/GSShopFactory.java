package application;

import framework.NormalAcc;
import framework.PrimeAcc;
import framework.ShopFactory;

public class GSShopFactory extends ShopFactory{

	@Override
	public PrimeAcc getNewPrimeAccount(int accNo, String accNm, float charges, boolean isPrime) {
		// TODO Auto-generated method stub
		PrimeAcc primeacc = new GSPrimeAcc(accNo, accNm, charges, isPrime);
		return primeacc;
	}

	@Override
	public NormalAcc getNewNormalAccount(int accNo, String accNm, float charges, float deliveryCharges) {
		// TODO Auto-generated method stub
		GSNormalAcc normalacc = new GSNormalAcc(accNo, accNm, charges, charges);
		return normalacc;
	}

}
