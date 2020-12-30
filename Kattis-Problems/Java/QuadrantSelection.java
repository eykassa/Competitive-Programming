import java.util.*;
class QuadrantSelection {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int x=Integer.parseInt(in.nextLine());
    int y=Integer.parseInt(in.nextLine());
    
    if(x>=0 && y>=0){
      System.out.println(1);
    }
    else if(x>=0 && y<0){
      System.out.println(4);
    }
    else if(x<=0 && y<=0){
      System.out.println(3);
    }
    else if(x<0 && y>0){
      System.out.println(2);
    }
    
   
  }
  
}
