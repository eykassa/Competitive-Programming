import java.util.*;

public class PokerHand {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Map<String,Integer>map=new TreeMap<>();
        String []array=in.nextLine().split(" ");
        for(int i=0; i<array.length; i++){
            String next=array[i];
            if(map.get(""+next.charAt(0))==null){
                map.put(""+next.charAt(0),1);
            }
            else{
                map.put(""+next.charAt(0),map.get(""+next.charAt(0))+1);
            }
        }
        int max=0;
        for(String s: map.keySet()){
            if(map.get(s)>max){
                max=map.get(s);
            }
        }
        System.out.println(max);

    }
}
