import java.util.*;
import java.util.stream.Collectors;

public class WareHouse {
    public static void main(String []args){
        Scanner in=new Scanner(System.in);
        int cases=Integer.parseInt(in.nextLine());
        for(int i=0; i<cases; i++){
            Map<String,Integer> map=new TreeMap<>();

            int products=Integer.parseInt(in.nextLine());
            for(int j=0; j<products; j++){
                String []next=in.nextLine().split(" ");
                if(map.get(next[0])==null){
                    map.put(next[0],Integer.parseInt(next[1]));
                }
                else{
                    map.put(next[0],map.get(next[0])+Integer.parseInt(next[1]));
                }

            }
            System.out.println(map.size());
            map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(x->System.out.println(x.toString().replace("="," ")));
        }
    }

}
