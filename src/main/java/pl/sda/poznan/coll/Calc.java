package pl.sda.poznan.coll;

@FunctionalInterface // interface funkcyjny
public interface Calc {

    int calculate(int a, int b);

    // nie moga byc dwie metody bo w tedy wyrazenie lambda nie wie ktorej metody uzyc i nie dziala
    //boolean isGreater (int a, int b);
}
