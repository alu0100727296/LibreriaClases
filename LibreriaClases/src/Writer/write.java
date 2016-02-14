package Writer;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
/**
 *
 * @author julian Tanausu
 */
public class write {
    public static void main(String[] args) {
      String str = "Hello world!";

      // create a new writer
      Writer writer = new PrintWriter(System.out);

      try {
         // write a string
         writer.write(str);

         // flush the writer
         writer.flush();

     
      } catch (IOException ex) {
         ex.printStackTrace();
      }
   }
}