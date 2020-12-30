import java.io.*;
import java.util.*;

public class TheEasiestProblmeIsThisOne{
    public static void main(String[] args){
      Scanner in=new Scanner(System.in);
      while(in.hasNextLine()){
        int next=Integer.parseInt(in.nextLine());
        if(next==0){
          break;
        }
        int answer=sd(next);
        boolean done=false;
        int start=11;
        while(!done){
          int result=next*start;
          if(sd(result)==answer){
            System.out.println(start);
            done=true;
            break;
          }
          start++;
         
        }
      }
        
      
    }
public static int sd(int n) {
        int res = 0;
        while(n > 0) {
            res += n % 10;
            n /= 10;
        }
        return res;
    }  
}
