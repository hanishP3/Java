package day4;

public class PasswordChecker {
    public boolean isValidPassword(String pass){
        if(pass.length() > 8){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args){
        PasswordChecker obj = new PasswordChecker();
        boolean result = obj.isValidPassword("hanish");
        if(result == true){
            System.out.println("Access Granted");
        }else{
            System.out.println("Acess denied");
        }

    }
}
