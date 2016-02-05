package file;
import java.io.File;
/**
 *
 * @author julian Tanausu
 */
public class exists {
    public static void main(String[] args) {
      
        File f = null;
        boolean bool = false;
      
        try{
            // create new files
            f = new File("test.txt");
         
            // create new file in the system
            f.createNewFile();
         
            // prints
            System.out.println("File exists: "+f.exists());
         
            if(f.exists() == true){
                // delete() invoked
                f.delete();
                System.out.println("delete() invoked");
            }
      
            // prints
            System.out.print("File exists: "+f.exists());
         
        }catch(Exception e){
            // if any error occurs
            e.printStackTrace();
        }
    }
}
