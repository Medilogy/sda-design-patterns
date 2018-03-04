package pl.sda.poznan.decorator.shapedecorator;


// ta klasa jest dekoratorem - dekoruje klase Circle o nowe pole color
public class ColoredCircle implements Shape {

    private String color;
    private Shape circleToDecorate;

    public ColoredCircle(Shape circle, String color) {
        this.color = color;
        this.circleToDecorate = circle;
    }

    @Override
    public String info() {
        return circleToDecorate.info() + " has the color " + color;
    }
}
