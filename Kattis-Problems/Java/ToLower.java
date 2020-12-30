import java.util.*;

class ToLower {
  
  public static void main(String[] args) {
    
    Scanner in=new Scanner(System.in);
    int problems=in.nextInt();
    int cases=in.nextInt();
    int count=0;
    for(int i=0; i<problems; i++){
      boolean done=true;
      for(int j=0; j<cases; j++){
        String word=in.next();
        String check=word.toLowerCase();
        String check2=""+word.charAt(0);
        check2=check2.toLowerCase();
        check2+=word.substring(1,word.length());
        if(word.equals(check)||check2.equals(check)){
          
        }
        else{
          done=false;
        }
      }
      if(done){
        count++;
      }
      
    }
    System.out.println(count);
  }
  
}
