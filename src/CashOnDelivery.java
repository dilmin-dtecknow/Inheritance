public class CashOnDelivery extends Payment{

    private String deliveryAddress;

    public CashOnDelivery(double amount, String currency, String deliveryAddress) {
        super(amount, currency);
        this.deliveryAddress = deliveryAddress;
    }

    @Override
    public void processPayment() {
        super.processPayment();
        System.out.println("Cash will be collected at delivery address: "+deliveryAddress);
    }
}
