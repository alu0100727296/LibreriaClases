package Scanner;

import java.util.Scanner;

/**
 *
 * @author Julian Tanusu
 */
public class nextLine {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.print("Introduce nombre: ");
         String nombre = sc.nextLine();
         System.out.println("El nombre introducido es: " + nombre);
    }
}
