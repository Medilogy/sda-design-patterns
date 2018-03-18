package pl.sda.poznan.chor;

public class Program {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount("PKO dla młodych", 4000);
        bankAccount.setPin("1234");

        // utworzenie handlerow i ustawienie w kolejnosci
        PaypassPaymentHandler paypassPaymentHandler = new PaypassPaymentHandler();
        PinPaymentHandler pinPaymentHandler = new PinPaymentHandler();
        paypassPaymentHandler.setNextHandler(pinPaymentHandler);

        // proba przetworzenia zadania - zlecamy zadania handlerowi stojacemu najnizej w hierarchii
        paypassPaymentHandler.processPayment(bankAccount, 1000);

    }
}
