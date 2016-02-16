
package InputStream;
import java.io.FileInputStream;
import java.io.InputStream;
/**
 *
 * @author Julian Tanusu
 */
public class read {
  public static void main(String[] args) throws Exception {
      
      InputStream is = null;
      byte[] buffer=new byte[5];
      char c;
      
      try{
         // new input stream created
         is = new FileInputStream("C://test.txt");
         
         System.out.println("Characters printed:");
         
         // read stream data into buffer
         is.read(buffer);
         
         // for each byte in the buffer
         for(byte b:buffer)
         {
            // convert byte to character
            c=(char)b;
            
            // prints character
            System.out.print(c);
         }
      }catch(Exception e){
         
         // if any I/O error occurs
         e.printStackTrace();
      }finally{
         
         // releases system resources associated with this stream
         if(is!=null)
            is.close();
      }
   }
}