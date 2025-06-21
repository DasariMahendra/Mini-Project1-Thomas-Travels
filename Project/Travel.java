package com;

import java.util.*;

public class Travel {

	public boolean isCarDriver(Driver driver) {
		
		return (driver.getCategory().equalsIgnoreCase("Car"));
	}
	
	public String RetrieveDriverId(ArrayList<Driver> drivers, int driverid) {
		
		//for(Driver driver : drivers) {
		//	if(driver.getDriverId() == driverid) {
		//		return "Driver name is " +driver.getDriverName() + " belonging to the Category " +driver.getCategory() + " travelled " +driver.getTotaldistance()+"Km so far";
		//	}
		//}
		//return "Driver not found";
		
		return drivers
				.stream()
				.filter(d -> d.getDriverId() == driverid)
				.findFirst()
				.map(d ->String.format("Driver %s", d.getCategory()))
				.orElse("Driver not found");
	}
	
	public long RetrieveCountOfDriver(ArrayList<Driver> drivers, String category) {
		
		//int count = 0;
		//for(Driver driver : drivers) {
		//	if(driver.getCategory().equalsIgnoreCase(category)) {
		//		count++;
		//	}
		//}
		//return count;
		
		return drivers
				.stream()
				.filter(d  -> d.getCategory().equalsIgnoreCase(category))
				.count();
		
	}
	
	public List<Driver> RetrieveDriver(ArrayList<Driver> drivers, String category) {
		
		//ArrayList<Driver> result = new ArrayList<Driver>();
		//for(Driver driver : drivers) {
		//	if(driver.getCategory().equalsIgnoreCase(category)) {
		//		result.add(driver);
		//	}
		//}
		//return result;
		
		return drivers
				.stream()
				.filter(d  -> d.getCategory().equalsIgnoreCase(category))
				.toList();
	}
	
	public Driver RetrieveMaximumDistanceTravelledDriver(ArrayList<Driver> drivers) {
		
		//Driver maxDriver = drivers.get(0);
		//for(Driver driver : drivers) {
		//	if(driver.getTotaldistance() > maxDriver.getTotaldistance()) {
		//		maxDriver = driver;
		//	}
		//}
		//return maxDriver;
		
		return drivers
				.stream()
				.sorted((d1, d2)-> Double.compare(d2.getTotaldistance(), d1.getTotaldistance()))
				.findFirst()
				.get();
		
	}
}
