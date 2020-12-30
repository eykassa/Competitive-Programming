import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddingWords {
    public static void main(String []args){
        Scanner in=new Scanner(System.in);
        Map<String,Integer> map=new HashMap<>();
        while(in.hasNextLine()){
            String next=in.nextLine();
            String []array=next.split(" ");

            if(array[0].equalsIgnoreCase("def")){
                map.put(array[1],Integer.parseInt(array[2]));
            }
            else if(array[0].equalsIgnoreCase("calc")){
                boolean done=false;
                for(int i=1; i<array.length-1; i++){
                    if(array[i].equals("+")||array[i].equals("-")){

                    }
                    else{
                        if(map.get(array[i])==null) {
                            done = true;
                        }
                    }
                }
                if(done){
                    for(int i=1; i<array.length; i++){
                        System.out.print(array[i]+" ");
                    }
                    System.out.println("unknown");
                }
                else{
                    int value=0;
                    String sign="";
                    String found="";
                    for(int i=1; i<array.length-1; i++){
                        String n=array[i];
                        if(n.equals("+")||n.equals("-")){
                            sign=n;
                        }
                        else{
                            if(sign.equals("+")){
                                value+=map.get(n);
                            }
                            else if(sign.equals("-")){
                                value-=map.get(n);
                            }
                            else{
                                value+=map.get(n);
                            }
                        }
                    }
                    for(String s:map.keySet()){
                        if(map.get(s)==value){
                            found=s;
                        }
                    }
                    for(int i=1; i<array.length; i++){
                        System.out.print(array[i]+" ");
                    }
                    if(found.length()==0) {
                        System.out.println("unknown");
                    }
                    else{
                        System.out.println(found);
                    }
                }
            }
            else if(array[0].equals("clear")){
                map=new HashMap<>();
            }
        }
    }
}
