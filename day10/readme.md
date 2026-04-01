🛡️ The "Hanish Logistics" Challenge
The Scenario: You are building a system for a delivery company. You need to validate the weight of a package before it's loaded onto a plane.

1. Create the Custom Exception
Create a class called OverweightPackageException.

It must extend Exception.

Add a constructor that takes a String message and passes it to super(message).

2. The Logic Method
Create a method: public static void shipPackage(double weight) throws OverweightPackageException.

The Rule: If the weight is greater than 30.0 kg, you must throw your OverweightPackageException with the message: "Package is too heavy for air freight, my man!"

Otherwise, print: "Package cleared for shipping!"

3. The Main Method (The Boss)
Inside main, try to call shipPackage(45.0).

Use a try-catch block to catch your custom exception and print the error message.

Add a finally block that prints: "Log updated for package ID: 101".