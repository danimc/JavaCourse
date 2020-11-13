public class Rectangle extends Figure {
    private int base;
    private int height;

    public void setBase(int x) {
        base = x;
    }

    public void setHeight(int x) {
        height = x;
    }

    public void computeArea() {
        area = base * height;
    }
}