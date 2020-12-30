import java.util.Scanner;

public class OneOnone {
    public static void main(String []args){
        Scanner in= new Scanner(System.in);
        String line=in.nextLine();
        int a=0;
        int b=0;
        int pos=0;
        while(pos<line.length()){
            String person=""+line.charAt(pos);
            int value=Character.getNumericValue(line.charAt(pos+1));
            pos+=2;
            if(person.equalsIgnoreCase("A")){
                a+=value;
                if(a>=11&&(a-b>=2)){
                    System.out.println("A");
                    break;
                }
            }
            else {
                b+=value;
                if(b>=11&&(b-a>=2)){
                    System.out.println("B");
                    break;
                }
            }
        }
    }

}
