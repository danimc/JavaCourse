
import java.util.Scanner;

public class sort {

    public static void main(String args[]) {
        Scanner reader = new Scanner(System.in);
        int opcion = 0;
        int[] numeros = new int[5];

        do {

            System.out.println("Escribe los numeros que desea ordenar");
            for (int i = 0; i < numeros.length; i++) {
                System.out.print(i + 1 + "° numero: ");
                numeros[i] = reader.nextInt();
            }

            System.out.println("¿Como desea ordenar los numeros? ");
            System.out.println("1: Ascendente ");
            System.out.println("2: Descendente");
            System.out.println("3: Salir ");
            opcion = reader.nextInt();

            switch (opcion) {
                case 1:

                    System.out.println("numeros ingresados:");
                    mostrarNumeros(numeros);
                    ordeandoDirecto(numeros);
                    System.out.println("Numeros ordenados de forma Ascendente");
                    mostrarNumeros(numeros);
                    break;
                case 2:

                    System.out.print("numeros ingresados: ");
                    mostrarNumeros(numeros);
                    ordenadoBurbuja(numeros);
                    System.out.println("Numeros ordenados de forma descendente");
                    mostrarNumeros(numeros);
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    System.out.println("para salir ingrese 3, para continuar ingrese cualquier otra tecla ");
                    opcion = reader.nextInt();
            }

            System.out.println("para salir ingrese 3, para continuar ingrese cualquier otra tecla ");
            opcion = reader.nextInt();

        } while (opcion != 3);

    }

    static void ordeandoDirecto(int a[]) {
        int k;
        int menor;
        int i;
        int j;
        int n = a.length;
        for (i = 0; i < n - 1; i++) {
            k = i;
            menor = a[i];
            for (j = i + 1; j < n; j++) {
                if (a[j] < menor) {
                    k = j;
                    menor = a[k];
                    a[k] = a[i];
                    a[i] = menor;
                }
            }
        }
    }

    static void ordenadoBurbuja(int a[]) {
        int i;
        int j;
        int tmp;
        int length = a.length;

        for (i = 0; i < length - 1; i++) {
            for (j = 0; j < length - 1 - i; j++) {
                if (a[j + 1] > a[j]) {
                    tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                }
            }
        }
    }

    static void mostrarNumeros(int a[]) {
        for (int n : a) {
            System.out.print("|" + n + "|");
        }
    }

}