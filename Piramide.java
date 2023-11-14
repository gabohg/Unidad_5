/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package piramide;
import java.util.Scanner;
/**
 *
 * @author yeomn
 */
public class Piramide {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        int opcion;
        
        do {
            // Mostrar el menú
            System.out.println("Menú:");
            System.out.println("1. Piramide Asteriscos");
            System.out.println("2. Piramide Letras");
            System.out.println("3. Salir");
            System.out.print("Ingrese su elección: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el número de filas para la pirámide de asteriscos: ");
                    int filasAsteriscos = scanner.nextInt();
                    imprimirPiramideAsteriscos(filasAsteriscos);
                    break;

                case 2:
                    System.out.print("Ingrese el número de filas para la pirámide de letras: ");
                    int filasLetras = scanner.nextInt();
                    imprimirPiramideLetras(filasLetras);
                    break;

                case 3:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, ingrese una opción válida.");
                    break;
            }
        } while (opcion != 0);

        scanner.close();
    }

    // Método para imprimir la pirámide de asteriscos
    private static void imprimirPiramideAsteriscos(int filas) {
        for (int i = 1; i <= filas; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Método para imprimir la pirámide de letras
    private static void imprimirPiramideLetras(int filas) {
        char inicioLetra = 'A';
        int inicioNumero = 1;
        for (int i = 1; i <= filas; i++) {
            for (int j = 1; j <= i; j++) {

                if (i % 2 == 0) {
                    if (inicioLetra > 'Z') {
                        inicioLetra = 'A';
                    }

                    System.out.print(inicioLetra);
                    inicioLetra++;
                } else {
                    if (inicioNumero > 9) {
                        inicioNumero = 1;
                    }
                    System.out.print(inicioNumero);
                    inicioNumero++;
                }

            }
            System.out.println();

        }

    }

}