package com.bridgelab.day23problem.uservalidation;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.bridgelab.day23problem.uservalidation.InvalidEntryException;
import com.bridgelab.day23problem.uservalidation.InvalidEntryException.ExceptionType;
import com.bridgelab.day23problem.uservalidation.UserValidation;

public class UserValidationTest {

	@Test
	public void whenGivenFirstNameEMPTY_ShouldThrowCustomException_WithTypeENTERED_EMPTY() {
		UserValidation validator = new UserValidation();
		try {
			validator.firstName.validate("");
		} catch (InvalidEntryException e) {
			assertEquals(ExceptionType.ENTERED_EMPTY, e.type);
		}
	}

	@Test
	public void whenGivenFirstNameNULL_ShouldThrowCustomException_WithTypeENTERED_NULL() {
		UserValidation validator = new UserValidation();
		try {
			validator.firstName.validate(null);
		} catch (InvalidEntryException e) {
			assertEquals(ExceptionType.ENTERED_NULL, e.type);
		}
	}

	@Test
	public void whenGivenFirstNameWRONG_ShouldThrowCustomException_WithTypeENTERED_WRONG() {
		UserValidation validator = new UserValidation();
		try {
			validator.firstName.validate("amit");
		} catch (InvalidEntryException e) {
			assertEquals(ExceptionType.ENTERED_WRONG, e.type);
		}
	}

	@Test
	public void whenGivenLastNameEMPTY_ShouldThrowCustomException_WithTypeENTERED_EMPTY() {
		UserValidation validator = new UserValidation();
		try {
			validator.lastName.validate("");
		} catch (InvalidEntryException e) {
			assertEquals(ExceptionType.ENTERED_EMPTY, e.type);
		}
	}

	@Test
	public void whenGivenLastNameNULL_ShouldThrowCustomException_WithTypeENTERED_NULL() {
		UserValidation validator = new UserValidation();
		try {
			validator.lastName.validate(null);
		} catch (InvalidEntryException e) {
			assertEquals(ExceptionType.ENTERED_NULL, e.type);
		}
	}

	@Test
	public void whenGivenLastNameWRONG_ShouldThrowCustomException_WithTypeENTERED_WRONG() {
		UserValidation validator = new UserValidation();
		try {
			validator.lastName.validate("sisodiya");
		} catch (InvalidEntryException e) {
			assertEquals(ExceptionType.ENTERED_WRONG, e.type);
		}
	}

	@Test
	public void whenGivenMobileNumberEMPTY_ShouldThrowCustomException_WithTypeENTERED_EMPTY() {
		UserValidation validator = new UserValidation();
		try {
			validator.mobileNumber.validate("");
		} catch (InvalidEntryException e) {
			assertEquals(ExceptionType.ENTERED_EMPTY, e.type);
		}
	}

	@Test
	public void whenGivenMobileNumberNULL_ShouldThrowCustomException_WithTypeENTERED_NULL() {
		UserValidation validator = new UserValidation();
		try {
			validator.mobileNumber.validate(null);
		} catch (InvalidEntryException e) {
			assertEquals(ExceptionType.ENTERED_NULL, e.type);
		}
	}

	@Test
	public void whenGivenMobileNumberWRONG_ShouldThrowCustomException_WithTypeENTERED_WRONG() {
		UserValidation validator = new UserValidation();
		try {
			validator.mobileNumber.validate("5264264");
		} catch (InvalidEntryException e) {
			assertEquals(ExceptionType.ENTERED_WRONG, e.type);
		}
	}

	@Test
	public void whenGivenEmailEMPTY_ShouldThrowCustomException_WithTypeENTERED_EMPTY() {
		UserValidation validator = new UserValidation();
		try {
			validator.email.validate("");
		} catch (InvalidEntryException e) {
			assertEquals(ExceptionType.ENTERED_EMPTY, e.type);
		}
	}

	@Test
	public void whenGivenEmailNULL_ShouldThrowCustomException_WithTypeENTERED_NULL() {
		UserValidation validator = new UserValidation();
		try {
			validator.email.validate(null);
		} catch (InvalidEntryException e) {
			assertEquals(ExceptionType.ENTERED_NULL, e.type);
		}
	}

	@Test
	public void whenGivenEmailWRONG_ShouldThrowCustomException_WithTypeENTERED_WRONG() {
		UserValidation validator = new UserValidation();
		try {
			validator.email.validate("amit@gmail@.com.com");
		} catch (InvalidEntryException e) {
			assertEquals(ExceptionType.ENTERED_WRONG, e.type);
		}
	}

	@Test
	public void whenGivenPasswordEMPTY_ShouldThrowCustomException_WithTypeENTERED_EMPTY() {
		UserValidation validator = new UserValidation();
		try {
			validator.password.validate("");
		} catch (InvalidEntryException e) {
			assertEquals(ExceptionType.ENTERED_EMPTY, e.type);
		}
	}

	@Test
	public void whenGivenPasswordNULL_ShouldThrowCustomException_WithTypeENTERED_NULL() {
		UserValidation validator = new UserValidation();
		try {
			validator.password.validate(null);
		} catch (InvalidEntryException e) {
			assertEquals(ExceptionType.ENTERED_NULL, e.type);
		}
	}

	@Test
	public void whenGivenPasswordWRONG_ShouldThrowCustomException_WithTypeENTERED_WRONG() {
		UserValidation validator = new UserValidation();
		try {
			validator.password.validate("amit12");
		} catch (InvalidEntryException e) {
			assertEquals(ExceptionType.ENTERED_WRONG, e.type);
		}
	}
}
