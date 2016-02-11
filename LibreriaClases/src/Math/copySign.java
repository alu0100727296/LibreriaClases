package Math;
import java.lang.Math;
/**
 *
 * @author julian Tanausu
 */
public class copySign {
    public static void main(String[] args) {
        double d1 = -2.55;
	double d2 = 0.7;
	double d3 = 1;
		
	
                
        System.out.println("|" + d2 + "| es " + Math.copySign(d2,d1));
	System.out.println("|" + d2 + "| es " + Math.copySign(d1,d3));
    }
}
