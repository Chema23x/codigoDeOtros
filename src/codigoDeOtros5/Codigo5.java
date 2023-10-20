package codigoDeOtros5;

import java.util.Scanner;

public class Codigo5 {
	public static void main(String[] args) { //Se agrega la clase main

	    Scanner scanner = new Scanner(System.in); //s por scanner y se importa la java.util.Scanner -- Se agrega System.in
	    System.out.print("Introduzca un número: ");
	    int input = scanner.nextInt(); // Se sustituye ni y scanner por input y scanner --- se sustituye String por int y nextLine por nextInt
	    int number = input; // c cambia por number
	    
	    int afortunado = 0; // afo por afortunado
	    int noAfortunado = 0; //noAfo por noAfortunado
	    
	    while (input > 0) {
		  int digito = input % 10;
	      if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
			afortunado++;
	      } else {
			noAfortunado++;
		  
		  input /= 10;
	    }
	    if (afortunado > noAfortunado) {
	      System.out.println("El " + number + " es un número afortunado."); //Se agrega t a println
	    } else {
	      System.out.println("El " + number + " no es un número afortunado.");
	    }
	    scanner.close();
	  }
	}
	}