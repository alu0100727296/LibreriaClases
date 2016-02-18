/*
Crea un fichero en el cual escribe hello
*/
package OutputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *
 * @author Julian Tanusu
 */
public class write {
    public static void main(String[] args) {
      byte[] b = {'h', 'e', 'l', 'l', 'o'};
      try {

         // creamos outputSrtram para escribir
         OutputStream os = new FileOutputStream("test2.txt");

         // creamos inputStream para leer
         InputStream is = new FileInputStream("test2.txt");

         // escribiendo algo
         os.write(b);

         // leemos lo que se escribio
         for (int i = 0; i < b.length; i++) {
            System.out.print("" + (char) is.read());
         }

      } catch (Exception ex) {
         ex.printStackTrace();
      }


   }
}
