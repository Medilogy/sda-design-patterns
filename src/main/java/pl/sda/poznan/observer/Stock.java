package pl.sda.poznan.observer;


// klasa Stock dajaca sie obserwowac
public class Stock extends Observable<Stock> {

    private String name;
    //pole na zmiane ktorego chcemy reagowac - patrz setter
    private double price;

    public double getPrice() {
        return price;
    }


    public void setPrice(double price) {
        // old price zmienna pomocniczna do przechowania aktualnej/starej ceny - sprzed wywolania settera
        double oldPrice = this.price;
        // jezeli nowa cena (argument settera) rowna sie starej cenie to nie powiadamiamy
        if (price == oldPrice) {
            return;
        }

        // teraz this.price przechowuje nowa wartość podana jako argument settera
        // jezeli ceny sie zmienily to ustawiamy nowa wartosc i powiadamiamy obserwatorow
        this.price = price;
        propertyChanged(new PropertyChangedEventArgs<>(this, "price", this.price, oldPrice));
    }

    // alternatywne : wykonuj tylko jesli ceny sa rozne
    public void setPriceWithValidation(double price) {
        double oldPrice = price;
        this.price = price;
        if (oldPrice != this.price) {
            propertyChanged(new PropertyChangedEventArgs<>(this, "price", this.price, oldPrice));
        }
    }

    // Alternatywny zapis: jesli ceny takie samo to wroc z funkcji - redukujemy zadniezdzenie
    public void set(double price) {
        if (this.price == price) {
            return;
        }
        double oldPrice = price;
        this.price = price;
        propertyChanged(new PropertyChangedEventArgs<>(this, "price", this.price, oldPrice));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
