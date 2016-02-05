package file;
import java.io.File;
/**
 *
 * @author julian Tanausu
 */
public class createNewFile {
    public static void main(String[] args) {
      
        File f = null;
    
        try{
            // create new file
            f = new File("test.txt");
         
            // creates file in the system
            f.createNewFile();
        
            // createNewFile() is invoked
            System.out.println("createNewFile() method is invoked");
         
        }catch(Exception e){
            // if any error occurs
            e.printStackTrace();
        }
    }
}
