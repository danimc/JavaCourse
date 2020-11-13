import java.util.Scanner;

public class Phone {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String numero, numeroLimpio;

        System.out.println("ingrese su numero telefonico a 10 digitos");
        numero = reader.nextLine();
        numeroLimpio = limpiarNumero(numero);
        if (numeroLimpio.length() != 10) {
            System.out.println(
                    "el numero que ingreso es invalido o tiene caracteres especiales no admitidos: " + numeroLimpio);
        } else {
            System.out.println("su numero es:" + numeroLimpio);
        }

    }
    static String limpiarNumero(String numero) {
        numero = numero.replaceAll("[^0-9.]", "");
        return numero;
    }
}
