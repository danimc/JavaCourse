import java.io.Console;
import java.util.Scanner;

public class Estudiantes {
    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int opcion;
        do{
            System.out.println("Menú:");
            System.out.println("1.- agregar estudiante");
            System.out.println("2.- Eliminar Estudiante");
            System.out.println("3.- Agregar Estudiante");
            System.out.println("4.- Salir");
            opcion = reader.nextInt(); 
            
            switch(opcion)
            {
                case 1:
                    System.out.println("Añadir estudiante");
                    break;
                case 2:
                    System.out.println("Eliminar estudiante");
                    break;
                case 3:
                    System.out.println("Actualizar estudiante");
                    break;
                default:
                    System.out.println("opcion invalida");
            }
        }while(opcion != 4); 

        System.out.println("Gracias, Adios");
    }
}
