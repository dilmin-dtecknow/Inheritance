public class CardPayment extends Payment {
    private String cardNumber,carHolderName,expiryDate;

    public CardPayment(double amount, String currency, String cardNumber, String carHolderName, String expiryDate) {
        super(amount, currency);
        this.cardNumber = cardNumber;
        this.carHolderName = carHolderName;
        this.expiryDate = expiryDate;
    }

    @Override
    public void processPayment() {
        super.processPayment();
        System.out.println("Authorizing card payment for <"+carHolderName+"> ...");
    }

    public void validateCard(){
        System.out.println("Validating card number format...");
    }
}
