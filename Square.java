public class Square extends Figure {
    private int side;

    public void setSide(int x) {
        side = x;
    }

    public void computeArea() {
        area = side * side;
    }
}