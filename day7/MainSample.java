abstract class Appliance {
    public void turnon(){
        System.out.println("Powering up");
    }
    abstract public void work();
    
}

class Fan extends Appliance{
    @Override
    public void work(){
        System.out.println("Spinning blades");
    }
}

public class MainSample{
    public static void main(String[] args) {
     //   Apppliance obj = new Appliance();
        Fan obj1 = new Fan();
        obj1.work();
    }
}
