import java.util.Scanner;

public class Autori {
    public static void main(String []args){
        Scanner in=new Scanner(System.in);
        while(in.hasNextLine()){
            String result="";
            String nextLine=in.nextLine();
            Scanner in=new Scanner(nextLine);
            in.useDelimiter("-");
            while(in.hasNext()){
                result+=in.next().charAt(0);
            }
            System.out.println(result);
        }
    }
}

