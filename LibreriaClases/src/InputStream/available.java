/*
método devuelve un número de bytes que se pueden leer de este flujo de entrada 
sin bloquear por la siguiente invocación de un método de este flujo de entrada.
*/
package InputStream;
import java.io.FileInputStream;
import java.io.InputStream;
/**
 *
 * @author julian Tanausu
 */
public class available {
    public static void main(String[] args) throws Exception {
      InputStream is = null;
      int i=0;
            
      try{
         // creacion objeto InputStram
         is = new FileInputStream("C://test.txt");
         
          // llamamos al metodo available
         i = is.available();
               
         // imprimimos el numero de bytes disponibles
         System.out.println(i);
             
       
           
      }catch(Exception e){
         
         // si ha ocurrido algun error
         System.out.print("Sorry, the input stream is closed");
      }
   }
}
