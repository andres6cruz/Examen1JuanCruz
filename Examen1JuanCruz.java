/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen1juancruz;
import java.util.Scanner;

/**
 *
 * @author Juan Andres Cruz
 */
public class Examen1JuanCruz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("elija una opcion: ");
        int opcion = leer.nextInt();
        while (opcion != 2) {
            if (opcion == 1) {
                System.out.println("Ingrese la primera palabra: ");
                String palabra1 = leer.next();
                System.out.println("Ingrese la segunda palabra: ");
                String palabra2 = leer.next();
                palabra1 = palabra1.toLowerCase();
                palabra2 = palabra2.toLowerCase();
                if (palabra1.equals(palabra2)) {
                    String palabra = palabra1;
                    String aux = "";
                    for (int i = palabra2.length() - 1; i >= 0; i--) {
                        aux += palabra2.charAt(i);
                    }
                    palabra += aux;
                    System.out.println(palabra);
                } else if (palabra1.length() == palabra2.length()) {
                    String palabra = "";
                    for (int i = 0; i < palabra1.length(); i++) {
                        palabra += palabra1.charAt(i);
                        palabra += palabra2.charAt(i);
                    }
                    System.out.println(palabra);
                } else {
                    String palabra = "";
                    palabra = palabra1 + palabra2;
                    System.out.println(palabra);
                }

            }
            System.out.println("elija una opcion: ");
            opcion = leer.nextInt();
        }
    }

}
    
    

