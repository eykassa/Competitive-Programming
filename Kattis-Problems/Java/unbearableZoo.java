import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class UnbearableZoo {
    public static void main(String []args){
     Scanner in=new Scanner(System.in);
     Map<String,Integer> map=new TreeMap<>();
     int lines=Integer.parseInt(in.nextLine());
     int l=1;
     while(in.hasNextLine()&&lines!=0){
         map=new TreeMap<>();
         for(int i=0;i<lines; i++){
            String []array=in.nextLine().toLowerCase().split(" ");
            String name=array[array.length-1];
            if(map.get(name)==null){
                map.put(name,1);
            }
            else{
                map.put(name,map.get(name)+1);
            }
         }
         System.out.println("List "+l+":");
         for(String s: map.keySet()){
             System.out.println(s+" | "+map.get(s));
         }
         l++;

         lines=Integer.parseInt(in.nextLine());
     }


    }
}
