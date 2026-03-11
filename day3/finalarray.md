Here is the goal: You have a list of approved VIP cards. You need to check if a visitor's card is in that list. If it is, tell them exactly where their entry record is (the index).

Code Requirements:

Array: String[] allowedPasscards = {"VIP-123", "STAFF-456", "GUEST-789"};

Input: String myCard = "GUEST-789";

The Engine: A for loop to scan the array.

The Logic: An if statement using .equals().

Efficiency: Use break; as soon as you find the match (don't waste CPU cycles checking the rest!).