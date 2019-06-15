package io.mcbrayer.fa7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;


@RunWith(JUnitPlatform.class)
public class SimpleUnitTest {
	@Test
	@DisplayName("Sinple JUnit test, just to make sure framework is working")
	void firstTEst() {
		assertTrue(true);
	}

}
