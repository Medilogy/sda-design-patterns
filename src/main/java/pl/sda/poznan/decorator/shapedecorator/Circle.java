package pl.sda.poznan.decorator.shapedecorator;

public class Circle implements Shape {

   private float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    @Override
    public String info() {
        return "A circle with a radius " + radius;
    }
}
