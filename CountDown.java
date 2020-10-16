import java.util.Scanner;

class CountDown
{
    public static void main(final String args[])
    {
        Scanner reader = new Scanner(System.in);
        int numero;

        System.out.println("ingresa un numero ");
        numero = reader.nextInt();

        while(numero >= 0){
            System.out.println(numero);
            numero--;
        }
                   
    }
}