package day3;

public class FinalArray {
    public static void main(String[] args) {
        String[] approvedVipCards = {"VIP-123", "STAFF-456", "GUEST-789","hanish"};
        String mycard = "GUEST-789";
        for(int i = 0;i<approvedVipCards.length;i++){
            if(approvedVipCards[i].equals(mycard)){
                System.out.println("found the trojan"+i);
                break;
            }
            else{
                System.out.println("all check ");
            }
        }
    }
}
