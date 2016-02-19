package Reader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
/**
 *
 * @author julian Tanausu
 */
public class read {
    public static void main(String[] args) {

        String s = "Hello World";

        // create a new StringReader
        Reader reader = new StringReader(s);

        try {
            // read the first five chars
            for (int i = 0; i < 5; i++) {
                char c = (char) reader.read(); // cambio a char, ya que read devuelve int
                System.out.print("" + c);
            }
            // change line
            System.out.println();

            // close the stream
            reader.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
