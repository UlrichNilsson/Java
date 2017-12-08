package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConcatTest {

	@Test
	void test() {
		Junit sut = new Junit();
		String result = sut.Concatenate("One", "Two");
		
		assertEquals("OneTwo", result);
	}

}
