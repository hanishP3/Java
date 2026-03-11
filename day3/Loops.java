package day3;

public class Loops {
    public static void main(String[] args) {
        String[] names = {"hanish","leo","han","leodas"};
        String searchName = "han";
        for(int i = 0;i<names.length;i++){
            if(!names[i].equals(searchName)){ // this means not equals too 
                System.out.println("Not the required word, so we got"+names[i]);
            }else{
                System.out.println("Got your word "+names[i]);
                break;
            }
        }
}
}