import java.util.Scanner;

public class Bishop {
    public static void main(String []args){
        Scanner in=new Scanner(System.in);
        while(in.hasNextInt()){
            System.out.println(get(in.nextInt()));
        }

    }
    public static int get(int a){
        if(a<1){
            return 0;
        }
        if(a<2){
            return 1;
        }
        return 2*(a-1);
    }
}
