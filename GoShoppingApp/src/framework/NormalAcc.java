package framework;

public  abstract class NormalAcc extends ShopAcc {
	
	private final float deliveryCharges;

	public NormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
		super(accNo, accNm, charges);
		this.deliveryCharges = deliveryCharges;
	}
	
	
	public float getDeliveryCharges() {
		return deliveryCharges;
	}


	public void bookProduct(float deliveryCharges) {
		
		System.out.println(" Delivery Charges is : " + deliveryCharges);
		
	}

	@Override
	public String toString() {
		return "NormalAcc [deliveryCharges=" + deliveryCharges + "]";
	}
	
}
