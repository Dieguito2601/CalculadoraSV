public class Calculadora {

    public static void main(String[] args) {
        System.out.println("Bienvenido a la calculadora de San Viator");
        suma(5, 3);
        resta(10, 4);
        multiplicacion(6, 7);
        division(20, 4);
    }

    public static void suma(int a, int b) {
        int resultado = a + b;
        System.out.println("El resultado de la suma es: " + resultado);
    }

    public static void resta(int a, int b) {
        int resultado = a - b;
        System.out.println("El resultado de la resta es: " + resultado);
    }

    public static void multiplicacion(int a, int b) {
        int resultado = a * b;
        System.out.println("El resultado de la multiplicación es: " + resultado);
    }

    public static void division(int a, int b) {
        if (b != 0) {
            int resultado = a / b;
            System.out.println("El resultado de la división es: " + resultado);
        } else {
            System.out.println("Error: No se puede dividir entre cero.");
        }
    }
}
