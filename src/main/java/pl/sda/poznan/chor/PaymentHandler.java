package pl.sda.poznan.chor;

// bazowa klasa dla Handlerow, czyli obiektow uiejacych przetwarzac zadania
// klasy rozszerzajace ta klase sa elementami lancucha zobowiazan

import java.awt.dnd.InvalidDnDOperationException;

public abstract class PaymentHandler {

    protected PaymentHandler nextHandler;

    public void setNextHandler(PaymentHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    // sprawdzic czy mozemy przetworzyc zadanie, jesli nie to przekazac wyzej wzdluz lancucha zobowiazan
    public void processPayment(BankAccount bankAccount, double amount) {
        // jezeli dany handler umie obsluzyc zadanie (canHandle zwraca true)
        // to wykonuje metode obslugi zadania
        // w przeciwnym wypadku, sprawdza, czy jest kolejny handler;
        // jesli tak to przekazuje zadanie wyzej, kelejny handler sprawdzi czy moze to zrobic itd...
        if (canHandlePayment(amount)) {
            handle(bankAccount, amount);
        } else if (nextHandler != null) {
            nextHandler.processPayment(bankAccount, amount);
        }else {
            throw new InvalidDnDOperationException("Nie jestem w stanie obslozyc zadania, kwota zbyt duza");
        }
    }

    private boolean canHandlePayment(double amount) {
        return amount < getMAxPrice();
    }

    // abstrakcyjna metoda dlatego ze na tym etapie nie wiemy jak przetwarzac platnosc
    protected abstract void handle(BankAccount account, double amount);

    // metoda zwraca maksymalna kwote jako moze obsluzyc dana metoda
    // (np 50 zl dla zblizeniowej, 500 dla pin
    protected abstract double getMAxPrice();

}
