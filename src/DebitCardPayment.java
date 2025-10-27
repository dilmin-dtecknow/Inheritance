public class DebitCardPayment extends CardPayment{
    private double availableBalance ;

    public DebitCardPayment(double amount, String currency, String cardNumber, String carHolderName, String expiryDate,double availableBalance) {
        super(amount, currency, cardNumber, carHolderName, expiryDate);
        this.availableBalance = availableBalance;
    }

    @Override
    public void processPayment() {
        System.out.println("Debiting from account balance <"+availableBalance+"> for amount <"+amount+">");
    }

    public void checkSufficientBalance(){
        System.out.println("Checking if balance covers amount");
    }
}
