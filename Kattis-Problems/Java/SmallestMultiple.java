import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class SmallestMultiple {
    public static void main(String []args){
        Scanner in=new Scanner(System.in);
        while(in.hasNextLine()){
            String []array=in.nextLine().split(" ");
            BigInteger value = new BigInteger(array[0]);
            for(int i=1; i<array.length; i++){
                value=lcm(value,new BigInteger(array[i]));
            }
            System.out.println(value);

        }
    }
    public static BigInteger lcm(BigInteger sm, BigInteger v){
        BigInteger m=sm.multiply(v);
        return m.divide(sm.gcd(v));
    }
}
