public class Main {
    public static void main(String[] args) {
        Square square = new Square();
        square.setSide(5);
        square.computeArea();
        System.out.println("Square area: " + square.getArea());
        // square.side;
        // not valid
        Rectangle rectangle = new Rectangle();
        rectangle.setBase(10);
        rectangle.setHeight(5);
        rectangle.computeArea();
        System.out.println("Rectangle area: " + rectangle.getArea());
    }
}