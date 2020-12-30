import java.io.*;
import java.util.*;

public class HelloCodiva{
    public static void main(String[] args){
      Scanner in=new Scanner(System.in);
      int num=Integer.parseInt(in.nextLine());
      if(num%2==0){
        System.out.println("Bob");
      }
      else{
        System.out.println("Alice");
      }
      
    }
}
