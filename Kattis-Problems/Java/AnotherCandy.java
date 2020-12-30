import java.util.Scanner;

public class AnotherCandy {
    public static void main(String []args){
        Scanner in= new Scanner(System.in);
        int testCases=Integer.parseInt(in.nextLine());
        for(int i=0; i<testCases; i++){
            in.nextLine();
            int num=Integer.parseInt(in.nextLine());
            int result=0;
            for(int j=0; j<num; j++){
                result+=Integer.parseInt(in.nextLine());
            }
            if(num!=0&&result%num==0){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
