
package InputStream;
import java.io.FileInputStream;
import java.io.InputStream;
/**
 *
 * @author Julian Tanusu
 */
public class read {
  public static void main(String[] args) throws Exception {
      
      InputStream is = null;
      byte[] buffer=new byte[5]; // solo quiero leer 5bytes
      char c;
      
      try{
         // creacion objeto InputStream
         is = new FileInputStream("C://test.txt");
         
         System.out.println("Characters printed:");
         
         // metodo leer
         is.read(buffer);
         
         // para cada byte en el buffer
         for(byte b:buffer) {
            // convierto byte a caracter
            c=(char)b;
            // imprimo caracter
            System.out.print(c);
         }
      }catch(Exception e){
         
         // si ocurre algun error
         e.printStackTrace();
      }
   }
}