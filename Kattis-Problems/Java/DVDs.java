import java.util.*;

class DVDs {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    
    int cases=Integer.parseInt(in.nextLine());
    
    for(int i=0; i<cases; i++){
      int num=Integer.parseInt(in.nextLine());
      String []array=in.nextLine().split(" ");
      
      int count=0;
      int number=1; 
      for(String s: array){
        if(number==Integer.parseInt(s)){
          number++;
        }
        else{
          count++;
        }
      }
      System.out.println(count);
      
    }
    
    
  }
  
}
