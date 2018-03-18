package pl.sda.poznan.coll;

import static javafx.scene.input.KeyCode.T;

public class LambdaPlayground {

    public static void foo(Calc calc, int a, int b){
        System.out.println(calc.calculate(a, b));

    }

    public static void main(String[] args) {

        foo((a, b) -> a - b, 10, 3);

        // wyrazenie lambda mozna podstawic wszedzie tam gdzie jest interface z jedna metoda
        Calc calc = (a, b) -> a + b;

        System.out.println(calc.calculate(2, 10));
        System.out.println(calc.calculate(20, 25));
        System.out.println(calc.calculate(45, 110));

        Calc multiply = (a, b) -> a * b;
        System.out.println(multiply.calculate(2, 4));


        
    }
}
