# 🚗 Thomas-Travels

## 📘 Java Mini Project | FLM

Thomas Travels is a fictional transport service company looking to **automate their driver data management** system. This mini project helps store and manage details about drivers (Auto, Car, Lorry), and perform various queries such as filtering by category, retrieving by ID, and finding the driver who traveled the most.

---

## ✨ Features

- ✅ Add and manage driver records
- 🚙 Check if a driver is a **Car** driver
- 🧑‍💼 Retrieve driver details by **Driver ID**
- 📊 Get the **count of drivers** in a given category
- 📋 Get a **list of drivers** by category
- 🏆 Identify the driver who **traveled the maximum distance**

---

## 🧑‍💻 Classes Overview

### 🔹 `Driver.java`

Represents a driver with the following attributes:

- `int driverId`
- `String driverName`
- `String category` (Auto / Car / Lorry)
- `int totalDistance`

---

### 🔹 `Travel.java`

Contains static utility methods to manage and search drivers:

- `boolean isCarDriver(Driver d)`  
  Returns `true` if the given driver belongs to the "Car" category.

- `String retriveByDriverId(ArrayList<Driver> list, int driverId)`  
  Searches for a driver by ID and returns a formatted string like:  
  > Driver name is **Sudhagar** belonging to the category **Car** traveled **4200 KM** so far.

- `int retriveCountOfDriver(ArrayList<Driver> list, String category)`  
  Returns the count of drivers belonging to a specific category.

- `ArrayList<Driver> retriveDriver(ArrayList<Driver> list, String category)`  
  Returns a list of drivers who belong to the specified category.

- `Driver retriveMaximumDistanceTravelledDriver(ArrayList<Driver> list)`  
  Returns the driver who has traveled the **maximum distance**.

  ---
  

👇 Driver Class Design

 ![Screenshot 2025-06-21 153713](https://github.com/user-attachments/assets/ca1f4623-187b-4397-8b4d-89e66b6577ae)

 👇 Travel Class Design

  ![Screenshot 2025-06-21 154157](https://github.com/user-attachments/assets/9bf29442-5bb2-4ffb-bad1-9f7b47fc77e0)
