public class AccesVault {
    public static void main(String[] args) {
        String masterKey = "Alpha99";
        String userInput = new String("Alpha99");
        if(masterKey == userInput){
            System.out.println("the pointing is same for masterkey and userinput");
        }else if(masterKey.equals(userInput)){
            System.out.println("the memory address and data are of the same of master key and userinput");
        }
    }
}
