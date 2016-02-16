
package Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 *
 * @author Julian Tanusu
 */
public class hasNext {
    public static void main(String args[]) {
        // Create an array list
        ArrayList<String> lista = new ArrayList<String>();
        // add elements to the array list
     
        lista.add("Pedro");
        lista.add("Olga");
        lista.add("Miguel");
        lista.add("Antonio");
        lista.add("Pedro");
        
        Iterator<String> it = lista.iterator();
 
        while (it.hasNext()) {
           System.out.println(it.next());
        }
        
       
    }
}
