package client;

import application.MMCurrentAcc;
import application.MMSavingAcc;
import application.MMBankFactory;
import framework.BankFactory;
import framework.CurrentAcc;
import framework.SavingAcc;

public class Client {

	public static void main(String[] args) {
		BankFactory bf = new MMBankFactory();
		
		SavingAcc sa = new MMSavingAcc(345432344, "Apurva", 4000, false);
		sa.withdraw(sa.getAccBal());
		sa.toString();
		
		CurrentAcc ca = new MMCurrentAcc(543452344, "Ritesh", 50000, 10000);
		ca.withdraw(ca.getCreditLimit());
		ca.toString();

	}

}