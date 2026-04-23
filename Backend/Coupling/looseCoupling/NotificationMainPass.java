interface Services{
    void send();
}

interface Logger{
    void logg();
}

class MessageService implements Services{
    @Override
    public void send(){
        System.out.println("sending the message via message...");
    }
    @Override
    public String toString(){
        return "Message Service";
    }
}

class SMSService implements Services{
    @Override
    public void send(){
        System.out.println("sending the message via SMS..");
    }
}

class Logging implements Logger{
  @Override
  public void logg(){
    System.out.println("hey am logg console");
  }
  @Override
  public String toString(){
    return "logging started";    
}
}

class NotificationManager{
    Services obj;
    Logger obj1 ;
    public  NotificationManager(Services userInpObjectService, Logger userInpLogging){
        this.obj = userInpObjectService;
        this.obj1 = userInpLogging;
    }
    public void printNoti(){
        System.out.println("currently running is"+obj+"and"+obj1);
    }
}


public class NotificationMainPass{
    public static void main(String[] args) {
        NotificationManager obj1 = new NotificationManager(new MessageService(), new Logging());
        obj1.printNoti();
    }
}