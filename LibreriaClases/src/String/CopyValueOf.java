package String;

/**
 *
 * @author Julian Tanusu
 */
public class CopyValueOf {
    public static void main(String[] args) {
  
        // character array
        char[] charArr = { 'J', 'A', 'V', 'A' };

        // returns a String that contains the characters of the character array
        String str = String.copyValueOf(charArr);

        // prints the string 
        System.out.println(str);
   }
}
