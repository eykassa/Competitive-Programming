import java.util.*;

public class Bacon {
    public static void main(String []args){
        Scanner in=new Scanner(System.in);
        while(in.hasNextLine()){
            Map<String, List<String>> list=new TreeMap<>();
            int order=Integer.parseInt(in.nextLine());
            for(int i=0; i<order; i++){
                String next=in.nextLine();
                Scanner inline=new Scanner(next);
                String name=inline.next();
                while(inline.hasNext()){
                    String word=inline.next();
                    if(list.get(word)==null){
                        List<String>set=new ArrayList<>();
                        set.add(name);
                        list.put(word,set);
                    }
                    else{
                        List<String>set=list.get(word);
                        set.add(name);
                        list.put(word,set);
                    }
                }
            }
            for(String key:list.keySet()){
                System.out.print(key+" ");
                List<String>l=list.get(key);
                Collections.sort(l);
                for(int i=0; i<l.size(); i++) {
                    System.out.print(l.get(i) + " ");
                }
                System.out.println();
            }
           System.out.println();
        }
    }
}
