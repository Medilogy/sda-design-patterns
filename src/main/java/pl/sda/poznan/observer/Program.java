package pl.sda.poznan.observer;

public class Program {

    public static void main(String[] args) {
        Stock stock = new Stock();
        new StockObserver(stock);

        // symulacja działania programu
        stock.setPrice(20);
    }
}
