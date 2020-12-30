import java.util.Scanner;

public class list {
    public static void main(String []args){
        Scanner in=new Scanner(System.in);
        int number=in.nextInt();
        int count=0;
        int factor=2;
        while(factor*factor<=number){
            if(number%factor==0){
                number=number/factor;
                count++;
            }
            else{
                factor++;
            }
        }
        System.out.println(count+1);

    }

}
