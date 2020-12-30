import java.util.Scanner;

public class Baby {
    public static void main(String []args){
        Scanner in= new Scanner(System.in);
        int size=Integer.parseInt(in.nextLine());
        String line=in.nextLine();
        Scanner inline=new Scanner(line);
        boolean yoyo=true;
        int count=1;
        while(inline.hasNext() && yoyo==true){
            String word=inline.next();
            if(word.equals("mumble")){
            }
            else{
                int w=Integer.parseInt(word);
                if(count!=w){
                    yoyo=false;
                }
            }
            count++;
        }
        if(yoyo){
            System.out.println("makes sense");
        }
        else{
            System.out.println("something is fishy");
        }
    }
}
