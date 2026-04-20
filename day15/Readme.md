🏗️ The Project: "The Architect's Grade-Book"
The Scenario:
You are building a backend system for a university. The system needs to store thousands of students, filter out the top performers for a scholarship, and save all data to a "database" (a file) in the background so the user doesn't have to wait.

📋 The Requirements:
1. The Model (Student Class)
Fields: int id, String name, double grade.

Requirements: A constructor and a toString() method.

2. The Storage (The "Warehouse")
Use a HashMap<Integer, Student> to store the records.

Logic: Create a method addStudent(Student s) that puts the student in the map.

3. The Analytics (The "Sexy" Code)
Use Streams & Lambdas to:

Find all students with a grade > 85.

Print their names in Uppercase.

(This replaces those ugly old for loops).

4. The Persistence (The "Background Worker")
Create a Thread using a Lambda.

Logic: This thread should "Auto-save" the student list every 15 seconds. (For now, just make it print: "--- Background: 5 records backed up to cloud ---").