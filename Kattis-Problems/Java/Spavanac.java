import java.io.*;
import java.util.*;

public class HelloCodiva{
    public static void main(String[] args){
      Scanner in=new Scanner(System.in);
      int num=in.nextInt();
      int num2=in.nextInt();
      
      int result=num2-45;
      if(result<0){
        num--;
        result+=60;
      }
      if(num<0){
        num=23;
      }
      
      System.out.println(num+" "+result);
    }
}
