
Your Task:
Write a program that has one try block but tries to do two dangerous things:

The Math Error: int result = 10 / 0;

The Array Error: Create an array int[] prices = {100, 200}; and then try to print prices[5].

Requirements:

Create a specific catch for ArithmeticException.

Create a specific catch for ArrayIndexOutOfBoundsException.

Add a final "Catch-All" at the bottom using the general Exception class (just in case).

Add a finally block to print: "System check complete."