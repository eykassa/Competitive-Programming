import java.util.Scanner;

public class Datum {
    public static void main(String []args){
        Scanner in=new Scanner(System.in);
        int day=in.nextInt();
        int year=in.nextInt();
        int []array={31,28,31,30,31,30,31,31,30,31,30,31};
        String []days={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        int result=3;
        for(int i=0; i<year-1; i++){
            result+=array[i];
        }
        result+=day;

        System.out.println(days[result%7]);


    }
}
