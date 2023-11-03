package org.tnsif.assignmentFour;
public class Application {

	public static void main(String[] args) {

		BankFactory bFactory=new MMBankFactory();
		SavingAcc sAcc=bFactory.getNewSavingAcc(101, "Sumit", 4000, true);
		CurrentAcc cAcc=bFactory.getNewCurrentAcc(102, "Mohit", 6000, 5000);
		sAcc.getAccBal();
		
		System.out.println("Before Withdraw Balance:");
		System.out.println("Saving Acc:"+sAcc.getAccBal());
		System.out.println("Current Acc:"+cAcc.getAccBal());
		System.out.println("-------------------------------------------------");
		sAcc.withdraw(2000);
		cAcc.withdraw(3000);
	}

}
