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

         // create a new output stream
         OutputStream os = new FileOutputStream("test2.txt");

         // craete a new input stream
         InputStream is = new FileInputStream("test2.txt");

         // write something
         os.write(b);

         // read what we wrote
         for (int i = 0; i < b.length; i++) {
            System.out.print("" + (char) is.read());
         }

      } catch (Exception ex) {
         ex.printStackTrace();
      }


   }
}
