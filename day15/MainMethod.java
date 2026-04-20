
import java.util.HashMap;

class Student {
    int id;
    String name;
    double grade;
    Student(int id,String name,double grade){
        this.id = id;
        this.name = name;
        this.grade = grade;
    }
}

public class MainMethod {
    public static void main(String[] args) {
        HashMap<Integer, Student> obj = new HashMap<>();
        obj.put(1, new Student(1, "hanish", 99.99));
        obj.put(2, new Student(2, "leo", 80.76));
        obj.put(3, new Student(3, "pin pon", 77.88));

        Thread runningThread = new Thread(() -> {
            try {

                while (true) {
                    System.out.println("\n[Worker] Checking for High Scorers...");
                    for (Student s : obj.values()) {
                        if (s.grade > 85) {
                            System.out.println("Scholarship Found: " + s.name);
                        }
                    }
                    Thread.sleep(5000);
                }
            } catch (InterruptedException e) {
                System.out.println("Worker stopped.");
            }
        });

        runningThread.setDaemon(true); 
        runningThread.start();

        System.out.println("Main Thread: System is up and running!");
    }
}