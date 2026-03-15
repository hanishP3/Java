class Payment{
    double amount;
    Payment(double amount){
        this.amount = amount;
        System.out.println("Step 1: Parent Payment initialized with: $" + amount);
    }
}

class CreditCardPayment extends Payment{
    String  cardNumber;
    CreditCardPayment(double amount,String cardNumber){
        super(amount);
        this.cardNumber = cardNumber;
        System.out.println("Step 2: Child CreditCard initialized with Number: " + cardNumber);
    }

    void displayDetails() {
        System.out.println("Processing card " + cardNumber + " for amount $" + amount);
    }
}

public class PaymentSystem {
    public static void main(String[] args) {
        CreditCardPayment myCard = new CreditCardPayment(250.50, "1234-5678");
        myCard.displayDetails();
    }
}