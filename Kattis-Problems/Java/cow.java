import java.util.Scanner;

public class Cow {
    public static void main(String []args){
        Scanner in=new Scanner(System.in);
        double num=Double.parseDouble(in.nextLine());
        num=(4*Math.sqrt(num));
        System.out.println(num);
    }
}
