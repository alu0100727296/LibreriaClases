package file;

import java.io.File;

/**
 *
 * @author Julian Tanusu
 */
public class EjemploFile {
    public static void main(String[] args) {
        File f = null;
	    
	try{
	    // create new file
	    f = new File("c:/test.txt");
            System.out.println("canRead: "+f.canRead());// True, ya que existe fichero
            System.out.println("canWrite: "+f.canWrite());// true, puede escribir
            System.out.println("File exists: "+f.exists());// true
            System.out.println("Absolute Pathname "+ f.getAbsolutePath()); // c:\test.txt
            System.out.println("File name: "+f.getName()); // test.txt
	        
	}catch(Exception e){
	    // if any I/O error occurs
	    e.printStackTrace();
	}

    }
}