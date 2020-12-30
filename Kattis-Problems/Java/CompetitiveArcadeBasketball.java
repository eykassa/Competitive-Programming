import java.util.*;
class CompetitiveArcadeBasketball {
    public static void main(String []args){
        Scanner in= new Scanner(System.in);
        String line=in.nextLine();
        Scanner l=new Scanner(line);
        int people=l.nextInt();
        int score=l.nextInt();
        int numberOfLines=l.nextInt();
        Map<String,Integer>map=new HashMap<>();
        for(int i=0; i<people; i++){
            map.put(in.nextLine(),0);
        }
        boolean done=false;

        for(int i=0; i<numberOfLines; i++){
            String next=in.nextLine();
            Scanner inline=new Scanner(next);
            String name=inline.next();
            int s=inline.nextInt()+map.get(name);
            if(s>=score){
                System.out.println(name+" wins!");
                done=true;
            }
            map.put(name,s);
        }
        if(!done){
            System.out.println("No winner!");
        }


    }
}
