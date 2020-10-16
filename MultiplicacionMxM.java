public class MultiplicacionMxM {
    public static void main(String[] args) {
        int [][] m1 = {{2,2}, {2,2}, {2,2} };
        int [][] m2 = {{2,2,2}, {2,2,2}};
        int [][] respuesta = new int[3][3];

        System.out.println("Matriz 1:");
        imprimeMatrix(m1);
        System.out.println("Matriz 2:");
        imprimeMatrix(m2);
        matrixMatrix(m1, m2, respuesta);
        System.out.println("Multiplicacion:");
        imprimeMatrix(respuesta);
        
    }



    static void imprimeMatrix(int m[][]) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.print(" |" + m[i][j] + "| ");
            }
            System.out.println("");
        }
    }

    static void matrixMatrix(int a[][], int b[][], int r[][]) {
        for(int i=0; i<a.length; i++){
            for(int j=0; j<b[0].length; j++){
                for(int k=0; k<b.length; k++){
                    r[i][j] = r[i][j] + a[i][k]* b[k][j];
                }
            }
        }                      
    }
}
