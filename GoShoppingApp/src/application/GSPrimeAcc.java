package application;

import framework.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc {
	
	private static final float deliveryCharges = 100.0f;

	public GSPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges, isPrime);
		// TODO Auto-generated constructor stub
	}
	
	
	public void bookProduct(float charges) {
		System.out.println(" Actual price of item (book) is : " + charges);
		System.out.println(" the price of book is (You have to pay with extra charges for prime account): " + (charges + 100.0f));
	}
	
	@Override
	public String toString() {
		return "GSPrimeAcc [isPrime()=" + isPrime() + ", toString()=" + super.toString() + ", getAccNo()=" + getAccNo()
				+ ", getAccNm()=" + getAccNm() + ", getCharges()=" + getCharges() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	
}
