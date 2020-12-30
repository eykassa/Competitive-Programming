import java.util.Scanner;

public class MathProblem {
    public static void main(String []args){
        Scanner in=new Scanner(System.in);
        int first=in.nextInt();
        int second=in.nextInt();
        int third=in.nextInt();
        int total=in.nextInt();
        boolean done=false;
        for(int i=0; i<=total/first; i++){
            for(int j=0; j<=total/second; j++){
                for(int k=0; k<=total/third; k++){
                    if((i*first)+(j*second)+(k*third)==total){
                        System.out.println(i+" "+j+" "+k);
                        done=true;
                    }
                }
            }
        }
        if(!done){
            System.out.println("impossible");
        }
    }
}
