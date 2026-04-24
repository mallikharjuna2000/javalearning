package com.codegnan.exceptions;

public class MarriageEligibilityChecker {
public void checkEligibility(int age) throws TooYoungException, TooOldException {
	if(age<18) {
		throw new TooYoungException("Marrieage Cannot be approvedf. "
				+ "Age is below 18 years");
		}else {
			if(age>60) {
				throw new TooOldException("Marriage Cannot be approved ."
						+ " Age is above 60 years");
			}else {
				System.out.println("Marrieage Approved. Details will be processed soon");
			}
		}
}
	public static void main(String[] args) {
		MarriageEligibilityChecker checker=new MarriageEligibilityChecker();
		try {
			checker.checkEligibility(201);
		} catch (TooYoungException | TooOldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
