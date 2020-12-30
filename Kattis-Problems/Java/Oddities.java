import java.util.*;
class Oddities {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int cases=Integer.parseInt(in.nextLine());
    for(int i=0; i<cases; i++){
      int num=Integer.parseInt(in.nextLine());
      if(num%2!=0){
        System.out.println(num +" is odd");
      }
      else{
        System.out.println(num+ " is even");
      }
    }
   
  }
  
}
