public class CreditCardPayment extends CardPayment implements Discount{
    private double creditLimit , discountedAmount;

    public CreditCardPayment(double amount, String currency, String cardNumber, String carHolderName, String expiryDate,double creditLimit) {
        super(amount, currency, cardNumber, carHolderName, expiryDate);
        this.creditLimit = creditLimit;
        this.discountedAmount = amount;
    }

    @Override
    public void processPayment() {
        System.out.println("Charging credit card with limit <"+creditLimit+"> for amount <"+amount+">");
        markAsCompleted();
    }

    public void applyInterest(){
        System.out.println("Applying interest if payment is not settled by due date");
    }

    @Override
    public double applyDiscount(double percent) {
        discountedAmount = amount * (1-percent / 100);
        System.out.println("Applied "+percent+"% discount. new amount : "+discountedAmount);
        return discountedAmount;
    }

    @Override
    public double finalAmount() {
        return discountedAmount;
    }
}
