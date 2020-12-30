import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Pizza {
    public static void main(String []args){
       Scanner in=new Scanner(System.in);
       Scanner inline=new Scanner(in.nextLine());
       int total=(int)fix(Double.parseDouble(inline.next())*100);
       int pita=(int)fix(Double.parseDouble(inline.next())*100);
       int pizza=(int)fix(Double.parseDouble(inline.next())*100);
       Map<Integer, Integer> map=new HashMap<>();
       for(int i=0; i<=total/pizza; i++){
           map.put(pizza*i,i);
       }
       int count=0;
       for(int j=0; j<=total/pita;j++){
           int value=pita*j;
           if((map.get(total-value)!=null)){
               System.out.println(j+" "+map.get(total-value));
               count++;
           }
       }
       if(count==0){
           System.out.println("none");
       }
    }
    private static double fix(double a) {
        return Math.round(a * 100) / 100d;
    }
}
