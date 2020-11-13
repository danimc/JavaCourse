import java.io.Reader;
import java.util.InputMismatchException;
import java.util.Scanner;

class Math {
    public static void main(String[] param) {
        Scanner console = new Scanner(System.in);
        int a,b,r;
        while (true) {
            try {
                System.out.println("ingresa numerador");
                a = console.nextInt();
                System.out.println("ingresa denominar");
                b= console.nextInt();

                r = divide(a,b);
                System.out.println("REsultado " + r);

                break;
            } catch (InputMismatchException e) {
                System.err.printf("\nExcepcion: %s\n", e);
                console.nextLine();
                System.out.println("Debe introducir enteros. Intente de nuevo.");
            } 
            catch (ArithmeticException e){
                System.err.printf("\nExcepcion: %s\n", e);
                //console.nextLine();
                System.out.println("No se puede dividor entre 0.");
            }
        } 
    }

    public static int divide(int a , int  b) throws ArithmeticException
    {
        return  a/b;
    }
}