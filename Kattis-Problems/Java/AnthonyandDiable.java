import java.util.Scanner;

public class Anthony2 {
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        double a=scan.nextDouble();
        double d=scan.nextDouble();
        double area=(d*d)/(4*Math.PI);
        if(area>=a){
            System.out.println("Diablo is happy!");
        }
        else{
            System.out.println("Need more materials!");
        }
    }

}
