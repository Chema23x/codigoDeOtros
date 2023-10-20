package codigoDeOtros6;

import java.util.Scanner;

public class Codigo6 {
	  public static void main(String[] args){ // Se agrega la clase main
    int[] n = new int[20]; //se agrega new

    for (int i = 0; i < 20; i++) { //Se agrega un + para las interaciones en i+
      n[i] = (int)(Math.random() * 381) + 20;
      System.out.println(n[i] + " "); //Se agrega .out
    }
    
    Scanner scanner = new Scanner(System.in); // Se agrega Scanner 
    System.out.println("¿Qué números quiere resaltar? "); //se desplazan hacia arriba para mejorar el orden
    System.out.println("\n 1 – los múltiplos de 5: \n 2 – los múltiplos de 7: "); // Se agrega \n para mejorar la visualización en consola
    int opcion = scanner.nextInt(); // Se cambia por el scanner, ya que en el aterior código generaba una excepcion

    int multiplo = (opcion == 1) ? 5 : 7; // Se corrige el orden de ? y : para que la sintaxis sea correcta

    for (int e : n) { // char se sustituye por int, y foreach por for
      if (e % multiplo == 0) {
        System.out.print("[" + e + "] ");
      } else { // se cierra llave detras de else
        System.out.print(e + " "); //Se cambia .in por .out
      }
    }
    scanner.close(); // Se cierra scanner
    }
}
