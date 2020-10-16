public class arreglos {
    public static void main(String[] args) {
        
        int a[] = new int[5];
        int b[] = new int[5];
        int c[] = new int[5];


        for(int i = 0; i < 5; i++)
        {
            a[i] = i+1;
            b[i] = i+1;

            c[i] = a[i]*b[i];

            System.out.println(a[i] + " * " + b[i] + " = " + c[i] );
            
        }
    }
    
}
