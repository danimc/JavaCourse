public class ordenamiento {
    public static void main(String[] args) {
        int a[] = {4, 2, 7, 10, 1};
        int k; // tiene el indice de la localidad con el menor num
        int menor;// tiene el menor num
        int i; // recorre el arreglo 
        int j; // recorre el arreglo a partir de i+1 
        int n = a.length; // size of thearray
        for(i=0; i < n-1; i++) { // menor: a[i]      
            k = i;      
            menor= a[i];
            for(j=i+1; j<n; j++)  //comparamos menor con a[j]  
                if(a[j] < menor)
                {       
                    k = j;        
                    menor= a[k];                
                }      
                a[k] = a[i];   // donde esta el menor ponemos a[i]      
                a[i] = menor;  // ponemos en a[i] el menor 
            }
            
    }
}
