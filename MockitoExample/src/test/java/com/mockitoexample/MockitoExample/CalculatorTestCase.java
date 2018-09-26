package com.mockitoexample.MockitoExample;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;

public class CalculatorTestCase {

Addition a=Mockito.mock(Addition.class);
Calculator c=new Calculator(a);

	@Test
	public void calculatorTest() {
		when(a.add(2, 3)).thenReturn(5);
		assertEquals(7,c.perform(2,3) );
		
	}

	

}
