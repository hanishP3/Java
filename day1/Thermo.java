public class Thermo{
    public static void main(String[] args) {
        int temp = 25;
        String status;
        String status2 = "Warm";
        if(temp >= 15 && temp <=30){
            status = "Warm";
        }
        else {
            status = "cold";
        }
        if(status == status2){
            System.out.println("System optomized");
        }else{
            System.out.println("system not opstmized");
        }
    }
}
