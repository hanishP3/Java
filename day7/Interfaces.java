interface Engine{
    void startEngine();
}

interface Radio{
   void  playMusic();
}

public class Interfaces implements Engine,Radio {
    @Override
    public void startEngine(){
        System.out.println("hello iam start engine");
    }

    @Override
    public void playMusic(){
        System.out.println("hi am from play music");
    }

    public static void main(String[] args) {
        Interfaces obj = new Interfaces();
        obj.startEngine();
        obj.playMusic();
    }
}
