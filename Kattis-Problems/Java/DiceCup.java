import java.util.*;
class DiceCup {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    String []array=in.nextLine().split(" ");
    int first=Integer.parseInt(array[0]);
    int second=Integer.parseInt(array[1]);
    int start=0;
    int end=0;
    if(first<second){
      start=first+1;
      end=second+1;
    }
    else if(first>second){
      start=second+1;
      end =first+1;
    }
    else{
      start=first+1;
      end=second+1;
    }
    
    for(int i=start; i<end+1; i++){
      System.out.println(i);
      
    }
   
  }
  
}

