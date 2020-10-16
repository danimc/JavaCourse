public class Ascii {
    
    public static void main(String[] args) {
        for(int x = 0; x <= 127; x++) {
            System.out.printf(" %3d", x);
            System.out.printf(" %4o", x);
            System.out.printf(" %3x", x);
            System.out.printf(" %3c\n", x);
        }
    }
    
}
