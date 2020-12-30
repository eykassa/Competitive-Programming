import java.util.Scanner;

public class Avion {
    public static void main(String []args){
        Scanner in=new Scanner(System.in);
        String answer="";
        for(int i=1; i<=5; i++){
            if(in.nextLine().contains("FBI")){
                answer+=i;
                answer+=" ";
            }
        }
        if(answer.length()==0) {
            System.out.println("HE GOT AWAY!");
        }
        else {
            System.out.println(answer);
        }
    }
}

