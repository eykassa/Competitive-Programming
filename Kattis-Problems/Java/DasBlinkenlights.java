import java.util.*;
class DasBlinkenlights {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    String []array=in.nextLine().split(" ");
    int p=Integer.parseInt(array[0]);
    int q=Integer.parseInt(array[1]);
    int sum=Integer.parseInt(array[2]);
    boolean done=false;
    
    for(int i=1; i<=sum; i++){
      boolean f=false;
      boolean s=false;
      
      if(i%p==0){
        f=true;
      }
      if(i%q==0){
        s=true;
      }
      
      if(f&&s){
        System.out.println("yes");
        done=true;
        break;
      }
      
      
     }
    if(!done){
      System.out.println("no");
    }
   
  }
  
}
