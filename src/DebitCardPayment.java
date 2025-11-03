public class DebitCardPayment extends CardPayment implements Discount{
    private double availableBalance, discountedAmount ;

    public DebitCardPayment(double amount, String currency, String cardNumber, String carHolderName, String expiryDate,double availableBalance) {
        super(amount, currency, cardNumber, carHolderName, expiryDate);
        this.availableBalance = availableBalance;
        this.discountedAmount = amount;
    }

    @Override
    public void processPayment() {
        System.out.println("Debiting from account balance <"+availableBalance+"> for amount <"+amount+">");
        markAsCompleted();
    }

    public void checkSufficientBalance(){
        System.out.println("Checking if balance covers amount");
    }

    @Override
    public double applyDiscount(double percent) {
        discountedAmount = amount * (1 - percent / 100);
        System.out.println("Applied " + percent + "% discount. New amount: " + discountedAmount);
        return discountedAmount;
    }

    @Override
    public double finalAmount() {
        return discountedAmount;
    }
}
