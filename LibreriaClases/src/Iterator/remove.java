package Iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Julian Tanusu
 */
public class remove {
    public static void main(String args[]) {
        ArrayList<String> lista = new ArrayList<String>();
        lista.add("Pedro");
        lista.add("Olga");
        lista.add("Miguel");
        lista.add("Antonio");
        lista.add("Pedro");
       
        /*
        for (String nombre : lista) {
            if (nombre.equals("Pedro")) {
               lista.remove("Pedro");
            }
 
        }
        ERORRR
        */
        
        Iterator<String> it= lista.iterator();
 
        while(it.hasNext()) {

            String nombre= it.next();
            if (nombre.equals("Pedro")) {
                it.remove();
        }
        }
        
        for (String nombre : lista) {
           System.out.println(nombre);
        }
        
    }
}
