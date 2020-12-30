import java.math.BigInteger;
import java.util.Scanner;

public class Quality {
    public static void main(String []args){
        Scanner in= new Scanner(System.in);
        int size=Integer.parseInt(in.nextLine());
        float sum=0;
        for(int i=0; i<size; i++){
            String next=in.nextLine();
            Scanner inline=new Scanner(next);
            while(inline.hasNextDouble()){
                sum+=(Float.parseFloat(inline.next())*Float.parseFloat(inline.next()));
            }
        }
        System.out.println(sum);
    }
}
