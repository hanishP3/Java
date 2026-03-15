Let's see if you can wire this up. This will prove you understand how data "flows down" to the child.

Create a class Employee with an int salary = 70000.

Create a class Developer that extends Employee. Add a String bonus = "10k".

Create a class SeniorDev that extends Developer. Add a String stockOptions = "High".

In your main method, create ONLY one object of SeniorDev.

Try to print the salary, the bonus, and the stockOptions using that one object.

Bonus Question: Does the SeniorDev have access to the salary even though it's the "Grandchild" of Employee?