package framework;

public abstract class ShopAcc {
	private int accNo;
	private String accNm;
	private float charges;
	
	public ShopAcc(int accNo, String accNm, float charges) {
		super();
		this.accNo = accNo;
		this.accNm = accNm;
		this.charges = charges;
	}
	
	
	
	public int getAccNo() {
		return accNo;
	}



	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}



	public String getAccNm() {
		return accNm;
	}



	public void setAccNm(String accNm) {
		this.accNm = accNm;
	}



	public float getCharges() {
		return charges;
	}



	public void setCharges(float charges) {
		this.charges = charges;
	}

    public void bookProduct( float charges) {
		
		System.out.println(" the price of book is : " + charges);
	}
	
	public void item(float charges) {
		
		System.out.println(" the total price of item with delivery charges is : " + (charges + 100.0f));
	}



	@Override
	public String toString() {
		return "ShopAcc [accNo=" + accNo + ", accNm=" + accNm + ", charges=" + charges + "]";
	}
	
	
	
}
