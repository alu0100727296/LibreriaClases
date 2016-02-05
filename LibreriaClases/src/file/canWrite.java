package file;
import java.io.File;
/**
 *
 * @author julian Tanausu
 */
public class canWrite {
    public static void main(String[] args) {
        File f = null;
	      
	try{
	    // create new file
	    f = new File("c:/test.txt");
	         
	    System.out.println("canWrite: "+f.canWrite());
	         
	}catch(Exception e){
	    // if any I/O error occurs
	    e.printStackTrace();
	}

    }
}
