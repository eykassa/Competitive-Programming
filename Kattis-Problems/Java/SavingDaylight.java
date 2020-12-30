import java.util.*;
class SavingDaylight {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    while(in.hasNextLine()){
      String []next=in.nextLine().split(" ");
      String []start=next[3].split(":");
      String []end=next[4].split(":");
      
      int mr=Integer.parseInt(end[1])-Integer.parseInt(start[1]);
      int hr=Integer.parseInt(end[0])-Integer.parseInt(start[0]);
      if(mr<0){
        hr--;
        mr+=60;
       }
      
      if(hr<0){
        hr=24-hr;
      }
      
      System.out.print(next[0]+" "+next[1]+" "+next[2]+" ");
      System.out.println(hr+" hours "+mr+" minutes");
      
      
    }
   
  }
  
