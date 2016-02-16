package InputStream;

import java.io.FileInputStream;
import java.io.InputStream;

/**
 *
 * @author Julian Tanusu
 */
public class skip {
     public static void main(String[] args) throws Exception {
      
      InputStream is = null;
      int i;
      char c;
      
      try{
         // new input stream created
         is = new FileInputStream("C://test.txt");
         
         while((i=is.read())!=-1)
         {
            // converts int to char
            c=(char)i;
            
            // prints character
            System.out.println("Character Read: "+c);
            
            // skip one byte
            is.skip(1);
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
