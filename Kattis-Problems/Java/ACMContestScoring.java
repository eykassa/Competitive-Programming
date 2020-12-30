import java.util.*;
class ACMContestScoring {
  public static void main(String []args){
    Scanner in= new Scanner(System.in);
    String next=in.nextLine();
    int count=0;
    int result=0;
    Map<String,Integer>map=new TreeMap<>();
    while(!next.equals("-1")){
      Scanner inline=new Scanner(next);
        int time=inline.nextInt();
        String question=inline.next();
        String statues=inline.next();
        if(statues.equals("right")){
          count++;
          if(map.get(question)==null){
            result+=time;
          }
          else{
            result+=time+(20*map.get(question));
          }
        }
        else{
          if(map.get(question)==null){
            map.put(question,1);
          }
          else{
            map.put(question,(map.get(question)+1));
          }
        }
        next=in.nextLine();
        
     }
    System.out.println(count+" "+result);
      
  }
}
