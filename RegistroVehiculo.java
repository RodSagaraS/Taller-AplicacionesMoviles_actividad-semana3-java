import java.util.Scanner; // Importa la clase Scanner para leer datos desde el teclado.

public class RegistroVehiculo { // Declara la clase principal del programa.
    public static void main(String[] args) { // Define el método principal que inicia la ejecución.
        Scanner scanner = new Scanner(System.in); // Crea el objeto que capturará los datos ingresados.

        System.out.println("=== Registro básico de vehículo ==="); // Muestra un título en pantalla.

        System.out.print("Ingrese la marca: "); // Solicita la marca del vehículo.
        String marca = scanner.nextLine(); // Guarda la marca ingresada por el usuario.

        System.out.print("Ingrese el modelo: "); // Solicita el modelo del vehículo.
        String modelo = scanner.nextLine(); // Guarda el modelo ingresado por el usuario.

        System.out.print("Ingrese la cilindrada: "); // Solicita la cilindrada del vehículo.
        int cilindrada = scanner.nextInt(); // Guarda la cilindrada como número entero.
        scanner.nextLine(); // Limpia el salto de línea pendiente en el buffer.

        System.out.print("Ingrese el tipo de combustible: "); // Solicita el tipo de combustible.
        String tipoCombustible = scanner.nextLine(); // Guarda el combustible ingresado.

        System.out.print("Ingrese la capacidad en pasajeros: "); // Solicita la capacidad de pasajeros.
        int capacidadPasajeros = scanner.nextInt(); // Guarda la capacidad como número entero.

        System.out.println(); // Inserta una línea en blanco para ordenar la salida.
        System.out.println("La marca que ha ingresado es: " + marca); // Muestra la marca capturada.
        System.out.println("El modelo que ha ingresado es: " + modelo); // Muestra el modelo capturado.
        System.out.println("La cilindrada que ha ingresado es: " + cilindrada); // Muestra la cilindrada capturada.
        System.out.println("El tipo de combustible es: " + tipoCombustible); // Muestra el combustible capturado.
        System.out.println("Tiene una capacidad de " + capacidadPasajeros + " pasajeros."); // Muestra la capacidad capturada.

        scanner.close(); // Cierra el lector para liberar el recurso.
    } // Cierra el método principal.
} // Cierra la clase del programa.
