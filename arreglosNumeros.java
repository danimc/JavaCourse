
import java.util.Scanner;

public class arreglosNumeros {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numeros[] = new int[10];
        int primos[] = new int[10];
        int pares[] = new int[10];

        for (int i = 0; i < 10; i++) {
            int contador = i + 1;
            System.out.println("ingresa el numero " + contador + " de 10");
            numeros[i] = reader.nextInt();
        }

        for(int i = 0; i < 10; i++)
        {
            if(numeros[i]%2 == 0){
                pares[i] = numeros[i];
            }
            else {
                primos[i] = numeros[i];
            }
        }

        ordeandoDirecto(pares);
        ordeandoDirecto(primos);
        System.out.println("numeros elegidos:");
        mostrarNumeros(numeros);
        System.out.println("\n numeros pares:");
        mostrarNumeros(pares);
        System.out.println("\n numeros Primos:");
        mostrarNumeros(primos);

    }

    static void mostrarNumeros(int a[]) {
        for (int n : a) {
            if(n != 0)
            System.out.print("|" + n + "|");
        }
    }

    static void ordeandoDirecto(int a[]) {
        int k, menor, i, j;
        int n = a.length;
        for (i = 0; i < n - 1; i++) {
            k = i;
            menor = a[i];
            for (j = i + 1; j < n; j++) {
                if (a[j] > menor) {
                    k = j;
                    menor = a[k];
                    a[k] = a[i];
                    a[i] = menor;
                }
            }
        }
    }
}
