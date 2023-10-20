package codigoDeOtros7;

import java.util.HashMap;
import java.util.Scanner;

public class Código7 {
	public static void main (String[] args) { // Se agrega la clase main
    Scanner scanner = new Scanner(System.in); //s por scanner -- System.in agregado -- import Scanner

    HashMap<String, String> Capitales = new HashMap<>(); //import HashMap -- Capitales por ca --- String, String reemplaza Byte y Double

    Capitales.put("Canadá", "Otawwa");
    Capitales.put("Estados Unidos", "Washington DC");
    Capitales.put("México", "México DF");
    Capitales.put("Belice", "Belmopán");
    Capitales.put("Costa rica", "San José");
    Capitales.put("El Salvador", "San Salvador"); // Se agrega la capital
    Capitales.put("Guatemala", "Ciudad de Guatemala");
    Capitales.put("Honduras", "Tegucigalpa");
    Capitales.put("Nicaragua", "Managua");
    Capitales.put("Panamá", "Panamá");
   
    String country = ""; // c por country
    do { 
      System.out.println("Escribe el nombre de un país y te diré su capital: "); //out por in
      country = scanner.nextLine();  //s por scanner nextLine
      
      if (!country.equals("salir")) { //Se agrega s equal
        if (Capitales.containsKey(country)) { //Se agrega Capitales --Key por Value
          System.out.println("La capital de " + country + " es " + Capitales.get(country)); // se agrea el out -- se reduce el syso
        } else {
          System.out.print("No conozco la respuesta " + " ¿cuál es la capital de " + country + "?: "); //se reduce el syso
          String capital = scanner.nextLine(); //ca por capital
          Capitales.put(country, capital);
          System.out.println("Gracias por enseñarme nuevas capitales");
        }
      }
    } while (!country.equals("salir")); //while -- se agrega parentesis
    scanner.close(); // Se cierra scanner
  }
}
