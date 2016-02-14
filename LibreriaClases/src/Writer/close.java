package Writer;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
/**
 *
 * @author julian Tanausu
 */
public class close {
   public static void main(String[] args) {
      String s = "Hello World";

      // create a new writer
      Writer writer = new PrintWriter(System.out);

      try {
         // append a string
         writer.append(s);

         // flush the writer
         writer.flush();

         // append a new string
         writer.append("\nThis is an example");

         // flush and close the stream
         writer.close();

      } catch (IOException ex) {
         ex.printStackTrace();
      }
   }
}
