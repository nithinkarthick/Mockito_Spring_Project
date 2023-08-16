package com.udemy.mockito.mockitodemo.business;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SomeBusinessImplTest {

	@Test
	void findTheGreatestFromAllDateBasic() {
		DataServicesStub dataServicesStub = new DataServicesStub();
		
		SomeBusinessImp businessImp = new SomeBusinessImp(dataServicesStub);
		businessImp.findTheGreatestFromAllDate();
		int result = businessImp.findTheGreatestFromAllDate();
		assertEquals(25, result);
	}

}

class DataServicesStub implements DataService{

	@Override
	public int[] retrieveAllData() {
		// TODO Auto-generated method stub
		return new int[] {15,25,11};
	}
	
}