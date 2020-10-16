public class PrintMatrix {
    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4, 5 }, { 2, 4, 6, 8, 10 }, { 3, 6, 9, 12, 15 } };

        mostrarMatrix(matrix);
        numeroMayor(matrix);
        sumaImpares(matrix);
    }

    static void mostrarMatrix(int m[][]) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(" " + m[i][j] + ", ");
            }
            System.out.println("");
        }
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
        System.out.println("el numero mayor de la matriz es: " + tmp);
    }

    static void sumaImpares(int m[][]) {
        int a = 0;
        int tmp = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                a = m[i][j];
                if (a % 2 != 0) {
                    tmp = tmp + a;
                }
            }
        }
        System.out.println("la suma de los impares es : " + tmp);
    }
}
