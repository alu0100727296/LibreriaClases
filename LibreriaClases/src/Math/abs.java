package Math;
import java.lang.Math;

/*
 *
 * @author julian Tanausu
 */
public class abs {
    public static void main(String[] args) {
        
        double d1 = -2.55;
	float f2 = (float) 1.5;
	int i1 = -5;
	long l1 = -1000;
	
        
        System.out.println("|" + d1 + "| es " + Math.abs(d1));     
	System.out.println("|" + f2 + "| es " + Math.abs(f2));
	System.out.println("|" + i1 + "| es " + Math.abs(i1));
	System.out.println("|" + l1 + "| es " + Math.abs(l1));
    }
}
