package com.practice.function;

import java.util.function.Predicate;
import java.util.regex.Pattern;

public class PredicateToCheckValidMail {

	public static void main(String[] args) {
		Predicate<String> isValidMailPredicate = mail -> {
			String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-z"
					+ "A-Z]{2,7}$";

			Pattern pat = Pattern.compile(emailRegex);
			if (mail == null)
				return false;
			return pat.matcher(mail).matches();
		};
		
		System.out.println(isValidMailPredicate.test("vemulas19@gmail.com"));
		System.out.println(isValidMailPredicate.test("ravi@gmail"));
	}
}
