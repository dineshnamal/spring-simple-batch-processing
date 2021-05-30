package com.namal.batch.processing;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
@TestExecutionListeners( { DependencyInjectionTestExecutionListener.class })
@SpringBootTest
class BatchProcessingApplicationTests {

	@Test
	void contextLoads() {
	}
	
	
	@Test 
	public void testEcho() {
		
	}

}
