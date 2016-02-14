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
         // new input stream created
         is = new FileInputStream("C://test.txt");
         
          // invoke available
         i = is.available();
               
         // number of bytes available is printed
         System.out.println(i);
             
       
           
      }catch(Exception e){
         
         // if any I/O error occurs
         System.out.print("Sorry, the input stream is closed");
      }finally{
         
         // releases system resources associated with this stream
         if(is!=null)
            is.close();
      }
   }
}
