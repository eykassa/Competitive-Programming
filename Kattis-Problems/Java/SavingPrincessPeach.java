import java.util.*;
class SavingPrincessPeach {
  
  public static void main(String[] args) {
   
    Scanner in=new Scanner(System.in);
    String []array=in.nextLine().split(" ");
    int total=Integer.parseInt(array[0]);
    int found=Integer.parseInt(array[1]);
    
    HashSet<Integer>list=new HashSet<>();
    for(int i=0; i<found; i++){
      list.add(Integer.parseInt(in.nextLine()));
    }
    
    for(int j=0; j<total;j++){
      if(list.contains(j)){
        
      }
      else{
        System.out.println(j);
      }
    }
    
    System.out.println("Mario got "+list.size()+" of the dangerous obstacles.");
  }
  
}
