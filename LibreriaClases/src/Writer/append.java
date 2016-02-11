package Writer;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
/**
 *
 * @author julian Tanausu
 */
public class append {
    public static void main(String[] args) {
        char c = 'A';

        // create a new writer
        Writer writer = new PrintWriter(System.out);

        try {
            // append a char
            writer.append('c');

            // append a new char
            writer.append(c);

            // flush the writer to see the result
            writer.flush();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
