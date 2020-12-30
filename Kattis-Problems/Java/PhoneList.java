import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PhoneList2 {
    public static void main(String []args){
        Scanner in=new Scanner(System.in);
        int testCase=Integer.parseInt(in.nextLine());
        for(int i=0; i<testCase; i++){
            int lines=Integer.parseInt(in.nextLine());
            ArrayList<String>list=new ArrayList<>();
            for(int j=0; j<lines; j++){
                list.add(in.nextLine());
            }
            Collections.sort(list);
            boolean done=false;
            for(int k=1; k<list.size(); k++){
                String word=list.get(k);
                if(list.get(k).length()>list.get(k-1).length()){
                    if(list.get(k).substring(0,list.get(k-1).length()).equals(list.get(k-1))){
                        done=true;
                    }
                }
                else{
                    if(list.get(k-1).substring(0,list.get(k).length()).equals(list.get(k))){
                        done=true;
                    }
                }
            }
            if(done){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
        }
    }
}
