package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyProgramTest {

	@Test
	void ConcatTwoWordsShouldReturnConcatedResult() {
		GeneralFunctions sut = new GeneralFunctions();
		String result = sut.Concatenate("One", "Two");
		
		assertEquals("OneTwo", result);
	}

	@Test
	void MultiplyTwoValuesShouldReturnMultipliedResult() {
		GeneralFunctions sut = new GeneralFunctions();
		int result = sut.Multiply(2,2);
		
		assertEquals(4, result);
	}
	
	@Test
	void CreateObjectAccountShouldSetProperties() {
		Account sut = new Account(123);
		
		assertEquals(sut.AccountNumber,123);
		
		
	}
}

