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
     

      try {
        Writer writer = new PrintWriter("C://test3.txt");
         // write a string llo wor
         writer.write(str,2,7);

         // flush the writer. 
         writer.flush();
         writer.close();

     
      } catch (IOException ex) {
         ex.printStackTrace();
      }
   }
}