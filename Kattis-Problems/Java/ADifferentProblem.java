import java.util.Scanner;

public class A {
    public static void main(String []args){
        Scanner in=new Scanner(System.in);
        while(in.hasNextLine()){
            String line=in.nextLine();
            Scanner inline=new Scanner(line);
            while(inline.hasNext()){
                System.out.println(Math.abs(Long.parseLong(inline.next())-Long.parseLong(inline.next())));
            }
        }
    }
}
