import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Babelfish {
    public static void main(String []args){
        Scanner in=new Scanner(System.in);
        Map<String,String>map=new TreeMap<>();
        while(in.hasNextLine()){
            String next=in.nextLine();
            if(next.length()==0){
                break;
            }
            Scanner inline=new Scanner(next);
            String n=inline.next();
            map.put(inline.next(),n);
        }
        while(in.hasNextLine()){
            String word=map.get(in.nextLine());
            if(word==null) {
                System.out.println("eh");
            }
            else{
                System.out.println(word);
            }
        }
    }
}
