package com;

public class Driver {
	
	private String category;
	private int driverId;
	private String driverName;
	private double totalDistance;
	
	public Driver() {
		
	}
	
	public Driver(String category, int driverId, String driverName, long totalDistance) {
		this.category = category;
		this.driverId = driverId;
		this.driverName = driverName;
		this.totalDistance = totalDistance;
	}

	public String getCategory() {
		return category;
	}
	
	public int getDriverId() {
		return driverId;
	}
	
	public String getDriverName() {
		return driverName;
	}
	
	public double getTotaldistance() {
		return totalDistance;
	}
	
	public void setCategory(String Category) {
		this.category = Category;
	}
	
	public void setDriverId(int DriverId) {
		this.driverId = DriverId;
	}
	
	public void setDriverName(String DriverName) {
		this.driverName = DriverName;
	}
	
	public void setTotaldistance(double TotalDistance) {
		this.totalDistance = TotalDistance;
	}
	
	@Override
	public String toString() {
		return "Driver [category=" + category + ", driverId=" + driverId + ", driverName=" + driverName
				+ ", totalDistance=" + totalDistance + "]";
	}

}
