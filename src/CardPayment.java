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
        System.out.println("Authorizing card payment for <"+carHolderName+"> ...");
    }

//    public void validateCard(){
//        System.out.println("Validating card number format...");
//    }

    @Override
    public boolean validate() {
        boolean valid = cardNumber != null && cardNumber.length()>=12 && expiryDate !=null;
        System.out.println("Validating card for "+carHolderName+": "+(valid ? "OK" : "NO, INVALID"));
        return valid;
    }
}
