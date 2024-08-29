# Project Overview

* This Java project simulates a transportation system, leveraging design patterns such as Singleton and Factory Method. The main components of the system include vehicles, drivers, loads, orders, and a transport project builder.

![delivery-shipping](https://github.com/user-attachments/assets/906dd1c8-6a2c-459d-80a2-8066240885ff)

# Project Requirements:

* The software is designed for a transportation company.
* The company operates four types of vehicles: truck, plane, ship, and train.
* Different types of loads can be carried by the vehicles: dry food, wet food, liquid fuel, and dry fuel.
* The company receives transportation requests between two locations, which are then converted into orders.
* Orders can be created in two forms: prepaid or postpaid. It contains some regulations.
* Each new order, along with its assigned driver and transportation vehicle, is turned into a project and then executed.
* Model the project using Java and apply creational design patterns.

# Design Patterns Used

* Singleton Pattern: Ensures that only one instance of VehicleFactory exists throughout the application.

* Factory Method Pattern: Simplifies the creation of various vehicle types, promoting loose coupling and adherence to the Open/Closed Principle.

* Builder Pattern: Facilitates the construction of complex objects (like TransportProject) by providing a clear and fluent API.

<img width="920" alt="Ekran Resmi 2024-08-29 21 17 08" src="https://github.com/user-attachments/assets/deaffbba-563b-4690-9224-059e15bfe3c9">
