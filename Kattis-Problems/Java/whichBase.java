import java.util.Scanner;

public class whichBase {
    public static void main(String []args){
        Scanner in=new Scanner(System.in);
        int cases=Integer.parseInt(in.nextLine());
        for(int i=0; i<cases; i++){
            int num=in.nextInt();
            String value=""+in.nextInt();
            System.out.print(num+" ");
            int octal=0;
            boolean done=false;
            int decimal=0;
            int hexa=0;
            int pos=0;
            for(int j=value.length()-1; j>=0; j--){
                int next=Integer.parseInt(""+value.charAt(j));
                if(next>=8){
                    done=true;
                    octal=0;
                }
                else if(!done){
                    octal+=next*Math.pow(8,pos);

                }
                hexa+=next*Math.pow(16,pos);
                pos++;
            }
            System.out.println(octal+" "+value+" "+hexa);
        }
    }

}
