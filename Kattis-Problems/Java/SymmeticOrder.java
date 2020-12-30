import java.util.Scanner;

public class SymmeticOrder {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        int set=1;
        while(in.hasNextLine()){
            int num=Integer.parseInt(in.nextLine());
            if(num==0){
                break;
            }
            String []array=new String[num];
            int end=num-1;
            int r=0;
            if(num%2!=0){
                r=num%2;
                num=num-1;
            }
            for(int i=0; i<num/2; i++){
                array[i]=in.nextLine();
                array[end]=in.nextLine();
                end--;
            }
            if(r!=0) {
                array[end] = in.nextLine();
            }
            System.out.println("SET "+set);
            for(int j=0; j<array.length; j++){
                System.out.println(array[j]);
            }

            set++;


        }

    }
}
