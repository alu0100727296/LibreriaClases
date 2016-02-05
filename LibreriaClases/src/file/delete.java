package file;
import java.io.File;
/**
 *
 * @author julian Tanausu
 */
public class delete {
    public static void main(String[] args) {
        File f = null;
           
        try{
            // create new file
            f = new File("test.txt");
           
            // prints
            System.out.println("File deleted: "+f.delete());
         
            // creates file in the system
            f.createNewFile();
        
            // createNewFile() is invoked
            System.out.println("createNewFile() method is invoked");
         
            // print
            System.out.println("File deleted: "+f.delete());
            
        }catch(Exception e){
            // if any error occurs
            e.printStackTrace();
        }
    }
}
