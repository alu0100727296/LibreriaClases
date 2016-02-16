package String;
import java.lang.*;
/**
 *
 * @author Julian Tanusu
 */
public class concat {
    public static void main(String[] args) {
  
        // print str1
        String str1 = "self";
        System.out.println(str1);
 
        // print str2 concatenated with str1
        String str2 = str1.concat(" learning");
        System.out.println(str2);
   
        // prints str3 concatenated with str2(and str1)
        String str3 = str2.concat(" center");
        System.out.println(str3);
   }
}

