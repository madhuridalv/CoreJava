package framework;

public  abstract class PrimeAcc extends ShopAcc{
	
	private boolean isPrime;
	private static final float deliveryCharges = 100.0f;

	public PrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges);
		this.isPrime = isPrime;
	}
	
	public boolean isPrime() {
		return isPrime;
		
	}
	public void setPrime(boolean isPrime) {
		this.isPrime = isPrime;
	}
	
	public static float getDeliverycharges() {
		return deliveryCharges;
	}

	public void bookProduct(float charges) {
		System.out.println(" the price of book is : " + (charges + 100.0f));
	}

	@Override
	public String toString() {
		return "PrimeAcc [isPrime=" + isPrime + "]";
	}

}
