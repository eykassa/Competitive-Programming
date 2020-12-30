import java.util.Arrays;
import java.util.Scanner;

public class abc {
    public static void main(String []args){
        Scanner in =new Scanner(System.in);
        int []array=new int[3];
        for(int i=0; i<3; i++){
            int next=in.nextInt();
            array[i]=next;
        }
        Arrays.sort(array);
        String word=in.next();
        for(int i=0; i<word.length(); i++){
            if(word.charAt(i)=='A'){
                System.out .print(array[0]);
            }
            else if(word.charAt(i)=='B'){
                System.out.print(array[1]);
            }
            else
                System.out.println(array[2]);
            System.out.print(" ");
        }

    }
}
