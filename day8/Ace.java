class SmartBulb{
    private int brightness;
    final double serialNum = 898932279.29;

    // getter
    public int getBrigtness(){
        return brightness;
    }

    //setter
    public int setBrightness(int inp){
        if(inp < 0){
            brightness = 0;
        }
        else if(inp > 100){
            brightness = 100;
        }
        return brightness;
    }


}

public class Ace{
    public static void main(String[] args) {
        SmartBulb obj = new SmartBulb();
       int res =  obj.setBrightness(1000);
       System.out.println("result = "+res);
    }
}