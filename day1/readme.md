Data Storage: * Define a secret key masterKey as a String with the value "Alpha99".

Define a user input providedKey as a new String object with the same value "Alpha99".

Security Logic (The Comparison):

We need two separate checks.

Check A: Does the input point to the exact same memory location as the master? (Use ==).

Check B: Does the input contain the same characters as the master? (Use .equals()).

State Management:

Initialize a variable loginAttempts at 3.

Create a backup variable backupAttempts that stores the value of loginAttempts.

Decrement loginAttempts by 1.

Reporting:

Print the results of Check A and Check B.

Print the current value of backupAttempts.