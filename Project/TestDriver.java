package com;

import java.util.*;

public class TestDriver {

	public static void main(String[] args) {
		ArrayList<Driver> drivers = new ArrayList<Driver>();

		 drivers.add(new Driver("Car", 101, "Sudhagar", 4200));
	     drivers.add(new Driver("Auto", 102, "Arun", 3100));
	     drivers.add(new Driver("Car", 103, "Venkat", 2800));
         drivers.add(new Driver( "Lorry", 104, "Ravi", 6000));
         drivers.add(new Driver( "Car", 105, "Kumar", 1500));
	
         Travel travel = new Travel();
         
         //Test isCarDriver
         System.out.println("Is Car Driver: " + travel.isCarDriver(drivers.get(0)));
         
         //Test RetrieveDriverId
         System.out.println(travel.RetrieveDriverId(drivers, 101));
         
         //Test RetrieveCountOFDriver
         System.out.println("Car Driver Count: " +travel.RetrieveCountOfDriver(drivers, "Car"));
         
         // Test retriveDriver
         List<Driver> carDrivers = travel.RetrieveDriver(drivers, "Car");
         System.out.println("Drivers in Car Category:");
         for (Driver d : carDrivers) {
             System.out.println(d);
         }
         
         //Test RetrieveMaximumDistanceTravelledDriver
         Driver maxDriver = travel.RetrieveMaximumDistanceTravelledDriver(drivers);
         System.out.println("Driver Travelled maximum distance: " +maxDriver);
	}

}
