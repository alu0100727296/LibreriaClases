package BufferedReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Julian Tanusu
 */
public class readLine {
    public static void main(String[] args){
        BufferedReader dataIn = new BufferedReader(new
        InputStreamReader( System.in ) );
        String name = "";
        System.out.print("Escribe tu nombre:");
        try{
            name = dataIn.readLine();
        }catch( IOException e ){
            System.out.println("Error!");
        }
        System.out.println("Hola " + name +"!");
    }
}