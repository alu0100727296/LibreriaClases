package PrintStream;

import java.io.PrintStream;

/**
 *
 * @author Julian Tanusu
 */
public class checkError {
     public static void main(String[] args) {
      String s = "Hello World.";

      // create a new PrintStream
      PrintStream ps = new PrintStream(System.out);

      // print a string
      ps.println(s);

      // chekea si ocurrieron errores
      ps.print(ps.checkError());
      ps.flush();
      ps.close();

   }
}
