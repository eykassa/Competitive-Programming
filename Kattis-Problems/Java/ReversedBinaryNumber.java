import java.util.Scanner;

public class Binary {
    public static void main(String []args){
        Scanner in=new Scanner(System.in);
        int num=Integer.parseInt(in.nextLine());
        String binary="";
        while(num!=0) {
            double r = num % 2;
            if (r == 0) {
                binary += "0";
            } else {
                binary += "1";
            }
            num = num / 2;
        }
        int sum=0;
        int pos=0;
        for(int i=binary.length()-1; i>=0;i--){
            int n=Integer.parseInt(""+binary.charAt(i));
            sum+=n*(Math.pow(2,pos));
            pos++;
        }
        System.out.println(sum);
    }
}
