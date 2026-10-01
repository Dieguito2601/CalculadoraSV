import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args){
        System.out.println("Bienvenido a la calculadora de San Viator");
        System.out.println("Elije una opción del 1 al 4");
        Scanner teclado = new Scanner (System.in);
        int numero = teclado.nextInt();

        if (numero == 1) {
            sumar();
        } else if (numero == 2) {
            restar();
        } else if (numero == 3) {
            multiplicar();
        } else {
            dividir();
        }
    }

    public static void sumar(){
        System.out.println("Opción SUMAR");
    }
    public static void restar(){
        System.out.println("Opción RESTAR");
    }
    public static void multiplicar(){
        System.out.println("Opción MULTIPLICAR");
    }
    public static void dividir(){
        System.out.println("Opción DIVIDIR");
    }
}