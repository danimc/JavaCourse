public class MultiplicacionMxV {
    public static void main(String[] args) {
        int respuesta[] = new int[3];
        int vector[] = { 1, 2 };
        int matrix[][] = { { 7, 2 }, { 1, 5 }, { 8, 6 } };

        System.out.println("Vector:");
        imprimeVector(vector);
        System.out.println("\n Matriz:");
        imprimeMatrix(matrix);
        System.out.println("\n Multiplicación:");
        matrixXvector(vector, matrix, respuesta);

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
                System.out.print(" " + m[i][j] + ", ");
            }
            System.out.println("");
        }
    }

    static void matrixXvector(int v[], int m[][], int r[]) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                r[i] = r[i] + m[i][j] * v[j];

            }
            System.out.print(" |" + r[i] + "| ");
        }
    }

}
