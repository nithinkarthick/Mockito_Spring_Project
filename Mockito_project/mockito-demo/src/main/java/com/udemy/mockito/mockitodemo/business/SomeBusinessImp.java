package com.udemy.mockito.mockitodemo.business;

public class SomeBusinessImp {

	private DataService dataService;
	
	 
	
	public SomeBusinessImp(DataService dataService) {
		super();
		this.dataService = dataService;
	}



	public int findTheGreatestFromAllDate() {
		int[]  data = dataService.retrieveAllData();
		
		int greatestVal = Integer.MIN_VALUE;
				
		for(int value : data) {
			if(value > greatestVal)
				greatestVal = value;
		}
		return greatestVal;
	}

}


interface DataService{
	int[] retrieveAllData();
	
}
