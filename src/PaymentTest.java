import java.util.ArrayList;
import java.util.List;

public class PaymentTest {
    public static void main(String[] args) {
        CashOnDelivery cod = new CashOnDelivery(100.0, "LKR", "123 Main St, Colombo");
        BankTransfer bt = new BankTransfer(200.0, "USD", "Bank of America", "123456789", "REF123");
        CreditCardPayment ccp = new CreditCardPayment(150.0, "USD", "4111111111111111", "John Doe", "12/25", 5000.0);
        DebitCardPayment dcp = new DebitCardPayment(50.0, "LKR", "4222222222222222", "Jane Doe", "11/24", 1000.0);

        // Call processPayment and generateReceipt on each
        System.out.println("=== Individual Payments ===");
        cod.processPayment();
        cod.generateReceipt();

        System.out.println("...............");

        bt.processPayment();
        bt.generateReceipt();

        System.out.println("...............");

        ccp.processPayment();
        ccp.generateReceipt();

        System.out.println("...............");

        dcp.processPayment();
        dcp.generateReceipt();

        System.out.println("\n..........................");
        List<Payment> payments = new ArrayList<>();
        payments.add(cod);
        payments.add(bt);
        payments.add(ccp);
        payments.add(dcp);
        for (Payment payment : payments) {
            System.out.println("--------------------------------------------------");
            payment.processPayment();
            payment.generateReceipt();
            System.out.println("Status: " + payment.getStatus());
        }
    }
}
