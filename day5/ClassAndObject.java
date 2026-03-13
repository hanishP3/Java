

public class ClassAndObject {
    public static void main(String[] args) {
        Car obj = new Car();
        obj.drive("Tesla", 99);
    }
}


class Car{
    String modal;
    int speed;
    public void drive(String modalu,int speedu){
        System.out.println("the modal is"+modalu+"the speed is"+speedu);
    }
}