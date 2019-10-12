package org.testing.assertion;

public class Assert1 {
	public static boolean Assert1(String exp, String act) {
		if(exp.equals(act.trim())) {
			System.out.println("Match successfully");
			return true;
		}
		System.out.println("didn't match");
		return false;
	}

}
