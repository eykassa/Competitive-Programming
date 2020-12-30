import java.util.*;
class Parking {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int cases=Integer.parseInt(in.nextLine());
    
    for(int i=0; i<cases; i++){
      in.nextLine();
      String []array=in.nextLine().split(" ");
      int []array2=new int[array.length];
      for(int j=0; j<array.length; j++){
        array2[j]=Integer.parseInt(array[j]);
      }
      Arrays.sort(array2);
      int result=array2[array2.length-1]-array2[0];
      result=result*2;
      System.out.println(result);
      
    }
    
    
    
  }
  
}
