package com.udemy.mockito.mockitodemo.business;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class SomeBusinessImplMockTest {

	@Mock
	private DataService dataServiceMock;
	
	@InjectMocks
	private SomeBusinessImp businessImp;
	
	
	@Test
	void findTheGreatestFromAllDateBasic() {
		
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {25,12,2});
		assertEquals(25, businessImp.findTheGreatestFromAllDate());
	}
	
	@Test
	void findTheGreatestFromAllDateBasic_one() {
		
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {100});
		assertEquals(100, businessImp.findTheGreatestFromAllDate());
	}
	

}
