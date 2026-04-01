class OverweightPackageException extends Exception {
    OverweightPackageException(String message){
        super(message);
    }       
}



public class Sample{

    public static void shipPackage(double weight) throws OverweightPackageException{
    if (weight > 30.0) {
        throw  new OverweightPackageException("hey this is too much weight");
    } else {
        System.out.println("package clearned for shipping");
    }
}

    public static void main(String args[]){
        try {
            shipPackage(0.0);
        } catch (OverweightPackageException e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Moving to the next passenger in line...");
        }
    }
}