package String;
import java.lang.*;
/**
 *
 * @author Julian Tanusu
 */
public class concat {
    public static void main(String[] args) {
  
        // print str1
        String str1 = "hola";
        System.out.println(str1);
 
        // guarda en str2 el str1 concantenado con learning
        String str2 = str1.concat(" soy");
        System.out.println(str2);
   
        // guarda en str3 el str2 concatenado con center
        String str3 = str2.concat(" Juan");
        System.out.println(str3);
   }
}

