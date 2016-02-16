package PrintStream;

import java.io.PrintStream;

/**
 *
 * @author Julian Tanusu
 */
public class append {
    public static void main(String[] args) {
      char c = 'A';

      // create printstream object
      PrintStream ps = new PrintStream(System.out);

      // append our characters
      ps.append(c);
      ps.append('y');
      ps.append('m');

      // print the result
      ps.flush();
      ps.close();

   }
}