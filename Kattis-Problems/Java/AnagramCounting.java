import java.math.BigInteger;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Anagram {
    public static void main(String []args){
        Scanner in=new Scanner(System.in);
        while(in.hasNextLine()){
            String next=in.nextLine();
            Map<String,Integer> map=new TreeMap<>();
            for(int i=0; i<next.length(); i++){
                String ch=""+next.charAt(i);
                if(map.get(ch)==null){
                    map.put(ch,1);
                }
                else{
                    map.put(ch,map.get(ch)+1);
                }
            }
            BigInteger d=new BigInteger("1");
            for(String k:map.keySet()){
                d=d.multiply(factorial(map.get(k)));
            }
            BigInteger num=factorial(next.length());
            System.out.println(num.divide(d));

        }
    }
    public static BigInteger factorial(int num){
        BigInteger bigN = new BigInteger("1");

        for (int i = 2; i <= num; i++)
            bigN = bigN.multiply(BigInteger.valueOf(i));

        return bigN;
    }
}

