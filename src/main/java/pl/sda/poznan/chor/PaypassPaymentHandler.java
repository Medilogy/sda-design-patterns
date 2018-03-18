package pl.sda.poznan.chor;

// platnosc zblizeniowa - max 50 zl
public class PaypassPaymentHandler extends PaymentHandler {

    private static final int MAX_PRICE_TO_HANDLE = 50;

    @Override
    protected void handle(BankAccount account, double amountToPay) {
        System.out.println("Platnosc zblizeniowa jest realizowana ... ");
        account.setAmount(account.getAmount() - amountToPay);
        System.out.println("Zaplacono zblizeniowo");
    }

    @Override
    protected double getMAxPrice() {
        return MAX_PRICE_TO_HANDLE;
    }
}
