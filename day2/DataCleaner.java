package day2;

public class DataCleaner {
    public static void main(String[] args) {
        String name = "  User_Hanish_99  ";
        
        String trimName = name.trim(); 
        

        String upperCase = trimName.toUpperCase(); 
        

        char lastChar = upperCase.charAt(upperCase.length() - 1);
    
        String justHanish = upperCase.substring(5, 11); 

        System.out.println("Cleaned: " + upperCase);
        System.out.println("Last Char: " + lastChar);
        System.out.println("Extracted: " + justHanish);
    }
}