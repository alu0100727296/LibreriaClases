package String;
import java.lang.*;
/**
 *
 * @author Julian Tanusu
 */
public class contentEquals {
   public static void main(String[] args) {

   String str1 = "amrood admin", str2 = "345";
   CharSequence cs = "amrood admin";
    
   System.out.println("Method returns: " + str1.contentEquals
   ("amrood admin"));
    
   /* String represents the same sequence of char values as the
   specified sequence */
   System.out.println("Method returns: " + str1.contentEquals(cs));
  
   /* String represents different sequence of char values as the
   specified sequence */
   System.out.println("Method returns: " + str2.contentEquals("12345"));
   }
}
