/*
COnvierte los elementos de una cadena en un String
*/
package String;

/**
 *
 * @author Julian Tanusu
 */
public class CopyValueOf {
    public static void main(String[] args) {
  
        // cadena de caracteres
        char[] charArr = { 'J', 'A', 'V', 'A' };

        // retorna un string con los elementos de la cadena
        String str = String.copyValueOf(charArr);

        // imprie el String
        System.out.println(str);
   }
}
