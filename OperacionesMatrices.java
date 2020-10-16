import java.util.Scanner;

public class OperacionesMatrices {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        System.out.println("Bienvenido a la calculadora de matrices, seleccione la operacion que desea realizar:");
        do {
            System.out.println("\n\n");
            opcion = mostrarMenu();
            System.out.println("opción seleccionada: " + opcion);

            switch (opcion) {
                case 1:
                    matrizXmatriz();
                    break;
                case 2:
                    matrixXvector();
                    break;
                case 3:
                    impares();
                    break;
                case 4:
                    grande();
                    break;
                default :
                    System.out.println("Opcion invalida");
                    break;
            }

            System.out.println("presione cualquier tecla para continuar o 5 para salir");
            opcion = reader.nextInt();
        } while (opcion != 5);

    }

    static int mostrarMenu() {
        System.out.println("1.- Multiplicar Matriz por Matriz");
        System.out.println("2.- Multiplicar Matriz por Vector");
        System.out.println("3.- Suma de los numero impares");
        System.out.println("4.- Mostrar el numero mas grande");
        System.out.println("5.- Salir del Programa");
        return reader.nextInt();
    }

    static void grande() {
        int[][] matriz;
        int a, b;
        System.out.println("RENGLONES MATRIZ ");
        a = reader.nextInt();
        System.out.println(" COLUMNAS ");
        b = reader.nextInt();
        matriz = new int[a][b];
        System.out.println(" INGRESE LOS VALORES DE LA MATRIZ ");
        datosMatrix(matriz);
        System.out.println("\n LA SUMA DE LOS NUMEROS DE LA MATRIZ ");
        imprimeMatrix(matriz);
        System.out.println("ES: ");
        numeroMayor(matriz);
    }

    static void impares() {
        int[][] matriz;
        int a, b;
        System.out.println("RENGLONES MATRIZ ");
        a = reader.nextInt();
        System.out.println(" COLUMNAS ");
        b = reader.nextInt();
        matriz = new int[a][b];
        System.out.println(" INGRESE LOS VALORES DE LA MATRIZ ");
        datosMatrix(matriz);
        System.out.println("\n LA SUMA DE LOS NUMEROS DE LA MATRIZ ");
        imprimeMatrix(matriz);
        System.out.println("ES: ");
        sumaImpares(matriz);
    }

    static void matrizXmatriz() {
        int a, b, c;
        int[][] matriz1;
        int[][] matriz2;
        int[][] resultado;

        System.out.println("RENGLONES MATRIZ 1");
        a = reader.nextInt();
        System.out.println(" COLUMNAS ");
        b = reader.nextInt();
        System.out.println("matriz 1:");
        matriz1 = new int[a][b];
        imprimeMatrix(matriz1);

        System.out.println("COLUMNAS MATRIZ 2");
        c = reader.nextInt();
        System.out.println("matriz 2:");
        matriz2 = new int[b][c];
        imprimeMatrix(matriz2);

        resultado = new int[a][c];
        System.out.println("ingrese los valores de la primera matriz;");
        datosMatrix(matriz1);
        System.out.println("ingrese los valores de la segunda matriz;");
        datosMatrix(matriz2);

        matrixMatrix(matriz1, matriz2, resultado);
        System.out.println("\n \n LA MULTIPLICACION DE ");
        imprimeMatrix(matriz1);
        System.out.println("X");
        imprimeMatrix(matriz2);
        System.out.println("ES IGUAL A: ");
        imprimeMatrix(resultado);

    }

    static void matrixXvector() {
        int[][] matriz;
        int[] vector;
        int[] resultado;
        int a, b;

        System.out.println("RENGLONES DE LA MATRIZ");
        a = reader.nextInt();
        System.out.println("COLUMNAS DEL VECTOR Y LA MATRIZ");
        b = reader.nextInt();

        matriz = new int[a][b];
        vector = new int[b];
        resultado = new int[a];

        System.out.println("ingrese los valores de la matriz;");
        datosMatrix(matriz);
        System.out.println("\n ingrese los valores del vector;");
        datosVector(vector);
        multMatrixXvector(vector, matriz, resultado);

        System.out.println("\n \n LA MULTIPLICACION DE ");
        imprimeMatrix(matriz);
        System.out.println("X");
        imprimeVector(vector);
        System.out.println("\n ES IGUAL A: ");
        imprimeVector(resultado);

    }

    static void datosMatrix(int matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int k = 0; k < matriz[0].length; k++) {
                matriz[i][k] = reader.nextInt();
                imprimeMatrix(matriz);
            }
        }
    }

    static void datosVector(int vector[]) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = reader.nextInt();
            imprimeVector(vector);
        }
    }

    static void imprimeVector(int v[]) {
        for (int i = 0; i < v.length; i++) {
            if (v[i] != 0) {
                System.out.print(" " + v[i] + ", ");
            }
        }
    }

    static void imprimeMatrix(int m[][]) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                if (m[i][j] != 0) {
                    System.out.print("" + m[i][j] + ", ");
                }
            }
            System.out.println("");
        }
    }

    static void matrixMatrix(int a[][], int b[][], int r[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int k = 0; k < b.length; k++) {
                    r[i][j] = r[i][j] + a[i][k] * b[k][j];
                }
            }
        }
    }

    static void multMatrixXvector(int v[], int m[][], int r[]) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                r[i] = r[i] + m[i][j] * v[j];

            }
            // System.out.print(" |" + r[i] + "| ");
        }
    }

    static void sumaImpares(int m[][]) {
        int a = 0;
        int tmp = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                a = m[i][j];
                if (a % 2 != 0) {
                    tmp = tmp + a;
                }
            }
        }
        System.out.println(tmp);
    }

    static void numeroMayor(int m[][]) {
        int a = 0;
        int tmp = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                a = m[i][j];
                if (a > tmp) {
                    tmp = a;
                }
            }
        }
        System.out.println(tmp);
    }

}