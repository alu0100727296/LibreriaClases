package String;
import java.lang.*;
/**
 *
 * @author Julian Tanusu
 */
public class endsWith {
    public static void main(String[] args) {
  
   String str = "www.tutorialspoint.com";
   System.out.println(str);

   // el final del string para ser chequeado
   String endstr1 = ".com";
   String endstr2 = ".org";

   // cheaue los strings
   boolean retval1 = str.endsWith(endstr1);
   boolean retval2 = str.endsWith(endstr2);

   // retorna true o false
   System.out.println("ends with " + endstr1 + " ? " + retval1);
   System.out.println("ends with " + endstr2 + " ? " + retval2);
   }
}
