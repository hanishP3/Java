public class Sample {
    public static void main(String[] args) throws InterruptedException {
        // Create the object
        Car obj = new Car("Tesla", 99);
        
        System.out.println("Object created at address: " + obj);
        System.out.println("Now go to VisualVM and look for 'Sample'...");
        
        // This keeps the program alive so it stays in the "Heap"
        Thread.sleep(600000); 
    }
}

class Car {
    String model;
    int speed;

    // Constructor to set the data
    Car(String m, int s) {
        this.model = m;
        this.speed = s;
    }
}