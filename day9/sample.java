package day9;

public class sample {
    public static void main(String[] args) {
       try {
         System.out.println(100/0);
         int[] prices = {100,200};
         System.out.println(prices[5]);
       } catch (Exception e) {
        // TODO: handle exception
        System.out.println("nice try man you cant deivide by 0");
       }
    }
}
