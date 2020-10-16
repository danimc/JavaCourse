import java.util.Scanner;

class Registro
{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String nombre, curso;
        int codigo, semestre;


        System.out.println("ingresa tu nombre: ");
        nombre = reader.nextLine();
        System.out.println("ingresa tu codigo: ");
        codigo = reader.nextInt();
        System.out.println("ingresa el numero de semestre en el que vas");
        semestre = reader.nextInt();
        System.out.println("ingresa el nombre del curso");
        reader.nextLine();
        curso = reader.nextLine();

        System.out.println("\n \n \n");
        System.out.println("tu codigo es: "+ codigo +"\n"
                        + "tu nombre: "+ nombre + "\n"
                        + "semestre cursando: " + semestre + "\n"
                        + "Nombre del curso: "+ curso);

        System.out.println("gracias por utilizar el sistema");
        

    }
}