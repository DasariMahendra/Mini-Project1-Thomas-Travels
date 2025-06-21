# Thomas-Travels
Java Mini Project | FLM

Thomas Travels wants to collect and automate their customer travel service process. Each driver in the thomas travels has following attributes.
 1. Id of the driver
 2. Name of the driver
 3. Category of the driver (Auto/Car/Lorry)
 4. Total distance he traveled

 Create a class called Driver as shown below: 

 
 ![Screenshot 2025-06-21 153713](https://github.com/user-attachments/assets/ca1f4623-187b-4397-8b4d-89e66b6577ae)

 Create a class called Travel as shown below:

 
 ![Screenshot 2025-06-21 154157](https://github.com/user-attachments/assets/9bf29442-5bb2-4ffb-bad1-9f7b47fc77e0)


 • isCarDriver (Driver) : This method will check whether the given Driver class object is belonging to the category “Car”. 
 It will return true if the given Driver object is of category “Car” else return false.
 
 • RetrivebyDriverId (ArrayList<Driver>,driverID) : This method will search the given driverId in the arraylist and returns the String in the following format
 Driver name is <driverName> Belonging to the category <category> traveled <totalDistance> KM so far.   
 Example: Driver name is Sudhagar belonging to the category Car traveled 4200 KM so far.  
 
• RetriveCountOfDriver (ArrayList<Driver>,String) : This method will  category of driver and an arraylist of driver as input and search for an category and returns the count of drivers.
 
 • RetriveDriver (ArrayList<Driver>,String) : This method will  category of driver and an arraylist of driver as input and search for an category. and drivers who are belonging to that category should be return as a array list.
 
 • RetriveMaximumDistanceTravelledDriver (ArrayList<Driver>) : This method will return the driver who traveled maximum distance
