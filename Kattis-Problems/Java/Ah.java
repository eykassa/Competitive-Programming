import java.util.Scanner;
public class Ah {
    public static void main(String []args){
        Scanner in= new Scanner(System.in);
        while(in.hasNextLine()){
            String person=in.nextLine();
            String doctor=in.nextLine();
            if(person.length()>=doctor.length()){
                System.out.println("go");
            }
            else{
                System.out.println("no");
            }
        }
    }
}
